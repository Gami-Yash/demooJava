package com.example.demo.repository;

import com.example.demo.model.ApiName;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApiNameRepository extends JpaRepository<ApiName, Long> {
}
