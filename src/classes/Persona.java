package classes;

public class Persona {
    private String nombre;
    private int edad;
    private int dni;

    public Persona(String nombre, int edad, int dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "\n---------------\n Nombre: " + this.getNombre()+ "\n Edad: " +this.getEdad()+ "\n Dni: " +this.getDni();
    }
}
