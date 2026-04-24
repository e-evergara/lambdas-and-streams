package co.com.ecosoft.lambdas.and.streams.fundamentals.generic.services.impl;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import co.com.ecosoft.lambdas.and.streams.fundamentals.generic.model.Employee;
import co.com.ecosoft.lambdas.and.streams.fundamentals.generic.services.DatabaseService;

public class EmployeeServices implements DatabaseService<Employee> {
    @Override
    public Employee getById(long id) {
        return Employee.builder()
                .dni(UUID.randomUUID().toString())
                .name("Employee " + id)
                .salary(2000.0 )
                .build();
    }

    @Override
    public List<Employee> getAllRecords() {
        return Arrays.asList(
                Employee.builder().dni(UUID.randomUUID().toString()).name("Employee 1").salary(1000.0).build(),
                Employee.builder().dni(UUID.randomUUID().toString()).name("Employee 2").salary(2000.0).build(),
                Employee.builder().dni(UUID.randomUUID().toString()).name("Employee 3").salary(3000.0).build());
    }
}