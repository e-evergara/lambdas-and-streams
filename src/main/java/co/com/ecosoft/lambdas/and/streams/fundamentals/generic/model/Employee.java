package co.com.ecosoft.lambdas.and.streams.fundamentals.generic.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Employee {

    private String dni;
    private String name;
    private Double salary;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}