import java.util.ArrayList;
import java.util.List;

public class Examen {
    private String nombre;
    private List<Pregunta> preguntas;
    private Curso curso;

    public Examen(String nombre, Curso curso) {
        this.nombre = nombre;
        this.curso = curso;
        this.preguntas = new ArrayList<>();
    }

    public void agregarPregunta (Pregunta pregunta) {
       preguntas.add(pregunta);
    }

    public void calificarExamen(Estudiante estudiante, String respuesta1, String respuesta2, String respuesta3, String respuesta4) {
        double nota = 0.0;

        if (preguntas.size() >= 4) {
            nota += preguntas.get(0).corregirPregunta(respuesta1);
            nota += preguntas.get(1).corregirPregunta(respuesta2);
            nota += preguntas.get(2).corregirPregunta(respuesta3);
            nota += preguntas.get(3).corregirPregunta(respuesta4);
        }

        Nota nuevaNota = new Nota(nota, estudiante, this.curso, this);
        estudiante.agregarNota(nuevaNota);
    }

    public String getNombre() {
        return nombre;
    }
}
