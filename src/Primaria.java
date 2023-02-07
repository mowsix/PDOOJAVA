//Herencia de clases

public class Primaria extends Alumno{
    int cantidad_Clases;
    int cantidad_Deportes;

    public Primaria(){

    }
    public Primaria(int ID, String nombre, String apellido, int cantidad_Clases, int cantidad_Deportes) {
        super(ID, nombre, apellido);
        this.cantidad_Clases = cantidad_Clases;
        this.cantidad_Deportes=cantidad_Deportes;
    }

    public int getCantidad_Clases() {
        return cantidad_Clases;
    }
    public void setCantidad_Clases(int cantidad_Clases) {
        this.cantidad_Clases = cantidad_Clases;
    }

    public int getCantidad_Deportes() {
        return cantidad_Deportes;
    }
    public void setCantidad_Deportes(int cantidad_Deportes) {
        this.cantidad_Deportes = cantidad_Deportes;
    }

}
