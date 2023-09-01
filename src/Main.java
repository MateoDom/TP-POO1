import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // En este ejemplo, hacemos de cuenta que el estudiante solo puede pertenecer a un curso...

        // Estudiante
        Estudiante estudiante = new Estudiante("Jorge", "Perez", "123");
        Estudiante estudiante2 = new Estudiante("Ramon", "Sanchez", "222");

        // Curso
        Curso curso = new Curso("POO");
        curso.agregarEstudiante(estudiante);
        curso.agregarEstudiante(estudiante2);
        curso.getEstudiantes();

        // Examen
        Examen examen = new Examen("POO 1", curso);
        Pregunta pregunta = new Pregunta("Java es un lenguaje orientado a objetos?", "Si", 2.5);
        Pregunta pregunta2 = new Pregunta("String es un tipo de dato primitivo?", "No", 2.5);
        Pregunta pregunta3 = new Pregunta("¿El paradigma de programación orientada a objetos se basa en objetos y clases?", "Si", 2.5);
        Pregunta pregunta4 = new Pregunta("¿El lenguaje Java es compilado y luego interpretado por la máquina virtual Java (JVM)?", "Si", 2.5);

        examen.agregarPregunta(pregunta);
        examen.agregarPregunta(pregunta2);
        examen.agregarPregunta(pregunta3);
        examen.agregarPregunta(pregunta4);

        // Alumno Responde Examen y se califica automaticamente.
        examen.calificarExamen(estudiante, "Si", "No", "Si", "No");
        examen.calificarExamen(estudiante2, "Si", "No", "Si", "No");

        // Estudiante ve todas sus notas.
        estudiante.verNotas();
        estudiante.calcularPromedio();
        estudiante2.verNotas();
        estudiante2.calcularPromedio();

        // Profesor calcula promedios.
        curso.calcularPromedio();

    }
}
