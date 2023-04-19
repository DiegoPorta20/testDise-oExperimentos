package com.example.pc1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCuenta {
    public Cuenta miCuenta;

    @Before
    public void setUp(){
        miCuenta = new Cuenta(17, "diegoporta123456");
    }

    @Test
    public void testDeposito(){
        Assert.assertEquals(27, miCuenta.deposita(10));
    }
    @Test
    public void testRetirar(){
        Assert.assertEquals(-1, miCuenta.retira(18, "diegoporta123456"));
    }
    @Test
    public void testVerificationSaldo(){
        Assert.assertEquals(17, miCuenta.dimeSaldo());
    }
    @Test
    public void testVerificationCuenta(){
        Assert.assertEquals("diegoporta123456", miCuenta.dimeContra());
    }
}
