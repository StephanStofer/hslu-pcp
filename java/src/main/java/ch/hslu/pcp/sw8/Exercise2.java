package ch.hslu.pcp.sw8;

import java.util.Arrays;

public class Exercise2 {

    public void printNumbersAndSquares(Integer[] numbers) {
        Arrays.stream(numbers).forEach(element -> System.out.println(element + ": " + element * element));
    }
}
