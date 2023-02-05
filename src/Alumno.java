//Crear clase con sus atributos

public class Alumno {
    int ID;
    String nombre;
    String apellido;

    //METODOS

    public void mostrarNombre(){
        System.out.println("Mi nombre es pedro");
    }
    public void saberAprobado(double calificacion){
        if(calificacion>=3){
            System.out.println("APROBADOOO");
        }else {
            System.out.println("Perdiste :c");
        }
    }

    // Constructores

    public Alumno() {
    }

    public Alumno(int ID, String nombre, String apellido) {
        this.nombre = nombre;
        this.ID= ID;
        this.apellido= apellido;
    }
    //Getters y Setters siempre despues de los constructores
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
