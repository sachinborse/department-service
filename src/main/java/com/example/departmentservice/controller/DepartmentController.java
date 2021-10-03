package com.example.departmentservice.controller;

import com.example.departmentservice.entity.Department;
import com.example.departmentservice.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping(value = "/")
    Department saveDepartment(@RequestBody Department department) {
        log.info("Inside controller method: saveDepartment");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long departmentId) {
        log.info("Inside controller method: findDepartmentById");
        return departmentService.findByDepartmentId(departmentId);
    }
}
