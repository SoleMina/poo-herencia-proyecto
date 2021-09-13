package edu.cibertec.ejemplos.poo.herencia;

public class Alumno extends Persona {
    private int numeroCursos;
    private double promedioPonderado;

    public Alumno(int numeroCursos, double promedioPonderado, String dni, String nombre, String apellido, int edad) {
        super(dni, nombre, apellido, edad);
        this.numeroCursos = numeroCursos;
        this.promedioPonderado = promedioPonderado;
    }

    public void setNumeroCursos(int numeroCursos) {
        this.numeroCursos = numeroCursos;
    }
    
    public void setPromedioPonderado(double promedioPonderado) {
        this.promedioPonderado = promedioPonderado;
    }

    public int getNumeroCursos() {
        return numeroCursos;
    }

    public double getPromedioPonderado() {
        return promedioPonderado;
    }
    
    
    
    
    
    
}
