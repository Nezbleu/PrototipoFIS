
package PagadoYDomicilio;

public class Pago {

    //ATRIBUTOS
    private int facturaId;
    private int valorPago;
    //CONSTRUCTOR
    public Pago(int facturaId, int valorPago) {
        this.facturaId = facturaId;
        this.valorPago = valorPago;
    }
    //MÉTODOS
    public int getFacturaId() {
        return facturaId;
    }

    public int getValorPago() {
        return valorPago;
    }
    
    
}
