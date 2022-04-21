package ch.hslu.pcp.sw8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Exercise3Test {

    @Test
    void testApply() {
        TripleIntOperator sut = (first, second, third) -> Integer.sum(Integer.sum(first, second), third);

        var result = sut.apply(1, 2, 3);

        assertEquals(6, result);
    }
}