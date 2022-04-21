package ch.hslu.pcp.sw8;

import org.junit.jupiter.api.Test;

class Exercise6Test {

    @Test
    void randomSeedUntilMatch() {
        new Exercise6().randomizeUntilMatch(10_000, 12_000);
    }
}