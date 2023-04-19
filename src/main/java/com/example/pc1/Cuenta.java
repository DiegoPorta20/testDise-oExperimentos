package com.example.pc1;

public class Cuenta
{
    private int saldo;
    private String contra;
    public Cuenta(int saldoini, String cc)

    { //constructor

        saldo = saldoini;
        contra = cc;
    }

    public int deposita(int q)
    {
        //receptor de dinero
        saldo += q;
        return saldo;
    }

    public int retira(int q, String cc)
    {        //retira si la contraseña coincide y hay fondos if (contra.equals(cc))
        if (contra.equals(cc))
            if (saldo>=q) return q; else return -1;
        else return -2;
    }

    public int dimeSaldo()
    {		//verifica saldo
        return saldo;
    }
    public String dimeContra()
    {		//verifica contraseña
        return contra;
    }

}
