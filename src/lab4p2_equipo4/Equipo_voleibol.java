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
public class Equipo_voleibol extends Equipo {

    public Equipo_voleibol(String nombre) {
        super(nombre);
    }
    private int puntos;
    private int recibido;
    private int sets_ganados=0;
    private int sets_perdidos=0;
    private ArrayList<Jugador> j = new ArrayList();

    public ArrayList<Jugador> getJ() {
        return j;
    }

    public void agregar(Jugador e) {
        if (j.size() < 18) {
            j.add(e);
        }
    }

    public int getSets_ganados() {
        return sets_ganados;
    }

    public void setSets_ganados(int sets_ganados) {
        this.sets_ganados = sets_ganados;
    }

    public int getSets_perdidos() {
        return sets_perdidos;
    }

    public void setSets_perdidos(int sets_perdidos) {
        this.sets_perdidos = sets_perdidos;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getRecibido() {
        return recibido;
    }

    public void setRecibido(int recibido) {
        this.recibido = recibido;
    }

    public int getGanados() {
        return ganados;
    }

    public void setGanados(int ganados) {
        this.ganados = ganados;
    }

    public int getPerdidos() {
        return perdidos;
    }

    public void setPerdidos(int perdidos) {
        this.perdidos = perdidos;
    }

}
