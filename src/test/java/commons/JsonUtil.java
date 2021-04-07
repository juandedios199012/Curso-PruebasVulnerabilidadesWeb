package commons;

import org.json.JSONObject;

public class JsonUtil {
    public static String getAttribute(String jsonBody, String attribute){
        JSONObject json = new JSONObject(jsonBody);
        return json.get(attribute).toString();
    }
}