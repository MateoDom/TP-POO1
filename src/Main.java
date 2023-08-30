import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Estudiante
        Estudiante estudiante = new Estudiante("Jorge", "Perez", "123");
        // Curso
        Curso curso = new Curso("POO");
        curso.agregarEstudiante(estudiante);
        // Examen
        Examen examen = new Examen("POO 1");

        // Agregar Pregunta, crea objeto Pregunta, y la por param a agregarPregunta.
        // Clase Pregunta, new Pregunta(pregunta, resIcorrecta, resCorrecta)

        examen.agregarPregunta("Java es un lenguaje orientado a objetos?");
        examen.agregarRespuesta("Si");

        // Agrego Notas new Nota

    }
}
