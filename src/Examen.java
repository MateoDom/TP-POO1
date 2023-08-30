import java.util.ArrayList;

public class Examen {
    String nombre;
    String pregunta;
    String respuesta;

    public Examen(String nombre) {
        this.nombre = nombre;
    }

    public void agregarPregunta (String pregunta) {
       this.pregunta = pregunta;
    }
    public void agregarRespuesta (String respuesta) {
        this.respuesta = respuesta;
    }
    public boolean calificarExamen (String respuesta) {
        if (respuesta == "Si") {
            return true;
        }
        return false;
    }
}
