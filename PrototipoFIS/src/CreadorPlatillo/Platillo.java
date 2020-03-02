
package CreadorPlatillo;

import java.util.ArrayList;

public class Platillo {
    //ATRIBUTOS
    private int id;
    private int precio;
    private ArrayList<String> ingredientes; 

    public Platillo(int id) {
        this.id=id;
    }
    //MÉTODOS
    //getters
    public int getPrecio(){
        return this.precio;
    }
    public ArrayList<String> getIngredientes(){
        return this.ingredientes;
    }
    //setters
    public void setPrecio(int precio){
        this.precio = precio;
    }
    public void setIngredientes(ArrayList<String> ingredientes){
        this.ingredientes = ingredientes;
    }
}
