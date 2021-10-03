package com.example.departmentservice.service;

import com.example.departmentservice.entity.Department;
import com.example.departmentservice.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Slf4j
@Service
public class DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;


    public Department saveDepartment(Department department) {
        log.info("Inside service method: saveDepartment");
        return departmentRepository.save(department);
    }

    public Department findByDepartmentId(Long departmentId) {
        log.info("Inside service method: findByDepartmentId");
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
