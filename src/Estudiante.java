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

    public String getNombreCompleto(){
        return this.nombre + " " + this.apellido;
    }

    public void agregarNota(Nota nota) {
        notas.add(nota);
    }

    public List<Nota> getNotas () {
        return this.notas;
    }

    public double calcularPromedio() {
        double total = 0;
        for (int i = 0; i < notas.size(); i++) {
            total += notas.get(i).getValor();
        }
        return total / notas.size();
    }
}
