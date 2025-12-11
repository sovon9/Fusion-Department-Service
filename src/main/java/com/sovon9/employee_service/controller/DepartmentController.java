package com.sovon9.employee_service.controller;

import com.sovon9.employee_service.entities.Department;
import com.sovon9.employee_service.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Map;

@Controller
public class DepartmentController {

    @Autowired
    private DepartmentRepository departmentRepository;

    @QueryMapping("departments")
    public List<Department> departments(@Argument Map<String, Object> where)
    {
        return departmentRepository.findAll();
    }

    @QueryMapping("departmentByById")
    public List<Department> departmentByById(@Argument List<Long> id)
    {
        return departmentRepository.findAllById(id);
    }

}
