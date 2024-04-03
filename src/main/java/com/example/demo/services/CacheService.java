package com.example.demo.services;

import com.example.demo.dto.BaseCacheResponse;
import com.example.demo.dto.CacheRequest;
import org.springframework.stereotype.Service;


@Service
public interface CacheService {
    BaseCacheResponse insertRecord(String key, CacheRequest cacheRequest);

    BaseCacheResponse getRecord(String key);
}
