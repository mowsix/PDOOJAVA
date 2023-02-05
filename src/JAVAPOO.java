public class JAVAPOO {
    public static void main(String[] args) {
        // Crear un objeto de la clase alumno
        Alumno alumno1= new Alumno(5014,"Santiago","Gallego");
        Alumno alumno2= new Alumno();

        // Acceder a los metodos dde las clases setters y getters
        //Get
        System.out.println("El ID del alumno 1 es: "+ alumno1.getID());
        System.out.println("================================================");
        //Set
        alumno2.setID(5028);
        alumno2.setNombre("Raul");
        alumno2.setApellido("Perez");
        System.out.println("El nombre del Alumno es :"+alumno2.getNombre()+" "+alumno2.getApellido()+
                " Y su ID es: "+ alumno2.getID());

    }
}
