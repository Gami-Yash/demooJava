package com.example.demo.controller;

import com.example.demo.model.ApiName;
import com.example.demo.repository.ApiNameRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiNameController {

    private final ApiNameRepository apiNameRepository;

    public ApiNameController(ApiNameRepository apiNameRepository) {
        this.apiNameRepository = apiNameRepository;
    }

    @GetMapping("/names")
    public List<ApiName> getNames() {
        return apiNameRepository.findAll();
    }
}
