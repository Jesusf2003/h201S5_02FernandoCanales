package com.azureml.service;

import com.azureml.domain.Aproval;
import com.azureml.domain.Output;

public interface AprovalService {

    void sendRequest(String data);
    String consultApi(Aproval aproval);
}