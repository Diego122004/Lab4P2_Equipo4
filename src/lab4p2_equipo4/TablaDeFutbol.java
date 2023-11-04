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
        boolean continuar = true;
        int num = 0;
        while (continuar) {
            num = 0;
            for (int i = 0; i < tablaDeFut.size(); i++) {
                if (i + 1 < tablaDeFut.size()) {
                    if (tablaDeFut.get(i).getPunto() <= tablaDeFut.get(i + 1).getPunto()) {
                        if (tablaDeFut.get(i).getPunto() == tablaDeFut.get(i + 1).getPunto()) {
                            if (tablaDeFut.get(i).getGoles_favor() - tablaDeFut.get(i).getGoles_contra() < tablaDeFut.get(i + 1).getGoles_favor() - tablaDeFut.get(i + 1).getGoles_contra()) {
                                Equipo_futbol e = tablaDeFut.get(i);
                                Equipo_futbol e1 = tablaDeFut.get(i + 1);
                                tablaDeFut.set(i, e1);
                                tablaDeFut.set(i + 1, e);
                                num++;
                            }
                        } else {
                            Equipo_futbol e = tablaDeFut.get(i);
                            Equipo_futbol e1 = tablaDeFut.get(i + 1);
                            tablaDeFut.set(i, e1);
                            tablaDeFut.set(i + 1, e);
                            num++;
                        }
                    }
                }
            }
            if (num == 0) {
                continuar = false;
            }
        }
    }
    
    public void agregar_puntos(int indice, int ganado) {
        int punto = tablaDeFut.get(indice).getPunto();
        int Partidos_jugados = tablaDeFut.get(indice).getPartidos_jugados();
        Partidos_jugados++;
        tablaDeFut.get(indice).setPartidos_jugados(Partidos_jugados);
        if (ganado == 1) {
            //ganado+3 puntos
            int ganados=tablaDeFut.get(indice).getGanados();
            ganados++;
            tablaDeFut.get(indice).setGanados(ganados);
            punto += 3;
        } else if (ganado == 2) {
            //empate+1 punto
            int empate=tablaDeFut.get(indice).getEmpate();
            empate++;
            tablaDeFut.get(indice).setEmpate(empate);
            punto++;
        }else{
            int perdido=tablaDeFut.get(indice).getPerdidos();
            perdido++;
            tablaDeFut.get(indice).setPerdidos(perdido);
        }
        tablaDeFut.get(indice).setPunto(punto);
    }
}
