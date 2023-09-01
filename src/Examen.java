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


    public void calificarExamen(Estudiante estudiante, String respuesta, int i) {
        double nota = 0.0;

        if (preguntas.size() >= i) {
            nota += preguntas.get(i-1).corregirPregunta(respuesta);
            System.out.println(nota);
        }

        Nota nuevaNota = new Nota(nota, estudiante, this.curso, this);
        estudiante.agregarNota(nuevaNota);
    }

    public String getNombre() {
        return nombre;
    }

    public String getPreguntas(){
        StringBuilder preguntasDelExamen = new StringBuilder();

        for (Pregunta pregunta : preguntas) {
            preguntasDelExamen.append(pregunta.getPregunta()).append("\n");
        }

        String resultado = preguntasDelExamen.toString();
        System.out.println("Los alumnos del curso de" + " " + this.nombre + " " + "son:" + " " + "\n" + resultado);
        return resultado;

    }
}
