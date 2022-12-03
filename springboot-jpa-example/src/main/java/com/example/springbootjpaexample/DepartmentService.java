package com.example.springbootjpaexample;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {

     // Read operation
    List<Department> fetchDepartmentList();

    Optional<Department> fetchDepartment(Long departmentId);

    // Save operation
    Department saveDepartment(Department department);
    // Update operation
    Department updateDepartment(Department department,
                                Long departmentId);

    // Delete operation
    void deleteDepartmentById(Long departmentId);
}
