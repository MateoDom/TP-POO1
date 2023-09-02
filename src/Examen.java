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


    public double calificarExamen(Estudiante estudiante, String respuesta, int j) {
        double nota = 0.0;

        if (preguntas.size() >= j) {
            nota = nota + preguntas.get(j-1).corregirPregunta(respuesta);
        }

        Nota nuevaNota = new Nota(nota, estudiante, this.curso, this);
        estudiante.agregarNota(nuevaNota);
        return nota;
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
        System.out.println("Las preguntas del examen de" + " " + this.nombre + " " + "son:" + " " + "\n" + resultado);
        return resultado;

    }
}
