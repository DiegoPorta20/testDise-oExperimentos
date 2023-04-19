package com.example.pc1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class TestIntegralCuenta {
    @InjectMocks
    public Cuenta miCuenta;

    public TestIntegralCuenta(){
        miCuenta = new Cuenta(17, "diegoporta123456");
    }

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
        miCuenta = new Cuenta(17, "diegoporta123456");
    }


    @Test
    public void TestRetirar(){
        Mockito.when(miCuenta.deposita(2)).thenReturn(32);
        Mockito.when(miCuenta.dimeContra()).thenReturn("diegoporta123456");

        Assert.assertEquals(-2, miCuenta.retira(10, "diegoporta12345"));

    }
}
