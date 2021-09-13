package edu.cibertec.ejemplos.poo.herencia;


public class Profesor extends Persona {
    private double sueldo;

    public Profesor(double sueldo, String dni, String nombre, String apellido, int edad) {
        super(dni, nombre, apellido, edad);
        this.sueldo = sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }
    
    
    
    
    
}
