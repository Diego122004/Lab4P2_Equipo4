package lab4p2_equipo4;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab4P2_Equipo4 {

    public static Scanner lea = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Equipo> e = new ArrayList();
        boolean seguir = true;
        while (seguir) {
            System.out.println("1.Equipos");
            System.out.println("2.Jugadores");
            System.out.println("3.Transferencia de jugadores");
            System.out.println("4.Registro de partidos");
            System.out.println("5.Salir");
            int opcion = lea.nextInt();
            switch (opcion) {
                case 1 -> {
                    crud_equipos(e);
                }
                case 2 -> {
                }
                case 3 -> {
                }
                case 4 -> {
                }
                case 5 -> {
                    seguir = false;
                }
                default -> {
                    System.out.println("Error");
                }
            }
        }
    }

    public static void crud_equipos(ArrayList<Equipo> e) {
        boolean seguir = true;
        while (seguir) {
            System.out.println("1.Agregar equipo");
            System.out.println("2.listas de equipos");
            System.out.println("3.Modificar equipo");
            System.out.println("4.Eliminar equipo");
            System.out.println("5.Salir");
            int opcion = lea.nextInt();
            switch (opcion) {
                case 1 -> {
                    e.add(agregar_equipo());
                }
                case 2 -> {
                    for (Equipo equi : e) {
                        System.out.println("Equipo " + (e.indexOf(equi) + 1));
                        System.out.println("Nombre " + equi.nombre);
                    }
                }
                case 3 -> {
                    modificar(e);
                }
                case 4 -> {
                }
                case 5 -> {
                    seguir = false;
                }
                default -> {
                    System.out.println("Error");
                }
            }
        }
    }

    public static void modificar() {
        boolean seguir=true;
        while (seguir) {
            System.out.println("Modificar");
            System.out.println("1.Nombre");
        }
    }

    public static Equipo agregar_equipo() {
        int num = 0, opcion = 0;
        do {
            System.out.println("tipo de equipo a agregar");
            System.out.println("1.basquetbol");
            System.out.println("2.futbol");
            System.out.println("3.voleboil");
            opcion = lea.nextInt();
        } while (num <= 0 || num >= 4);
        if (opcion == 1) {
            return new Equipo_basquetbol(nombre());
        } else if (opcion == 2) {
            return new Equipo_futbol(nombre());
        } else {
            return new Equipo_voleibol(nombre());
        }
    }

    public static String nombre() {
        String nombre = "";
        do {
            System.out.println("Ingrese el nombre del nombre");
            nombre = lea.next();
        } while (nombre.length() == 0);
        return nombre;
    }

    public static void crud_jugadores() {
        boolean seguir = true;
        while (seguir) {
            System.out.println("1.Agregar jugador");
            System.out.println("2.listas de jugadores");
            System.out.println("3.Modificar jugador");
            System.out.println("4.Eliminar jugador");
            System.out.println("5.Salir");
            int opcion = lea.nextInt();
            switch (opcion) {
                case 1 -> {

                }
                case 2 -> {
                }
                case 3 -> {
                }
                case 4 -> {
                }
                case 5 -> {
                    seguir = false;
                }
                default -> {
                    System.out.println("Error");
                }
            }
        }
    }

}
