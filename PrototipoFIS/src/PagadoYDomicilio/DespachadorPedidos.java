package PagadoYDomicilio;

import CreadorPlatillo.Platillo;
import Gestores.GestorElementos;
import java.util.ArrayList;

public class DespachadorPedidos {
    public Factura generarFactura(Platillo platillo, GestorVentas facturador, GestorElementos elementador){
        //Generacion de factura
        int id = facturador.getFacturas().size();
        Factura factura = new Factura(id);
        //Parametro para la factura
        ArrayList<String> elementos;
        elementos = platillo.getIngredientes();
        
        //Llenado de factura
        factura.setElementos(elementos);
        factura.setPrecios(precios);
    }
    public Platillo obtenerPlatillo(int idPlatillo){
        return null;
    }
    public void CancelarPedido(int idPedido){
    
    }
}

