import java.util.Date;

public class Nota {
    private double valor;
    private Date fecha;
    private Estudiante estudiante;
    private Curso curso;
    private Examen examen;

    public Nota(double valor, Estudiante estudiante, Curso curso, Examen examen) {
        this.valor = valor;
        this.estudiante = estudiante;
        this.curso = curso;
        this.examen = examen;
        this.fecha = new Date();
    }

    public double getValor() {
        return valor;
    }

    public Date getFecha() {
        return fecha;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public Curso getCurso() {
        return curso;
    }

    public Examen getExamen() {
        return examen;
    }
}
