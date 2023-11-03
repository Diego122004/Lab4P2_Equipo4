package lab4p2_equipo4;

public class Jugador {

    protected String nombre;
    protected int edad;
    protected String deporte;
    protected String equipo;
    protected double sueldo;
    protected int duracionDelContrato;

    public Jugador() {
    }

    public Jugador(String nombre, int edad, String deporte, String equipo, double sueldo, int duracionDelContrato) {
        this.nombre = nombre;
        this.edad = edad;
        this.deporte = deporte;
        this.equipo = equipo;
        this.sueldo = sueldo;
        this.duracionDelContrato = duracionDelContrato;
        
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDeporte() {
        return deporte;
    }

    public String getEquipo() {
        return equipo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public int getDuracionDelContrato() {
        return duracionDelContrato;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void setDuracionDelContrato(int duracionDelContrato) {
        this.duracionDelContrato = duracionDelContrato;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", edad=" + edad + ", deporte=" + deporte + ", equipo=" + equipo + ", sueldo=" + sueldo + ", duracionDelContrato=" + duracionDelContrato + '}';
    }
    
    
    
    

}
