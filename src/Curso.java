import java.util.ArrayList;

public class Curso {
    String nombre;
    Estudiante estudiantes;

    public Curso (String nombre) {
        this.nombre = nombre;
    }

    public void agregarEstudiante(Estudiante estudiante){
        this.estudiantes = estudiante;
    }
    public Estudiante getEstudiantes(){
       return this.estudiantes;
    }
    public double calcularPromedio(){
        return 3.2;
    }

}
