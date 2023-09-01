import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private String nombre;
    private String apellido;
    public List<Nota> notas;
    private String identificacion;

    public Estudiante(String nombre, String apellido, String identificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
        this.notas = new ArrayList<>();
    }

    public String getDatosAlumnos(){
        return this.nombre + " " + this.apellido + " " + this.identificacion;
    }

    public String getNombre(){
        return nombre;
    }

    public void agregarNota(Nota nota) {
        notas.add(nota);
    }

    public List<Nota> getNotas () {
        return this.notas;
    }

    public String verNotas () {
        StringBuilder notasInfo = new StringBuilder();

        for (Nota nota : notas) {

            notasInfo.append("Fecha: ").append(nota.getFecha())
                    .append(", Examen: ").append(nota.getExamen().getNombre())
                    .append(", Valor: ").append(nota.getValor())
                    .append("\n");
        }
        System.out.println(notasInfo.toString());
        return notasInfo.toString();
    }

    public double calcularPromedio() {
        double total = 0;
        for (int i = 0; i < notas.size(); i++) {
            total += notas.get(i).getValor();
        }
        return total / notas.size();
    }
}
