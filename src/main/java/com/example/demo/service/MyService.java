package com.example.demo.service;

import com.example.demo.model.ApiName;
import com.example.demo.repository.ApiNameRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyService {
    private final ApiNameRepository repository;

    public MyService(ApiNameRepository repository) {
        this.repository = repository;
    }

    public List<ApiName> getAllEntities() {
        return repository.findAll();
    }
}
