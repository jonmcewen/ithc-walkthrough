package me.jonmcewen.ithc;

import static me.jonmcewen.ithc.ReallyUsefulCode.decryptSecretMessage;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReallyUsefulCodeTest {

  @Test
  public void shouldDecryptSecretMessage() {
    assertEquals("secret message", decryptSecretMessage("sXe6cir£ertr Mm2eSsssra6g8e"));
  }
}
