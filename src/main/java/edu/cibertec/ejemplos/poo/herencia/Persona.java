package edu.cibertec.ejemplos.poo.herencia;

public class Persona {
    //Declarar variables
    private String dni;
    private String nombre;
    private String apellido;
    private int edad;

    public Persona(String dni, String nombre, String apellido, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    public void imprimirDatosGenerales() {
        //Juan Perez identificado con dni 1234567 tiene 30 años
        String mensaje = String.format("%s %s identificado con DNI %s tiene %d años", nombre, apellido, dni, edad);
        System.out.println(mensaje);
    }
    
    //Métodos de acceso
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
}
