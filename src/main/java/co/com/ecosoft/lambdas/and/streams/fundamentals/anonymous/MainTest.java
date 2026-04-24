package co.com.ecosoft.lambdas.and.streams.fundamentals.anonymous;

import co.com.ecosoft.lambdas.and.streams.fundamentals.anonymous.service.OperacionService;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class MainTest {
    public static void main(String[] args) {
        OperacionService suma = new OperacionService() {
            @Override
            public int calcular(int a, int b) {
                return a + b;
            }
        };

        OperacionService resta = new OperacionService() {
            @Override
            public int calcular(int a, int b) {
                return a - b;
            }
        };

        OperacionService multy = (a, b) -> a * b;

        log.info("Resultado de la suma: {}", suma.calcular(5, 3));
        log.info("Resultado de la resta: {}", resta.calcular(5, 3));
        log.info("Resultado de la multiplicación: {}", multy.calcular(5, 3));
    }
}
