import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombre;
    private List<Estudiante> estudiantes;

    public Curso (String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante){
        estudiantes.add(estudiante);
    }
    public String getEstudiantes(){
        StringBuilder nombresCompletos = new StringBuilder();

        for (Estudiante estudiante : estudiantes) {
            nombresCompletos.append(estudiante.getNombreCompleto()).append("\n");
        }

        return nombresCompletos.toString();
    }
    public double calcularPromedio(){
            double total = 0;
            int cantidadNotas = 0;

            for (Estudiante estudiante : estudiantes) {
                List<Nota> notasEstudiante = estudiante.getNotas();
                for (Nota nota : notasEstudiante) {
                    total += nota.getValor();
                    cantidadNotas++;
                }
            }

            if (cantidadNotas == 0) {
                return 0.0;
            }

            return total / cantidadNotas;
        }

}
