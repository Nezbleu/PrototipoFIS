
package CreadorPlatillo;

import java.util.ArrayList;

public class AlmacenPlatillos {
    //ATRIBUTOS
    private ArrayList<Platillo> platillosAlmacenados = new ArrayList<Platillo>();
    //MÉTODOS
    public Platillo getPlatillo(int id){
        return platillosAlmacenados.get(id);
    }
    public void añadirPlatillo(Platillo platillo){
        this.platillosAlmacenados.add(platillo);
    }
    public ArrayList<Platillo> getListaPlatillos(){
        return this.platillosAlmacenados;
    }
     
}
