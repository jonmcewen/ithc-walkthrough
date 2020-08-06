package me.jonmcewen.ithc;

import java.util.stream.Collector;
import java.util.stream.IntStream;

public class ReallyUsefulCode {

  public static String decryptSecretMessage(String encryptedMessage) {
    return everyOtherCharacterOf(encryptedMessage);
  }

  private static String everyOtherCharacterOf(String encryptedMessage) {
    return IntStream.range(0, encryptedMessage.length())
        .filter(n -> n % 2 == 0)
        .mapToObj(encryptedMessage::charAt)
        .collect(
            Collector.of(
                StringBuilder::new,
                StringBuilder::append,
                StringBuilder::append,
                StringBuilder::toString));
  }
}
