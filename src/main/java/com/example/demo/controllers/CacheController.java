package com.example.demo.controllers;


import com.example.demo.dto.BaseCacheResponse;
import com.example.demo.dto.CacheRequest;
import com.example.demo.services.CacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cache")
public class CacheController {

    @Autowired
    CacheService cacheService;

    @GetMapping("/getRecord/{key}")
    public BaseCacheResponse getRecord(@PathVariable String key){
        return cacheService.getRecord(key);
    }

    @PostMapping("/insertRecord/{key}")
    public BaseCacheResponse insertRecord(
            @PathVariable String key,
            @RequestBody CacheRequest cacheRequest){
        return cacheService.insertRecord(key, cacheRequest);
    }
}
