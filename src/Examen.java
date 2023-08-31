import java.util.ArrayList;
import java.util.List;

public class Examen {
    private String nombre;
    private List<Pregunta> preguntas;

    public Examen(String nombre) {
        this.nombre = nombre;
    }

    public void agregarPregunta (Pregunta pregunta) {
       preguntas.add(pregunta);
    }

    public void calificarExamen (String respuesta) {
  //        if (respuesta == "Si") {
  //          return true;
  //      }
  //      return false;
    }
}
