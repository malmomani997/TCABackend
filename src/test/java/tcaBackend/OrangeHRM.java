import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.http.ContentType;

public class OrangeHRMTest {

    @Test
    public void deleteCandidateRecord() {
        RestAssured.baseURI = "https://opensource-demo.orangehrmlive.com/web/index.php/recruitment/viewCandidates";
        String candidateIdToDelete = "123";

        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .delete("/" + candidateIdToDelete);

        int statusCode = response.getStatusCode();
        System.out.println("Delete Request Status Code: " + statusCode);
        // Add assertions here to validate the response as needed.
    }

    @Test
    public void addCandidate() {
        RestAssured.baseURI = "https://opensource-demo.orangehrmlive.com/web/index.php/recruitment/viewCandidates";
        String candidateData = "{\"firstName\": \"John\", \"lastName\": \"Doe\", \"email\": \"john.doe@example.com\"}";

        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .body(candidateData)
                .post();

        int statusCode = response.getStatusCode();
        System.out.println("Add Candidate Request Status Code: " + statusCode);
        // Add assertions here to validate the response as needed.
    }

    // You can add more @Test methods for additional test cases as needed

    @Test
    public void searchForCandidate() {
        RestAssured.baseURI = "https://opensource-demo.orangehrmlive.com/web/index.php/recruitment/viewCandidates";

        // Define your search criteria and perform the search

        // Add assertions to validate the search results
    }
}
