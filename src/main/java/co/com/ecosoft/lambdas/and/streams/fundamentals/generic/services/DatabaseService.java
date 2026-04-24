package co.com.ecosoft.lambdas.and.streams.fundamentals.generic.services;

import java.util.List;

public interface DatabaseService<T> {
    T getById(long id);

    List<T> getAllRecords();
}
