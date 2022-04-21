package ch.hslu.pcp.sw8;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class Exercise5Test {

    @Test
    void testCreateRangeSync() {
        var sup = new Exercise5();
        var result = sup.createRange(0,99);
        System.out.println(Arrays.toString(result));
    }

    @Test
    void testCreateRangeParallel() {
        var sup = new Exercise5();
        var result = sup.createRangeParallel(0,99);
        System.out.println(Arrays.toString(result));
    }
}