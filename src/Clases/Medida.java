/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PSN
 */
public class Medida {
    private String nombre;
    private String tipo;
    private List<Cambio> cambios;

    public Medida(String nombre, List<Cambio> cambios, String tipo) {
        this.nombre = nombre;
        this.cambios = cambios;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Cambio> getCambios() {
        return cambios;
    }

    public void setCambios(List<Cambio> cambios) {
        this.cambios = cambios;
    }
    
    public float cambioMoneda(String moneda, float cantidad){
        return cantidad * cambioMoneda(moneda);
    }
    
    public float cambioMoneda(String moneda){
        float result = 0;
        for(Cambio m : cambios){
            if(m.getMondea().equals(moneda)){
                result = m.getValor();
            }
        }
        return result;
    }
    
    public ArrayList<String> listaCambios(){
        ArrayList<String> lista = new ArrayList<>();
        
        cambios.forEach((b) ->{
            lista.add(b.getMondea());
        });
        return lista;
    }
    
    public Cambio retornarCambioValor(String seleccion){
        Cambio valor = null;
        if (this.cambios != null && !this.cambios.isEmpty()) {
            for (Cambio a : this.cambios) {
                if(a.getMondea().equals(seleccion)){
                    valor = a;
                    break; // opcional, si solo hay una moneda que coincida
                }
            }
        }
        return valor;
    }
}
