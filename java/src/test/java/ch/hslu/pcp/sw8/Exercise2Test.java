package ch.hslu.pcp.sw8;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Exercise2Test {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    void testPrintNumbersAndSquares() {
        // arrange
        Integer[] testArray = {1, 2, 3, 5, 8};
        var expectedString = """
            1: 1
            2: 4
            3: 9
            5: 25
            8: 64
            """;
        // act
        var sup = new Exercise2();
        sup.printNumbersAndSquares(testArray);
        // assert
        Assertions.assertEquals(expectedString, outContent.toString());
    }
}