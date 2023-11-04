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
public class Equipo_futbol extends Equipo {
    private int empate;
    private int goles_favor;
    private int goles_contra;
    private ArrayList<Jugador> j = new ArrayList();

    public Equipo_futbol(String nombre) {
        super(nombre);
    }

    public Equipo_futbol() {
    }

    public int getEmpate() {
        return empate;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }

    public int getGoles_favor() {
        return goles_favor;
    }

    public void setGoles_favor(int goles_favor) {
        this.goles_favor = goles_favor;
    }

    public int getGoles_contra() {
        return goles_contra;
    }

    public void setGoles_contra(int goles_contra) {
        this.goles_contra = goles_contra;
    }

    public ArrayList<Jugador> getJ() {
        return j;
    }

    public void setJ(ArrayList<Jugador> j) {
        this.j = j;
    }

    

    public void agregar(Jugador e) {
        if (j.size() < 22) {
            j.add(e);
        }
    }

    Iterable<Jugador> getJugadores() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
