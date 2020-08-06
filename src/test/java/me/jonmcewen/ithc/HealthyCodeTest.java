package me.jonmcewen.ithc;

import static org.junit.Assert.assertNull;

import org.junit.Test;

public class HealthyCodeTest {

    @Test
    public void testTheHealtyCodeIsBrilliant(){

        HealthyCode healthyCode = new HealthyCode();

        //TODO should not really be null!
        assertNull(healthyCode.apply("blah"));
    }
}
