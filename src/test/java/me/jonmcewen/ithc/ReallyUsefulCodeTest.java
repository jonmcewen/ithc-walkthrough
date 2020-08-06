package me.jonmcewen.ithc;

import static me.jonmcewen.ithc.ReallyUsefulCode.doStuff;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReallyUsefulCodeTest {

  @Test
  public void testDoStuff() {
    assertEquals("secret message", doStuff("sXe6cir£ertr Mm2eSsssra6g8e"));
  }
}
