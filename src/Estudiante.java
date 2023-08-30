import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private String nombre;
    private String apellido;
    private List<Nota> notas;
    private String identificacion;

    public Estudiante(String nombre, String apellido, String identificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
        this.notas = new ArrayList<>();
    }

    public void agregarNota(Nota nota) {
        notas.add(nota);
    }

    public void calcularPromedio() {

    }
}
