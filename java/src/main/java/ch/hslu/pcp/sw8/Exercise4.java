package ch.hslu.pcp.sw8;

import java.util.Arrays;
import java.util.Locale;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Exercise4 {

    public String processNames(String[] names) {
        Predicate<String> filter = name -> name.length() >= 3 && name.length() <= 4;
        return Arrays.stream(names).filter(filter).map(rest -> rest.toUpperCase(Locale.ROOT)).collect(Collectors.joining(" "));
    }
}
