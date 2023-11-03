
package lab4p2_equipo4;

import java.util.ArrayList;


public abstract class TablaDePosicion {
    protected ArrayList<Equipo> equipos = new ArrayList();

    @Override
    public String toString() {
        return "TablaDePosicion{" + "equipos=" + equipos + '}';
    }
    
    public abstract void ordenar();
}
