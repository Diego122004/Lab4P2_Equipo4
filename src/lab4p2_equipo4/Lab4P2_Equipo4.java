package lab4p2_equipo4;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab4P2_Equipo4 {

    public static Scanner lea = new Scanner(System.in);
    static Scanner leas = new Scanner(System.in);
    public static TablaDeFutbol f;
    public static TablaDeVoleibol v;
    public static TablaDeBasquetbol b;

    public static void main(String[] args) {
        boolean seguir = true;
        while (seguir) {
            System.out.println("1.Equipos");
            System.out.println("2.Transferencia de jugadores");
            System.out.println("3.Registro de partidos");
            System.out.println("4.Salir");

            int opcion = lea.nextInt();
            switch (opcion) {
                case 1 -> {
                    crud_equipos();
                }
                case 2 -> {
                    int op = 0;
                    do {
                        System.out.println("1. Agregar jugadores");
                        System.out.println("2. Trasladar jugadores");
                        op = lea.nextInt();
                        switch (op) {

                            case 1: {
                                crud_jugadores();

                                break;
                            }
                            case 2: {
                                break;
                            }

                        }
                    } while (op != 3);

                }
                case 3 -> {
                }
                case 4 -> {
                    seguir = false;
                }

                default -> {
                    System.out.println("Error");
                }
            }
        }
    }

    public static void crud_equipos() {
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
                    agregar_equipo();
                }
                case 2 -> {
                    listar();

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

    public static void listar() {
        System.out.println("Equipo de Basquetbol");
        for (Equipo_basquetbol eb : b.tablaDeBasquet) {
            System.out.println("Nombre " + b.tablaDeBasquet.get(b.tablaDeBasquet.indexOf(eb)));
        }
        System.out.println();
        System.out.println("Equipo de Futbol");
        for (Equipo_futbol ef : f.tablaDeFut) {
            System.out.println("Nombre " + f.tablaDeFut.get(f.tablaDeFut.indexOf(ef)));
        }
        System.out.println();
        System.out.println("Equipo de Futbol");
        for (Equipo_voleibol ef : v.tabladevolei) {
            System.out.println("Nombre " + v.tabladevolei.get(v.tabladevolei.indexOf(ef)));
        }
    }

    public static void modificar() {
        boolean seguir = true;
        while (seguir) {
            System.out.println("Modificar");
            System.out.println("1.Nombre");
        }
    }

    public static void agregar_equipo() {
        int num = 0, opcion = 0;
        Equipo e;
        do {
            System.out.println("tipo de equipo a agregar");
            System.out.println("1.basquetbol");
            System.out.println("2.futbol");
            System.out.println("3.voleboil");
            opcion = lea.nextInt();
        } while (num <= 0 || num >= 4);
        if (opcion == 1) {
            b.tablaDeBasquet.add(new Equipo_basquetbol(nombre()));
        } else if (opcion == 2) {
            f.tablaDeFut.add(new Equipo_futbol(nombre()));
        } else {
            v.tabladevolei.add(new Equipo_voleibol(nombre()));
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

                    AgregarJugadores();

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

    public static void AgregarJugadores() {
        int num = 0;

        System.out.println("Ingrese el nombre del jugador");
        String name = leas.nextLine();
        System.out.println("Ingrese la edad del jugador");
        int edad = lea.nextInt();
        System.out.println("ingrese el sueldo del jugador");
        double sueldo = lea.nextInt();
        do {
            System.out.println("1. fut");
            System.out.println("2. bask");
            System.out.println("3. volei");
            num = lea.nextInt();
        } while (num <= 0 || num >= 4);
        System.out.println("Ingrese el equipo del jugador");
        String equipo = leas.nextLine();
        System.out.println("Ingreser la diracion del contrato");
        int DC = lea.nextInt();

        if (num == 1) {
            Jugador j = new Jugador(name, edad, "Futbol", equipo, sueldo, DC);
            int temp = -1;
            for (int i = 0; i < f.tablaDeFut.size(); i++) {
                if (f.tablaDeFut.get(i).getNombre().equalsIgnoreCase(equipo)) {
                    temp = i;
                }
            }
            if (temp == -1) {
                System.out.println("No hay equipo");

            } else {
                f.tablaDeFut.get(temp).getJ().add(j);

            }

        } else if (num == 2) {
            Jugador j = new Jugador(name, edad, "Basquetbol", equipo, sueldo, DC);
            int temp = -1;
            for (int i = 0; i < b.tablaDeBasquet.size(); i++) {
                if (b.tablaDeBasquet.get(i).getNombre().equalsIgnoreCase(equipo)) {
                    temp = i;
                }
            }
            if (temp == -1) {
                System.out.println("No hay equipo");

            } else {
                b.tablaDeBasquet.get(temp).getJ().add(j);

            }
        } else {
            Jugador j = new Jugador(name, edad, "Voleibol", equipo, sueldo, DC);

            int temp = -1;
            for (int i = 0; i < v.tabladevolei.size(); i++) {
                if (v.tabladevolei.get(i).getNombre().equalsIgnoreCase(equipo)) {
                    temp = i;
                }
            }
            if (temp == -1) {
                System.out.println("No hay equipo");

            } else {
                v.tabladevolei.get(temp).getJ().add(j);
            }
        }

    }
    public static void Listar(){
    
        
    }
}
