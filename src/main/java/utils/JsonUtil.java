package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import org.json.JSONObject;
import org.json.JSONTokener;

public class JsonUtil{
    public JSONObject jsonObject;
    private File jsonFile;

    public JSONObject getJSON() {
        return jsonObject;
    }

    public JsonUtil setJSON(String path) {
        jsonFile = new File(System.getProperty("user.dir") + "/src/test/resources/" + path);
        jsonObject = readJSONAsJSONObject();
        return this;
    }

    public JSONObject readJSONAsJSONObject() {
        InputStream is = null;
        try {
            is = new FileInputStream(jsonFile);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        JSONTokener jsonTokener = new JSONTokener(is);
        jsonObject = new JSONObject(jsonTokener);
        return jsonObject;
    }
}