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
public class Seleccion {
    ArrayList<Xogador> sele = new ArrayList();
    Equipo aux=new Equipo();
    public void metodo(){
        aux.cargarLista(sele);
    }
}
