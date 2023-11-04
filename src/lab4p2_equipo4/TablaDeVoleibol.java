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
public class TablaDeVoleibol extends TablaDePosicion {

    protected ArrayList<Equipo_voleibol> tabladevolei = new ArrayList();

    @Override
    public void ordenar() {
        boolean seguir = true;
        int num = 0;
        while (seguir) {
            num = 0;
            for (int i = 0; i < tabladevolei.size(); i++) {
                if (i + 1 < tabladevolei.size()) {
                    if (tabladevolei.get(i).getPartidos_jugados() == tabladevolei.get(i + 1).getPartidos_jugados()) {
                        if (tabladevolei.get(i).getGanados() < tabladevolei.get(i + 1).getGanados()) {
                            Equipo_voleibol e = tabladevolei.get(i);
                            Equipo_voleibol e1 = tabladevolei.get(i + 1);
                            tabladevolei.set(i, e1);
                            tabladevolei.set(i + 1, e);
                            num++;
                        } else if (tabladevolei.get(i).getGanados() == tabladevolei.get(i + 1).getGanados()) {
                            if (tabladevolei.get(i).getSets_ganados() < tabladevolei.get(i + 1).getSets_ganados()) {
                                Equipo_voleibol e = tabladevolei.get(i);
                                Equipo_voleibol e1 = tabladevolei.get(i + 1);
                                tabladevolei.set(i, e1);
                                tabladevolei.set(i + 1, e);
                                num++;
                            } else if (tabladevolei.get(i).getSets_ganados() == tabladevolei.get(i + 1).getSets_ganados()) {
                                if (tabladevolei.get(i).getRecibido() > tabladevolei.get(i + 1).getRecibido()) {
                                    Equipo_voleibol e = tabladevolei.get(i);
                                    Equipo_voleibol e1 = tabladevolei.get(i + 1);
                                    tabladevolei.set(i, e1);
                                    tabladevolei.set(i + 1, e);
                                    num++;
                                }
                            }
                        }
                    } else {
                        if (tabladevolei.get(i).getGanados() / tabladevolei.get(i).getPartidos_jugados() <= tabladevolei.get(i + 1).getGanados() / tabladevolei.get(i + 1).getPartidos_jugados()) {
                            if (tabladevolei.get(i).getGanados() / tabladevolei.get(i).getPartidos_jugados() == tabladevolei.get(i + 1).getGanados() / tabladevolei.get(i + 1).getPartidos_jugados()) {
                                if (tabladevolei.get(i).getPuntos() <= tabladevolei.get(i).getPuntos()) {
                                    Equipo_voleibol e = tabladevolei.get(i);
                                    Equipo_voleibol e1 = tabladevolei.get(i + 1);
                                    tabladevolei.set(i, e1);
                                    tabladevolei.set(i + 1, e);
                                    num++;
                                }
                            } else if (tabladevolei.get(i).getGanados() / tabladevolei.get(i).getPartidos_jugados() < tabladevolei.get(i + 1).getGanados() / tabladevolei.get(i + 1).getPartidos_jugados()) {
                                Equipo_voleibol e = tabladevolei.get(i);
                                Equipo_voleibol e1 = tabladevolei.get(i + 1);
                                tabladevolei.set(i, e1);
                                tabladevolei.set(i + 1, e);
                                num++;
                            }
                        }
                    }
                }
            }
            if (num == 0) {
                seguir = false;
            }
        }

    }

}
