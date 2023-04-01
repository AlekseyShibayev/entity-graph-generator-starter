package com.company.app.core.tools.api;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public interface DataExtractorService {

	String getFileAsString(String fileName);

	Map<String, String> getProperties(String fileName);

	String getHtmlResponse(String urlName);

	JSONObject getJsonObject(JSONObject jsonObject, String searchString);

	JSONArray getJsonArray(JSONObject jsonObject, String searchString);
}