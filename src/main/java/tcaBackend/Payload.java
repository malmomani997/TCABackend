package tcaBackend;

public class Payload {

    public static String addCandidate(){
        return "{\n" +
                "\t\"firstName\": \"Sami\",\n" +
                "\t\"middleName\": \"Ahmad\",\n" +
                "\t\"lastName\": \"Mohammad\",\n" +
                "\t\"email\": \"SamiMohammad@gmail.com\",\n" +
                "\t\"contactNumber\": \"07869454615\",\n" +
                "\t\"keywords\": \"Hey\",\n" +
                "\t\"comment\": \"there\",\n" +
                "\t\"dateOfApplication\": \"2023-10-27\",\n" +
                "\t\"consentToKeepData\": true,\n" +
                "\t\"vacancyId\": 9\n" +
                "}";
    }

    public static String deleteCandidate(int candidateID){
        return String.format("{\n" +
                "    \"ids\" : [%d]\n" +
                "}" , candidateID);
    }
}
