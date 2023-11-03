/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4p2_equipo4;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author 50432
 */
public class TablaDeFutbol extends TablaDePosicion {

    protected ArrayList<Equipo_futbol> tablaDeFut = new ArrayList();

    @Override
    public void ordenar() {
        ArrayList<Integer> num = new ArrayList();
        for (int i = 0; i < tablaDeFut.size(); i++) {
            num.add(tablaDeFut.get(i).getPunto());
        }
        Collections.sort(num);
        
    }

}
