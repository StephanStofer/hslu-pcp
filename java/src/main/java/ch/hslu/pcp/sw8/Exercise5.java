package ch.hslu.pcp.sw8;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Exercise5 {

    public int[] createRange(int start, int end) {
        return IntStream.iterate(start, e -> e + 1)
            .limit(end + 1).toArray();
    }

    public int[] createRangeParallel(int start, int end) {
        var result = new ArrayList<Integer>();
        IntStream.iterate(start, e -> e + 1).parallel()
            .limit(end + 1).forEach(result::add);
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
