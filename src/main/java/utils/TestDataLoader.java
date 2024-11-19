package utils;


import io.cucumber.core.internal.com.fasterxml.jackson.core.type.TypeReference;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;


import java.io.File;

import java.io.IOException;
import java.util.List;
import java.util.Map;



public class TestDataLoader {
    public static List<Map<String, String>> loadJSON(String filePath) {
        ObjectMapper mapper = new ObjectMapper();
        List<Map<String, String>> data = null;
        try {
            data = mapper.readValue(new File("testdata.json"), new TypeReference<>() {});
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
}
