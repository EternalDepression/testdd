package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @ParameterizedTest(name = "#{index} - сложение {0} и {1}, ожидаем {2}")
    @CsvSource({"1, 2, 3"})
    @DisplayName("Проверка суммирования")
    @Tag("param")
    void summ(int a, int b, int expectedResult) {
        Calc calc = new Calc();
        int result = calc.summ(a, b);
        Assertions.assertEquals(expectedResult, result, "Неверный результат");
    }


    @ParameterizedTest(name = "#{index} - вычитание {0} и {1}, ожидаем {2}")
    @CsvSource({"4, 2, 2"})
    @DisplayName("Проверка вычитания")
    @Tag("param")
    void min(int a, int b, int expectedResult) {
        Calc calc = new Calc();
        int result = calc.min(a, b);
        Assertions.assertEquals(expectedResult, result, "Неверный результат");
    }
}