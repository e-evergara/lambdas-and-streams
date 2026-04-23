package co.com.ecosoft.lambdas.and.streams.fundamentals.interfaces.service;

import java.util.List;

public interface DatabaseService {
    String getById(long id);

    List<String> getAllRecords();
}