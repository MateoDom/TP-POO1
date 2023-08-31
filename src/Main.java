import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Estudiante
        Estudiante estudiante = new Estudiante("Jorge", "Perez", "123");
        Estudiante estudiante2 = new Estudiante("Ramon", "Sanchez", "222");

        // Curso
        Curso curso = new Curso("POO");
        curso.agregarEstudiante(estudiante);
        curso.agregarEstudiante(estudiante2);
        curso.getEstudiantes();

        // Examen
        Examen examen = new Examen("POO 1");
        Pregunta pregunta = new Pregunta("Java es un lenguaje orientado a objetos?", "Si", 6);
        Pregunta pregunta2 = new Pregunta("String es un tipo de dato primitivo?", "No", 4);
        examen.agregarPregunta(pregunta);
        examen.agregarPregunta(pregunta2);

        // Agrego Notas new Nota

    }
}
