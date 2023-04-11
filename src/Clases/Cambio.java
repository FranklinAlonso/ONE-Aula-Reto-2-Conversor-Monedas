/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author PSN
 */
public class Cambio {
    private String nombre;
    private float valor;

    public Cambio(String mondea, float valor) {
        this.nombre = mondea;
        this.valor = valor;
    }

    public String getMondea() {
        return nombre;
    }

    public void setMondea(String mondea) {
        this.nombre = mondea;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
}


