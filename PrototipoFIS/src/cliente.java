
import CreadorPlatillo.AlmacenPlatillos;
import CreadorPlatillo.ConstructorPlatillo;
import CreadorPlatillo.Platillo;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

public class cliente {

    public static void main(String[] args) {
        AlmacenPlatillos almacen = new AlmacenPlatillos();
        ConstructorPlatillo cocinero = new ConstructorPlatillo();
        //creacion del plato
        Platillo plato = cocinero.crearPlatillo(almacen);
        //Creado de ingredientes del dia
        ArrayList<String> ingredientes = new ArrayList<>();
        ingredientes.add("Pollo");
        ingredientes.add("Sopa");
        ingredientes.add("Carne");
        ingredientes.add("Frijoles");
        //Suministración de los ingredientes al cocinero
        cocinero.generarIngredientes(ingredientes);
        
        //ingredientes pedidos
        ArrayList<String> ingredientesPedidos = new ArrayList<>();
        ingredientesPedidos.add("Pollo");
        ingredientesPedidos.add("Menudencias");
        //llenado del platillo
        plato = cocinero.llenarPlatillo(plato, ingredientesPedidos);
        if(plato!=null){
            System.out.println("Su plato está listo");
            //Facturación del pedido
            //Almacenado
            System.out.print(plato.getIngredientes());
            almacen.añadirPlatillo(plato);
        }
        else{
            System.out.println("Esos ingredientes no se poseen el dia de hoy");
        }
    }
}
