package tcaBackend;

import io.restassured.path.json.JsonPath;

public class ReusableMethods {

    public static String rawToJsonString(String response , String wantedField ){
        JsonPath js = new JsonPath(response);
        return js.get(wantedField);
    }


    public static int rawToJsonInteger(String response , String wantedField ){
        JsonPath js = new JsonPath(response);
        return js.get(wantedField);
    }
}
