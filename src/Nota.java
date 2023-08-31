public class Nota {
    double valor;
    Estudiante estudiante;
    Curso curso;

    Examen examen;

    public Nota(double valor, Estudiante estudiante, Curso curso, Examen examen) {
        this.valor = valor;
        this.estudiante = estudiante;
        this.curso = curso;
        this.examen = examen;
    }

    public double getValor() {
        return valor;
    }

    public Estudiante getEstudiante() {
        return this.estudiante;
    }

    public Curso getCurso() {
        return curso;
    }

    public Examen getExamen() {
        return examen;
    }
}
