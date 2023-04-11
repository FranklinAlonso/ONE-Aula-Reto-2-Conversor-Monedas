/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversorf;

import Clases.Cambio;
import Clases.Medida;
import interfaz.Inicio;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PSN
 */
public class ConversorF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creacion de cambios de moneda
        
        //MONEDAS
        List<Cambio> solesCambio = new ArrayList<>();
        solesCambio.add(new Cambio("Dolar", (float) 0.26));
        solesCambio.add(new Cambio("Euros", (float) 0.24));
        solesCambio.add(new Cambio("Libras Esterlinas", (float) 0.21));
        solesCambio.add(new Cambio("Yen Japonés", (float) 35.1));
        solesCambio.add(new Cambio("Won sul-coreano", (float) 346.87));
        Medida soles = new Medida("Soles", solesCambio, "moneda");
        
        List<Cambio> dolarCambio = new ArrayList<>();
        dolarCambio.add(new Cambio("Soles", (float) 3.73));
        dolarCambio.add(new Cambio("Euros", (float) 0.92));
        dolarCambio.add(new Cambio("Libras Esterlinas", (float) 0.8));
        dolarCambio.add(new Cambio("Yen Japonés", (float) 132.89));
        dolarCambio.add(new Cambio("Won sul-coreano", (float) 1313.3));
        Medida dolar = new Medida("Dolar", dolarCambio, "moneda");
        
        List<Cambio> eurosCambio = new ArrayList<>();
        eurosCambio.add(new Cambio("Soles", (float) 4.05));
        eurosCambio.add(new Cambio("Dolar", (float) 1.08));
        eurosCambio.add(new Cambio("Libras Esterlinas", (float) 0.87));
        eurosCambio.add(new Cambio("Yen Japonés", (float) 144.27));
        eurosCambio.add(new Cambio("Won sul-coreano", (float) 1425.72));
        Medida euros = new Medida("Euros", eurosCambio, "moneda");
        
        List<Cambio> librasCambio = new ArrayList<>();
        librasCambio.add(new Cambio("Soles", (float) 4.61));
        librasCambio.add(new Cambio("Dolar", (float) 1.23));
        librasCambio.add(new Cambio("Euros", (float) 1.13));
        librasCambio.add(new Cambio("Yen Japonés", (float) 164.2));
        librasCambio.add(new Cambio("Won sul-coreano", (float) 1622.68));
        Medida libras = new Medida("Libras Esterlinas", librasCambio, "moneda");
        
        List<Cambio> yenCambio = new ArrayList<>();
        yenCambio.add(new Cambio("Soles", (float) 0.02811));
        yenCambio.add(new Cambio("Dolar", (float) 0.00752));
        yenCambio.add(new Cambio("Euros", (float) 0.00693));
        yenCambio.add(new Cambio("Libras Esterlinas", (float) 0.00609));
        yenCambio.add(new Cambio("Won sul-coreano", (float) 9.88));
        Medida yen = new Medida("Yen Japonés", yenCambio, "moneda");
        
        List<Cambio> wonCambio = new ArrayList<>();
        wonCambio.add(new Cambio("Soles", (float) 0.00284));
        wonCambio.add(new Cambio("Dolar", (float) 0.00076));
        wonCambio.add(new Cambio("Euros", (float) 0.0007));
        wonCambio.add(new Cambio("Libras Esterlinas", (float) 0.00062));
        wonCambio.add(new Cambio("Yen Japonés", (float) 0.10108));
        Medida won = new Medida("Won sul-coreano", wonCambio, "moneda");
        
        //UNIDAD LONGITUD
        List<Cambio> cmCambio = new ArrayList<>();
        cmCambio.add(new Cambio("Metros", (float) 0.01));
        cmCambio.add(new Cambio("Kilómetros", (float) 0.00001));
        cmCambio.add(new Cambio("Pulgadas", (float) 0.3937));
        cmCambio.add(new Cambio("Pies", (float) 0.0328));
        cmCambio.add(new Cambio("Yardas", (float) 0.0109));
        cmCambio.add(new Cambio("Millas", (float) 0.000006));
        Medida centimetros = new Medida("Centímetros", cmCambio, "longitud");
        
        List<Cambio> mCambio = new ArrayList<>();
        mCambio.add(new Cambio("Centímetros", (float) 100));
        mCambio.add(new Cambio("Kilómetros", (float) 0.001));
        mCambio.add(new Cambio("Pulgadas", (float) 39.37));
        mCambio.add(new Cambio("Pies", (float) 3.28));
        mCambio.add(new Cambio("Yardas", (float) 1.093));
        mCambio.add(new Cambio("Millas", (float) 0.000621));
        Medida metros = new Medida("Metros", mCambio, "longitud");
        
        List<Cambio> kmCambio = new ArrayList<>();
        kmCambio.add(new Cambio("Centímetros", (float) 100000));
        kmCambio.add(new Cambio("Metros", (float) 1000));
        kmCambio.add(new Cambio("Pulgadas", (float) 39370.07));
        kmCambio.add(new Cambio("Pies", (float) 3280.83));
        kmCambio.add(new Cambio("Yardas", (float) 1093.61));
        kmCambio.add(new Cambio("Millas", (float) 0.621));
        Medida kilometros = new Medida("Kilómetros", kmCambio, "longitud");
        
        List<Cambio> pulCambio = new ArrayList<>();
        pulCambio.add(new Cambio("Centímetros", (float) 2.54));
        pulCambio.add(new Cambio("Metros", (float) 0.0254));
        pulCambio.add(new Cambio("Kilómetros", (float) 0.0000253));
        pulCambio.add(new Cambio("Pies", (float) 0.083));
        pulCambio.add(new Cambio("Yardas", (float) 0.027));
        pulCambio.add(new Cambio("Millas", (float) 0.000015));
        Medida pulgadas = new Medida("Pulgadas", pulCambio, "longitud");
        
        List<Cambio> piesCambio = new ArrayList<>();
        piesCambio.add(new Cambio("Centímetros", (float) 30.48));
        piesCambio.add(new Cambio("Metros", (float) 0.3048));
        piesCambio.add(new Cambio("Kilómetros", (float) 0.0003048));
        piesCambio.add(new Cambio("Pulgadas", (float) 12));
        piesCambio.add(new Cambio("Yardas", (float) 0.33));
        piesCambio.add(new Cambio("Millas", (float) 0.000189));
        Medida pies = new Medida("Pies", piesCambio, "longitud");
        
        List<Cambio> yarCambio = new ArrayList<>();
        yarCambio.add(new Cambio("Centímetros", (float) 91.44));
        yarCambio.add(new Cambio("Metros", (float) 0.9144));
        yarCambio.add(new Cambio("Kilómetros", (float) 0.0009144));
        yarCambio.add(new Cambio("Pulgadas", (float) 36));
        yarCambio.add(new Cambio("Pies", (float) 3));
        yarCambio.add(new Cambio("Millas", (float) 0.000568));
        Medida yardas = new Medida("Yardas", yarCambio, "longitud");
        
        List<Cambio> miCambio = new ArrayList<>();
        miCambio.add(new Cambio("Centímetros", (float) 160930));
        miCambio.add(new Cambio("Metros", (float) 1609.3));
        miCambio.add(new Cambio("Kilómetros", (float) 1.6093));
        miCambio.add(new Cambio("Pulgadas", (float) 63358.26));
        miCambio.add(new Cambio("Pies", (float) 5279.85));
        miCambio.add(new Cambio("Yardas", (float) 1759.95));
        Medida millas = new Medida("Millas", miCambio, "longitud");
        
        //Horario
        List<Cambio> peCambio = new ArrayList<>();
        peCambio.add(new Cambio("EEUU (Washington DC)", 1));
        peCambio.add(new Cambio("España", 7));
        peCambio.add(new Cambio("Inglaterra", 6));
        peCambio.add(new Cambio("Japón", 14));
        peCambio.add(new Cambio("Corea del Sur", 14));
        Medida HPeru = new Medida("Perú (Lima)", peCambio, "hora");
        
        List<Cambio> euCambio = new ArrayList<>();
        euCambio.add(new Cambio("Perú (Lima)", -1));
        euCambio.add(new Cambio("España", 7));
        euCambio.add(new Cambio("Inglaterra", 5));
        euCambio.add(new Cambio("Japón", 14));
        euCambio.add(new Cambio("Corea del Sur", 14));
        Medida HEEUU = new Medida("EEUU (Washington DC))", euCambio, "hora");
        
        List<Cambio> esCambio = new ArrayList<>();
        esCambio.add(new Cambio("Perú (Lima)", -7));
        esCambio.add(new Cambio("EEUU (Washington DC", -6));
        esCambio.add(new Cambio("Inglaterra", -1));
        esCambio.add(new Cambio("Japón", 7));
        esCambio.add(new Cambio("Corea del Sur", 7));
        Medida HEspaña = new Medida("España", esCambio, "hora");
        
        List<Cambio> inCambio = new ArrayList<>();
        inCambio.add(new Cambio("Perú (Lima)", -6));
        inCambio.add(new Cambio("EEUU (Washington DC", -6));
        inCambio.add(new Cambio("España", 1));
        inCambio.add(new Cambio("Japón", 8));
        inCambio.add(new Cambio("Corea del Sur", 7));
        Medida HInglaterra = new Medida("Inglaterra", inCambio, "hora");
        
        List<Cambio> jpCambio = new ArrayList<>();
        jpCambio.add(new Cambio("Perú (Lima)", -6));
        jpCambio.add(new Cambio("EEUU (Washington DC", -6));
        jpCambio.add(new Cambio("España", 1));
        jpCambio.add(new Cambio("Inglaterra", 8));
        jpCambio.add(new Cambio("Corea del Sur", 7));
        Medida HJapon = new Medida("Japón", jpCambio, "hora");
        
        List<Cambio> csCambio = new ArrayList<>();
        csCambio.add(new Cambio("Perú (Lima)", -14));
        csCambio.add(new Cambio("EEUU (Washington DC", -14));
        csCambio.add(new Cambio("España", -7 ));
        csCambio.add(new Cambio("Inglaterra", -8));
        csCambio.add(new Cambio("Japón", 0));
        Medida HCorea = new Medida("Corea del Sur", csCambio, "hora");
        
        List<Medida> mon = new ArrayList<>();
        mon.add(soles);
        mon.add(dolar);
        mon.add(euros);
        mon.add(libras);
        mon.add(yen);
        mon.add(won);
        
        mon.add(centimetros);
        mon.add(metros);
        mon.add(kilometros);
        mon.add(pulgadas);
        mon.add(pies);
        mon.add(yardas);
        mon.add(millas);
        
        mon.add(HPeru);
        mon.add(HEEUU);
        mon.add(HEspaña);
        mon.add(HInglaterra);
        mon.add(HJapon);
        mon.add(HCorea);
        
        
        Inicio ini = new Inicio(mon);
        ini.setLocationRelativeTo(null);
        ini.setSize(400, 520);
        ini.setResizable(false);
        ini.setVisible(true);
    }
    
}
