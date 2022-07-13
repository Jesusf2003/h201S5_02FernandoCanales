package com.azureml.service;

import com.azureml.domain.Aproval;

public interface AprovalService {

    void sendRequest(String data);
	String consultApi(Aproval aproval);
}