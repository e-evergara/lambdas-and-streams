package co.com.ecosoft.lambdas.and.streams.fundamentals.generic;

import co.com.ecosoft.lambdas.and.streams.fundamentals.generic.services.impl.EmployeeServices;
import co.com.ecosoft.lambdas.and.streams.fundamentals.generic.services.impl.ProductServices;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class MainTest {
    public static void main(String[] args) {
        EmployeeServices employeeServices = new EmployeeServices();
        ProductServices productServices = new ProductServices();

        log.info("Obteniendo datos de Employee {}", employeeServices.getById(11L).toString());
        employeeServices.getAllRecords().forEach(item -> log.info("Employee Record: {}", item));

        log.info("********************************************************");

        log.info("Obteniendo datos de Product ", productServices.getById(10L));
        productServices.getAllRecords().forEach(item -> log.info("Product Record: {}", item));
    }

}
