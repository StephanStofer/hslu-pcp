package ch.hslu.pcp.sw8;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Exercise4Test {

    @Test
    void testProcessNames() {
        var arrayOfStrings = Arrays.array("Susanna", "Joe", "Lu", "Timmy", "Rafael", "Lisa");
        var sup = new Exercise4();
        var result = sup.processNames(arrayOfStrings);

        Assertions.assertEquals("JOE LISA", result);
    }
}