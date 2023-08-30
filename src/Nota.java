public class Nota {
    int valor;
    Estudiante estudiante;
    Curso curso;

    Examen examen;

    public Nota(int valor, Estudiante estudiante, Curso curso, Examen examen) {
        this.valor = valor;
        this.estudiante = estudiante;
        this.curso = curso;
        this.examen = examen;
    }

    public int getValor() {
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
