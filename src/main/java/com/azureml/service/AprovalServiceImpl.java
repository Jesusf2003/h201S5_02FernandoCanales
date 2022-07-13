package com.azureml.service;

import com.azureml.domain.Aproval;

import org.apache.http.client.fluent.*;
import org.apache.http.entity.ContentType;
import org.json.simple.*;
import org.springframework.stereotype.Service;

@Service
public class AprovalServiceImpl implements AprovalService {

    static String API_URL = "";
    static String API_KEY = "";

    @Override
    public void sendRequest(String data) {
        try {
			Content content = Request.Post(API_URL)
					.addHeader("Content-Type", "application/json")
					.addHeader("Authorization", "Bearer " + API_KEY)
					.bodyString(data, ContentType.APPLICATION_JSON)
					.execute().returnContent();
			System.out.println(content);
		} catch (Exception e) {
			System.out.println(e);
		}
    }

    @Override
    public String consultApi(Aproval aproval) {
        JSONArray items = new JSONArray();
		JSONObject obj = new JSONObject();
		JSONObject input1 = new JSONObject();
		JSONObject inputs = new JSONObject();

		obj.put("Column1", aproval.getColumn1());
		obj.put("Column2", aproval.getColumn2());
		obj.put("Column3", aproval.getColumn3());
		obj.put("Column4", aproval.getColumn4());
		obj.put("Column5", aproval.getColumn5());
		obj.put("Column6", aproval.getColumn6());
		obj.put("Column7", aproval.getColumn7());
		obj.put("Column8", aproval.getColumn8());
		obj.put("Column9", aproval.getColumn9());
		obj.put("Column10", aproval.getColumn10());
		obj.put("Column11", aproval.getColumn11());
        obj.put("Column12", aproval.getColumn12());
        obj.put("Column13", aproval.getColumn13());
        obj.put("Column14", aproval.getColumn14());
        obj.put("Column15", aproval.getColumn15());
        obj.put("Column16", aproval.getColumn16());
		
		items.add(obj);
		
		input1.put("input1", items);
		
		inputs.put("Inputs", input1);
		
		sendRequest(inputs.toJSONString());
		return obj.toJSONString();
    }
}