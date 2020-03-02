
package Gestores;

import java.util.ArrayList;

public class GestorElementos {
    //ATRIBUTOS
    private ArrayList<Elemento> listaElementos;
    //MÉTODOS
    //INICIO GET ELEMENTO
    public Elemento getElemento(){
        return null;
    }
    public Elemento getElemento(int idElemento){
        for (int i=0; i<listaElementos.size(); i++){
            if(listaElementos.get(i).getIdElemento()==idElemento)
                return listaElementos.get(i);
        }
        return null;
    }
    public Elemento getElemento(String nombreElemento){
        for (int i=0; i<listaElementos.size(); i++){
            if(listaElementos.get(i).getNombreElemento()==nombreElemento)
                return listaElementos.get(i);
        }
        return null;
    }
    //FIN GET ELEMENTO
    public void agregarElemento(String nombreElemento, int valorElemento){
        Elemento elemento = new Elemento();
        elemento.setIdElemento(listaElementos.size());
        elemento.setNombreElemento(nombreElemento);
        elemento.setValorElemento(valorElemento);
        listaElementos.add(elemento);
    }

}
