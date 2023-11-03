/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4p2_equipo4;

import java.util.ArrayList;

/**
 *
 * @author Luis Andres Varela
 */
public class Equipo_basquetbol extends Equipo {

    private int puntos;
    private ArrayList<Jugador> j = new ArrayList();

    public Equipo_basquetbol(String nombre, String deporte) {
        super(nombre, deporte);
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public ArrayList<Jugador> getJ() {
        return j;
    }

    public void agregar(Jugador e) {
        if (j.size() < 15) {
            j.add(e);
        }
    }
}
