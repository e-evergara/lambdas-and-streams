package co.com.ecosoft.lambdas.and.streams.fundamentals.interfaces;

import co.com.ecosoft.lambdas.and.streams.fundamentals.interfaces.service.DatabaseService;
import co.com.ecosoft.lambdas.and.streams.fundamentals.interfaces.service.impl.MongoDbService;
import co.com.ecosoft.lambdas.and.streams.fundamentals.interfaces.service.impl.PostgreSqlService;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class MainTest {
    public static void main(String[] args) {
        DatabaseService mongo = new MongoDbService();
        DatabaseService postgres = new PostgreSqlService();

        log.info("Obteniendo datos de MongoDB {}", mongo.getById(10L));
        postgres.getAllRecords().forEach(item -> log.info("PostgreSQL Record: {}", item));

        log.info("********************************************************");

        log.info("Obteniendo datos de PostgreSQL ", postgres.getById(20L));
        postgres.getAllRecords().forEach(item -> log.info("PostgreSQL Record: {}", item));
    }
}
