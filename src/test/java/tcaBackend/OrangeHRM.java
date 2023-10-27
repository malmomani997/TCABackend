package tcaBackend;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import static io.restassured.RestAssured.*;

public class OrangeHRM {

    int candidateID;
    String candidateName;

    @BeforeMethod
    public void baseURI() {
        RestAssured.baseURI = "https://opensource-demo.orangehrmlive.com";
    }

    @Test
    public void addCandidate() {
        String addCandidateResponse = given().header("Cookie", "orangehrm=92f9dca60d7478507ac75e545964b012").body(Payload.addCandidate()).contentType(ContentType.JSON)
                .when().post("/web/index.php/api/v2/recruitment/candidates")
                .then().log().all().assertThat().statusCode(200).extract().response().asString();

        System.out.println(addCandidateResponse);
        candidateID = ReusableMethods.rawToJsonInteger(addCandidateResponse, "data.id");
        candidateName = ReusableMethods.rawToJsonString(addCandidateResponse, "data.firstName");
    }

    @Test(dependsOnMethods = "addCandidate")
    public void searchCandidate() {
        String searchResponse = given().queryParam("candidateId", candidateID)
                .queryParam("model", "list").header("Cookie", "orangehrm=92f9dca60d7478507ac75e545964b012")
                .when().get("/web/index.php/api/v2/recruitment/candidates")
                .then().log().all().assertThat().statusCode(200).extract().response().asString();

        System.out.println(searchResponse);
        String firstName   = ReusableMethods.rawToJsonString(searchResponse,"data[0].firstName");
        Assert.assertEquals(candidateName, firstName);
    }

    @Test(dependsOnMethods = {"addCandidate" , "searchCandidate"})
    public void deleteCandidate(){
        given().header("Cookie", "orangehrm=92f9dca60d7478507ac75e545964b012").body(Payload.deleteCandidate(candidateID)).contentType(ContentType.JSON).when().delete("/web/index.php/api/v2/recruitment/candidates")
                .then().log().all().assertThat().statusCode(200);
    }


}
