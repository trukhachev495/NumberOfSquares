package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvSource({
            "Max limit values ,9800,9802,1",
            "Averages values,3000,5000,16",
            "No min values,0,99,0",
            "No max values,9802,1000,0",
            "Maximum number of values,100,9801,90",
            "Random numbers, 250,8888,79"
    })

    public void numberofsquares(String nameTest, int start, int end, int expected) {
        SQRService calculate = new SQRService();
        int actual = calculate.numberofsquares(start, end);

        Assertions.assertEquals(expected, actual);
        System.out.println(expected == actual);

    }

}
