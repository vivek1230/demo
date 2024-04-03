package com.example.demo.services.impl;

import com.example.demo.dto.BaseCacheResponse;
import com.example.demo.dto.CacheRequest;
import com.example.demo.services.CacheService;
import com.example.demo.utils.ResponseGenerator;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;


@Service
public class CacheServiceImpl implements CacheService {

    Map<String, String> cache = new HashMap<>();

    @Override
    public BaseCacheResponse insertRecord(String key, CacheRequest cacheRequest) {
        cache.put(key, cacheRequest.getRecord());
        return ResponseGenerator.getBaseCacheResponse();
    }


    @Override
    public BaseCacheResponse getRecord(String key) {
        String record = cache.get(key);
        return ResponseGenerator.getBaseCacheResponse(record);
    }
}
