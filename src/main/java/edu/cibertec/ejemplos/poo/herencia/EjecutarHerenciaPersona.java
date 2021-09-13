package edu.cibertec.ejemplos.poo.herencia;

public class EjecutarHerenciaPersona {
    
    public static void main(String[] args) {
        Profesor pro01 = new Profesor(3500.00, "1234567", "Mario", "Martinez", 33);
        Alumno alu01 = new Alumno(7, 19.5, "1234567", "Sara", "Sanchez", 18);
        
        System.out.println("El profesor se llama " + pro01.getNombre() + " y tiene " + pro01.getEdad() + " años");
        System.out.println("El alumno " + alu01.getNombre() + " lleva " + alu01.getNumeroCursos() + " cursos");
        pro01.imprimirDatosGenerales();
    }
    
}
