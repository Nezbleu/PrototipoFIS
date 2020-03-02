
package PagadoYDomicilio;

import java.util.ArrayList;

public class Factura {
    //ATRIBUTOS
    private ArrayList<String> elementos;
    private ArrayList<Integer> precios;
    private int idFactura;
    
    //CONSTRUCTOR
    public Factura(int idFactura) {
        this.idFactura = idFactura;
    }
    //MÉTODOS
    public ArrayList<String> getElementos() {
        return elementos;
    }

    public ArrayList<Integer> getPrecios() {
        return precios;
    }

    //ATRIBUTOS
    public int getIdFactura() {
        return idFactura;
    }

    public void setElementos(ArrayList<String> elementos) {
        this.elementos = elementos;
    }

    public void setPrecios(ArrayList<Integer> precios) {
        this.precios = precios;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }
    
    
}
