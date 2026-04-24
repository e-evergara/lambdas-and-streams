package co.com.ecosoft.lambdas.and.streams.fundamentals.interfaces.service.impl;

import java.util.List;

import co.com.ecosoft.lambdas.and.streams.fundamentals.interfaces.service.DatabaseService;

public class PostgreSqlService implements DatabaseService {

    @Override
    public String getById(long id) {
        return "Getting data from Postgre ID: " + id;
    }

    @Override
    public List<String> getAllRecords() {
        return List.of("Postgre Sql Record1", "Postgre Sql Record2");
    }

}
