/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploarraylistfutbol;

import java.util.ArrayList;

/**
 *
 * @author otorradomiguez
 */
public class Equipo {
    private ArrayList<Xogador> Equipo= new ArrayList();
    
    public ArrayList cargarLista(ArrayList<Xogador> lista){
        Xogador xog=new Xogador(pedirNome(),pedirDorsal());
        lista.add(xog);
        return lista;
    }
}
