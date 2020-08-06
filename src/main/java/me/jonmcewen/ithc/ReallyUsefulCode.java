package me.jonmcewen.ithc;

import java.util.stream.Collector;
import java.util.stream.IntStream;

public class ReallyUsefulCode {

  public static String doStuff(String string) {
    return IntStream.range(0, string.length())
        .filter(n -> n % 2 == 0)
        .mapToObj(string::charAt)
        .collect(
            Collector.of(
                StringBuilder::new,
                StringBuilder::append,
                StringBuilder::append,
                StringBuilder::toString));
  }
}
