package com.example.demo.utils;

import com.example.demo.dto.BaseCacheResponse;

public class ResponseGenerator {

    public static BaseCacheResponse getBaseCacheResponse() {
        BaseCacheResponse response =  new BaseCacheResponse<Void>();
        response.setResponseMsg("Record inserted successfully");
        return response;
    }

    public static BaseCacheResponse getBaseCacheResponse(String record) {
        BaseCacheResponse response =  new BaseCacheResponse<String>();
        response.setRecord(record);
        response.setResponseMsg("Record fetched successfully");
        return response;
    }
}
