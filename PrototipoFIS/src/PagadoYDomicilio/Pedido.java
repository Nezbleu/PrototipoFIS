
package PagadoYDomicilio;

public class Pedido {
    private String idPlatillo;
    private int idCliente;
    private Factura factura;
    private int idPedido;

    public Pedido(String idPlatillo, int idCliente, Factura factura, int idPedido) {
        this.idPlatillo = idPlatillo;
        this.idCliente = idCliente;
        this.factura = factura;
        this.idPedido = idPedido;
    }
    
}
