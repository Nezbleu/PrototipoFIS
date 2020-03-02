
package CreadorPlatillo;

import java.util.ArrayList;

public class ConstructorPlatillo {
    //ATRIBUTOS
    private ArrayList<String> listaIngredientes;
    //MÉTODOS
    /*Analiza el almacen para crear un nuevo platillo con el ultimo indice*/
    public Platillo crearPlatillo(AlmacenPlatillos almacen){
        int identificador = almacen.getListaPlatillos().size();
        return new Platillo(identificador);
    }
    /*Añade una lista de ingredientes al repertorio*/
    public void generarIngredientes(ArrayList<String> ingredientes){
        this.listaIngredientes = ingredientes;
    }
    /*Devuelve los ingredientes que hay en el repertorio*/
    public ArrayList<String> obtenerIngredientes(){
        return this.listaIngredientes;
    }
    /*Analiza los ingredientes que hay y llena el platillo según si hay el ingrediente*/
    public Platillo llenarPlatillo(Platillo platillo, ArrayList<String> ingredientes){
        ArrayList<String> ingredientesEnPlatillo = new ArrayList<String>();
        for(int i=0; i<ingredientes.size(); i++){                               //Mira si los ingredientes están en la listaIngredientes
            if (listaIngredientes.contains(ingredientes.get(i))){
                ingredientesEnPlatillo.add(ingredientes.get(i));
            }
        }
        if (ingredientesEnPlatillo.size() == ingredientes.size()){                //Si los ingredientes no son iguales, hay un ingrediente, luego el platillo no se puede devolver
            platillo.setIngredientes(ingredientes);
            return platillo;
        }
        else return null;
        
    }
}
