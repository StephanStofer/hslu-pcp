package ch.hslu.pcp.sw8;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Exercise6 {

    public void randomizeUntilMatch(int lowerBound, int upperBound) {
        var counter = new AtomicInteger();
        if (new Random().ints().parallel().peek(inc -> counter.getAndIncrement()).anyMatch(nr -> nr >= lowerBound && nr <= upperBound)) {
            System.out.println("Found suitable number at stream position: " + counter);
        } else {
            System.out.println("Nothing found");
        }
    }
}
