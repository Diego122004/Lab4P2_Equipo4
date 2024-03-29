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
                                Trasladar();
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
                    int num = 0;
                    do {
                        System.out.println("Seleccione");
                        System.out.println("1. Futbol");
                        System.out.println("2. Basquetbol");
                        System.out.println("3. Voleibol");
                        num = lea.nextInt();
                    } while (num <= 0 || num >= 4);
                    if (num == 1) {
                        System.out.println("Equipos de Futbol");
                        for (Equipo_futbol ef : f.tablaDeFut) {
                            System.out.println("Equipo " + (b.tablaDeBasquet.indexOf(ef) + 1));
                            System.out.println("Nombre " + f.tablaDeFut.get(f.tablaDeFut.indexOf(ef)));
                        }
                        System.out.println();
                    } else if (num == 2) {
                        System.out.println("Equipos de Basquetbol");
                        for (Equipo_basquetbol eb : b.tablaDeBasquet) {
                            System.out.println("Equipo " + (b.tablaDeBasquet.indexOf(eb) + 1));
                            System.out.println("Nombre " + b.tablaDeBasquet.get(b.tablaDeBasquet.indexOf(eb)));
                        }
                        System.out.println();
                    } else if (num == 3) {
                        System.out.println("Equipos de Voleibol");
                        for (Equipo_voleibol ev : v.tabladevolei) {
                            System.out.println("Equipo " + (b.tablaDeBasquet.indexOf(ev) + 1));
                            System.out.println("Nombre " + v.tabladevolei.get(v.tabladevolei.indexOf(ev)));
                        }
                        System.out.println();
                    }
                    System.out.println("Ingrese el numero del equipo que sea modificar");
                    int posicion = lea.nextInt();
                    modificar(posicion, num);
                }
                case 4 -> {
                    int num = 0;
                    do {
                        System.out.println("Seleccione");
                        System.out.println("1. Futbol");
                        System.out.println("2. Basquetbol");
                        System.out.println("3. Voleibol");
                        num = lea.nextInt();
                    } while (num <= 0 || num >= 4);
                    if (num == 1) {
                        System.out.println("Equipos de Futbol");
                        for (Equipo_futbol ef : f.tablaDeFut) {
                            System.out.println("Equipo " + (b.tablaDeBasquet.indexOf(ef) + 1));
                            System.out.println("Nombre " + f.tablaDeFut.get(f.tablaDeFut.indexOf(ef)));
                        }
                        System.out.println();
                    } else if (num == 2) {
                        System.out.println("Equipos de Basquetbol");
                        for (Equipo_basquetbol eb : b.tablaDeBasquet) {
                            System.out.println("Equipo " + (b.tablaDeBasquet.indexOf(eb) + 1));
                            System.out.println("Nombre " + b.tablaDeBasquet.get(b.tablaDeBasquet.indexOf(eb)));
                        }
                        System.out.println();
                    } else if (num == 3) {
                        System.out.println("Equipos de Voleibol");
                        for (Equipo_voleibol ev : v.tabladevolei) {
                            System.out.println("Equipo " + (b.tablaDeBasquet.indexOf(ev) + 1));
                            System.out.println("Nombre " + v.tabladevolei.get(v.tabladevolei.indexOf(ev)));
                        }
                        System.out.println();
                    }
                    System.out.println("Ingrese el numero del equipo que sea Eliminar");
                    int posicion = lea.nextInt();
                    if (num == 1) {
                        f.tablaDeFut.remove(posicion);
                    } else if (num == 2) {
                        b.tablaDeBasquet.remove(posicion);
                    } else if (num == 3) {
                        v.tabladevolei.remove(posicion);
                    }
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
        System.out.println("Equipos de Basquetbol");
        for (Equipo_basquetbol eb : b.tablaDeBasquet) {
            System.out.println("Equipo " + (b.tablaDeBasquet.indexOf(eb) + 1));
            System.out.println("Nombre " + b.tablaDeBasquet.get(b.tablaDeBasquet.indexOf(eb)));
        }
        System.out.println();
        System.out.println("Equipos de Futbol");
        for (Equipo_futbol ef : f.tablaDeFut) {
            System.out.println("Equipo " + (b.tablaDeBasquet.indexOf(ef) + 1));
            System.out.println("Nombre " + f.tablaDeFut.get(f.tablaDeFut.indexOf(ef)));
        }
        System.out.println();
        System.out.println("Equipos de Voleibol");
        for (Equipo_voleibol ev : v.tabladevolei) {
            System.out.println("Equipo " + (b.tablaDeBasquet.indexOf(ev) + 1));
            System.out.println("Nombre " + v.tabladevolei.get(v.tabladevolei.indexOf(ev)));
        }
        System.out.println();
    }

    public static void modificar(int posicion, int num) {
        boolean seguir = true;
        while (seguir) {
            System.out.println("Modificar");
            System.out.println("1.Nombre");
            System.out.println("2.Salir");
            int opcion = lea.nextInt();
            switch (opcion) {
                case 1 -> {
                    String nombre = nombre();
                    if (num == 1) {
                        f.tablaDeFut.get(posicion).setNombre(nombre);
                    } else if (num == 2) {
                        b.tablaDeBasquet.get(posicion).setNombre(nombre);
                    } else if (num == 3) {
                        v.tabladevolei.get(posicion).setNombre(nombre);
                    }
                }
                case 2 -> {
                    seguir = false;
                }
                default -> {
                    System.out.println("Error");
                }
            }
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
                    Listar();
                }
                case 3 -> {
                    ModificarJugadores();
                }
                case 4 -> {
                    EliminarJugadores();
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

    public static void Listar() {
        int op = 0;
        System.out.println("Seleccione el deporte del que quier ver los jugadores");
        do {
            System.out.println("1. Basquetbol");
            System.out.println("2. Futbol");
            System.out.println("3. Voleibol");
            System.out.println("4. Salir");
            op = lea.nextInt();
            switch (op) {
                case 1: {
                    for (Equipo_basquetbol eb : b.tablaDeBasquet) {
                        System.out.println("Nombre del equipo: " + eb.getNombre());
                        for (Jugador jugador : eb.getJ()) {
                            System.out.println(jugador.toString());
                        }
                        System.out.println();
                    }
                }
                break;
                case 2: {
                    System.out.println("Equipo de Futbol:");
                    for (Equipo_futbol ef : f.tablaDeFut) {
                        System.out.println("Nombre del equipo: " + ef.getNombre());
                        for (Jugador jugador : ef.getJ()) {
                            System.out.println(jugador.toString());
                        }
                        System.out.println();
                    }
                    break;
                }
                case 3: {
                    for (Equipo_voleibol ev : v.tabladevolei) {
                        System.out.println("Nombre del equipo: " + ev.getNombre());
                        for (Jugador jugador : ev.getJ()) {
                            System.out.println(jugador.toString());
                        }
                        System.out.println();
                    }
                    break;
                }

            }

        } while (op != 4);
    }

    public static void ModificarJugadores() {
        int op = 0;
        System.out.println("Seleccione el deporte del que quiere modificar a los jugadores");
        do {
            System.out.println("1. Basquetbol");
            System.out.println("2. Futbol");
            System.out.println("3. Voleibol");
            System.out.println("4. Salir");
            op = lea.nextInt();
            switch (op) {
                case 1: {
                    System.out.println("Ingrese el nombre del jugador que desea modificar:");
                    String nombreJugador = leas.nextLine();
                    for (Equipo_basquetbol eb : b.tablaDeBasquet) {
                        for (Jugador jugador : eb.getJ()) {
                            if (jugador.getNombre().equals(nombreJugador)) {
                                System.out.println("Ingrese el nuevo nombre para el jugador:");
                                String nuevoNombre = leas.nextLine();
                                jugador.setNombre(nuevoNombre);
                                System.out.println("Nombre del jugador modificado correctamente.");
                                return;
                            }
                        }
                    }

                    break;
                }
                case 2: {
                    System.out.println("Ingrese el nombre del jugador que desea modificar:");
                    String nombreJugador = leas.nextLine();
                    for (Equipo_futbol ef : f.tablaDeFut) {
                        for (Jugador jugador : ef.getJ()) {
                            if (jugador.getNombre().equals(nombreJugador)) {
                                System.out.println("Ingrese el nuevo nombre para el jugador:");
                                String nuevoNombre = leas.nextLine();
                                jugador.setNombre(nuevoNombre);
                                System.out.println("Nombre del jugador modificado correctamente.");
                                return;
                            }
                        }
                    }
                    break;
                }
                case 3: {
                    System.out.println("Ingrese el nombre del jugador que desea modificar:");
                    String nombreJugador = leas.nextLine();
                    for (Equipo_voleibol ev : v.tabladevolei) {
                        for (Jugador jugador : ev.getJ()) {
                            if (jugador.getNombre().equals(nombreJugador)) {
                                System.out.println("Ingrese el nuevo nombre para el jugador:");
                                String nuevoNombre = leas.nextLine();
                                jugador.setNombre(nuevoNombre);
                                System.out.println("Nombre del jugador modificado correctamente.");
                                return;
                            }
                        }
                    }
                    break;
                }
            }
        } while (op != 4);
    }

    public static void EliminarJugadores() {
        int op = 0;
        System.out.println("Seleccione el deporte del que quiere modificar a los jugadores");
        do {
            System.out.println("1. Basquetbol");
            System.out.println("2. Futbol");
            System.out.println("3. Voleibol");
            System.out.println("4. Salir");
            op = lea.nextInt();
            switch (op) {
                case 1: {
                    System.out.println("Ingrese el nombre del jugador que desea eliminar:");
                    String nombreJugador = leas.nextLine();
                    for (Equipo_basquetbol eb : b.tablaDeBasquet) {
                        for (Jugador jugador : eb.getJ()) {
                            if (jugador.getNombre().equals(nombreJugador)) {
                                eb.getJ().remove(jugador);
                                System.out.println("Jugador eliminado del equipo de Basquetbol.");
                                return;
                            }
                        }
                    }
                    break;
                }
                case 2: {

                    System.out.println("Ingrese el nombre del jugador que desea eliminar:");
                    String nombreJugador = leas.nextLine();
                    for (Equipo_futbol ef : f.tablaDeFut) {
                        for (Jugador jugador : ef.getJugadores()) {
                            if (jugador.getNombre().equals(nombreJugador)) {
                                ef.getJ().remove(jugador);
                                System.out.println("Jugador eliminado del equipo de Futbol.");
                                return;
                            }
                        }
                    }

                    break;
                }
                case 3: {
                    System.out.println("Ingrese el nombre del jugador que desea eliminar:");
                    String nombreJugador = leas.nextLine();
                    for (Equipo_voleibol ev : v.tabladevolei) {
                        for (Jugador jugador : ev.getJ()) {
                            if (jugador.getNombre().equals(nombreJugador)) {
                                ev.getJ().remove(jugador);
                                System.out.println("Jugador eliminado del equipo de Voleibol.");
                                return;
                            }
                        }
                    }

                    break;
                }

            }
        }while(op != 4);
    
    }
    public static void Trasladar() {
        int num = 0;
        do {
            System.out.println("1. Futbol");
            System.out.println("2. Basquetbol");
            System.out.println("3. Voleibol");
            num = lea.nextInt();
        } while (num <= 0 || num >= 4);
        switch (num) {
            case 1 -> {
                for (Equipo_futbol ef : f.tablaDeFut) {
                    System.out.println("Equipo " + (f.tablaDeFut.indexOf(ef) + 1));
                    System.out.println("Nombre del equipo: " + ef.getNombre());
                    for (Jugador jugador : ef.getJ()) {
                        System.out.println("Jugador " + (f.tablaDeFut.get(f.tablaDeFut.indexOf(ef)).getJ().indexOf(jugador) + 1));
                        System.out.println(jugador.toString());
                    }
                    System.out.println();
                }
                System.out.println("Ingrese el numero del equipo");
                int posicion = lea.nextInt();
                posicion--;
                System.out.println("Ingrese el numero del jugador");
                int posicion1 = lea.nextInt();
                posicion1--;
                if (posicion < f.tablaDeFut.size() && posicion >= 0) {
                    if (posicion1 < f.tablaDeFut.get(posicion).getJ().size() && posicion1 >= 0) {
                        listar();
                        System.out.println("El ingrese el numero al equipo que los quiere Transferir");
                        int nuevo = lea.nextInt();
                        System.out.println("Ingrese el nuevo salario");
                        int salario = lea.nextInt();
                        System.out.println("Ingrese la duracion del contrato");
                        int duracion = lea.nextInt();
                        if (nuevo < f.tablaDeFut.size() && nuevo >= 0) {
                            Jugador j = f.tablaDeFut.get(posicion).getJ().get(posicion1);
                            f.tablaDeFut.get(posicion).getJ().remove(posicion1);
                            j.setDuracionDelContrato(duracion);
                            j.setSueldo(salario);
                            j.setEquipo(f.tablaDeFut.get(nuevo).getNombre());
                            f.tablaDeFut.get(posicion).getJ().add(j);
                        }

                    }
                }
            }

            case 2 -> {
                for (Equipo_basquetbol eb : b.tablaDeBasquet) {
                    System.out.println("Equipo " + (b.tablaDeBasquet.indexOf(eb) + 1));
                    System.out.println("Nombre del equipo: " + eb.getNombre());
                    for (Jugador jugador : eb.getJ()) {
                        System.out.println("Jugador " + (b.tablaDeBasquet.get(b.tablaDeBasquet.indexOf(eb)).getJ().indexOf(jugador) + 1));

                        System.out.println(jugador.toString());
                    }
                    System.out.println();
                }
                System.out.println("Ingrese el numero del equipo");
                int posicion = lea.nextInt();
                posicion--;
                System.out.println("Ingrese el numero del jugador");
                int posicion1 = lea.nextInt();
                posicion1--;
                if (posicion < b.tablaDeBasquet.size() && posicion >= 0) {
                    if (posicion1 < b.tablaDeBasquet.get(posicion).getJ().size() && posicion1 >= 0) {
                        listar();
                        System.out.println("El ingrese el numero al equipo que los quiere Transferir");
                        int nuevo = lea.nextInt();
                        System.out.println("Ingrese el nuevo salario");
                        int salario = lea.nextInt();
                        System.out.println("Ingrese la duracion del contrato");
                        int duracion = lea.nextInt();
                        if (nuevo < b.tablaDeBasquet.size() && nuevo >= 0) {
                            Jugador j = b.tablaDeBasquet.get(posicion).getJ().get(posicion1);
                            b.tablaDeBasquet.get(posicion).getJ().remove(posicion1);
                            j.setDuracionDelContrato(duracion);
                            j.setSueldo(salario);
                            j.setEquipo(b.tablaDeBasquet.get(nuevo).getNombre());
                            b.tablaDeBasquet.get(posicion).getJ().add(j);
                        }

                    }
                }
            }
            case 3 -> {
                for (Equipo_voleibol ev : v.tabladevolei) {
                    System.out.println("Equipo " + (v.tabladevolei.indexOf(ev) + 1));
                    System.out.println("Nombre del equipo: " + ev.getNombre());
                    for (Jugador jugador : ev.getJ()) {
                        System.out.println("Jugador " + (v.tabladevolei.get(v.tabladevolei.indexOf(ev)).getJ().indexOf(jugador) + 1));
                        System.out.println(jugador.toString());
                    }
                    System.out.println();
                }
                System.out.println("Ingrese el numero del equipo");
                int posicion = lea.nextInt();
                posicion--;
                System.out.println("Ingrese el numero del jugador");
                int posicion1 = lea.nextInt();
                posicion1--;
                if (posicion < v.tabladevolei.size() && posicion >= 0) {
                    if (posicion1 < v.tabladevolei.get(posicion).getJ().size() && posicion1 >= 0) {
                        listar();
                        System.out.println("El ingrese el numero al equipo que los quiere Transferir");
                        int nuevo = lea.nextInt();
                        System.out.println("Ingrese el nuevo salario");
                        int salario = lea.nextInt();
                        System.out.println("Ingrese la duracion del contrato");
                        int duracion = lea.nextInt();
                        if (nuevo < v.tabladevolei.size() && nuevo >= 0) {
                            Jugador j = v.tabladevolei.get(posicion).getJ().get(posicion1);
                            v.tabladevolei.get(posicion).getJ().remove(posicion1);
                            j.setDuracionDelContrato(duracion);
                            j.setSueldo(salario);
                            j.setEquipo(v.tabladevolei.get(nuevo).getNombre());
                            v.tabladevolei.get(posicion).getJ().add(j);
                        }

                    }
                }
            }
            default -> {
                System.out.println("Error");
            }
        }

    }
}
