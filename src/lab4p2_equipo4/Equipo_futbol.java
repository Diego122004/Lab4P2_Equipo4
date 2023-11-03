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

    private int ganados;
    private int perdidos;
    private int empate;
    private int goles_favor;
    private int goles_contra;
    private ArrayList<Jugador> j = new ArrayList();

    public Equipo_futbol(String nombre, String deporte, int punto, int partidos_jugados) {
        super(nombre, deporte, punto, partidos_jugados);
    }

    public Equipo_futbol() {
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public int getPunto() {
        return punto;
    }

    public void setPunto(int punto) {
        this.punto = punto;
    }

    public int getPartidos_jugados() {
        return partidos_jugados;
    }

    public void setPartidos_jugados(int partidos_jugados) {
        this.partidos_jugados = partidos_jugados;
    }

    public void agregar(Jugador e) {
        if (j.size() < 22) {
            j.add(e);
        }
    }
}
