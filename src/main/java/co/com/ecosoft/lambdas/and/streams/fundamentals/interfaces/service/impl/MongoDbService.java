package co.com.ecosoft.lambdas.and.streams.fundamentals.interfaces.service.impl;

import co.com.ecosoft.lambdas.and.streams.fundamentals.interfaces.service.DatabaseService;

public class MongoDbService implements DatabaseService {

    @Override
    public String getById(long id) {
        return "MongoDB record with id: " + id;
    }

    @Override
    public java.util.List<String> getAllRecords() {
        return java.util.Arrays.asList("MongoDB record 1", "MongoDB record 2", "MongoDB record 3");
    }

}
