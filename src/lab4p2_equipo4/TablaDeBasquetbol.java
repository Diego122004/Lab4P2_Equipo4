package lab4p2_equipo4;

import java.util.ArrayList;

public class TablaDeBasquetbol extends TablaDePosicion {

    protected ArrayList<Equipo_basquetbol> tablaDeBasquet = new ArrayList();

    @Override
    public void ordenar() {
        boolean seguir = true;
        int num = 0;
        while (seguir) {
            num = 0;
            for (int i = 0; i < tablaDeBasquet.size(); i++) {
                if (i + 1 < tablaDeBasquet.size()) {
                    if (tablaDeBasquet.get(i).getPartidos_jugados() == tablaDeBasquet.get(i + 1).getPartidos_jugados()) {
                        if (tablaDeBasquet.get(i).getGanados() <= tablaDeBasquet.get(i + 1).getGanados()) {
                            Equipo_basquetbol e = tablaDeBasquet.get(i);
                            Equipo_basquetbol e1 = tablaDeBasquet.get(i + 1);
                            tablaDeBasquet.set(i, e1);
                            tablaDeBasquet.set(i + 1, e);
                            num++;
                        }
                    } else {
                        if (tablaDeBasquet.get(i).getGanados() / tablaDeBasquet.get(i).getPartidos_jugados() <= tablaDeBasquet.get(i + 1).getGanados() / tablaDeBasquet.get(i + 1).getPartidos_jugados()) {
                            if (tablaDeBasquet.get(i).getGanados() / tablaDeBasquet.get(i).getPartidos_jugados() == tablaDeBasquet.get(i + 1).getGanados() / tablaDeBasquet.get(i + 1).getPartidos_jugados()) {
                                if (tablaDeBasquet.get(i).getPuntos()<=tablaDeBasquet.get(i).getPuntos()) {
                                    Equipo_basquetbol e = tablaDeBasquet.get(i);
                                    Equipo_basquetbol e1 = tablaDeBasquet.get(i + 1);
                                    tablaDeBasquet.set(i, e1);
                                    tablaDeBasquet.set(i + 1, e);
                                    num++;
                                } 
                            } else if(tablaDeBasquet.get(i).getGanados() / tablaDeBasquet.get(i).getPartidos_jugados() < tablaDeBasquet.get(i + 1).getGanados() / tablaDeBasquet.get(i + 1).getPartidos_jugados()){
                                Equipo_basquetbol e = tablaDeBasquet.get(i);
                                Equipo_basquetbol e1 = tablaDeBasquet.get(i + 1);
                                tablaDeBasquet.set(i, e1);
                                tablaDeBasquet.set(i + 1, e);
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
