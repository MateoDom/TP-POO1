import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // En este ejemplo, hacemos de cuenta que el estudiante solo puede pertenecer a un curso...
        Curso curso = new Curso("POO");

        // Cantidad de alumnos a cargar
        System.out.print("Ingrese la cantidad de alumnos a cargar: ");
        int cantidadAlumnos = scanner.nextInt();

        scanner.nextLine();

        for (int i = 1; i <= cantidadAlumnos; i++) {

            // Carga de datos de un estudiante:
            System.out.print("Nombre del alumno" + " " + i + ":");
            String nombre = scanner.nextLine();

            System.out.print("Apellido del alumno" + " " + i + ":");
            String apellido = scanner.nextLine();

            System.out.print("Numero de identificacion del alumno" + " " + i + ":");
            String identificacion = scanner.nextLine() + '\n';

            // Crea el nuevo estudiante
            Estudiante estudiante = new Estudiante(nombre, apellido, identificacion);

            // Le asigna al curso el estudiante recien creado
            curso.agregarEstudiante(estudiante);
        };

        curso.getEstudiantes();

        // Examen
        // El examen en este ejemplo seria solamente uno:
        Examen examen = new Examen("POO 1", curso);

        // Cantidad de preguntas a cargar
        System.out.print("Ingrese la cantidad de preguntas a cargar: ");
        int cantidadPreguntas = scanner.nextInt();

        scanner.nextLine();

        for (int i = 1; i <= cantidadPreguntas; i++) {

            // Carga de preguntas, respuestas y valor
            System.out.print("¿Cuál es la pregunta número"  + " " + i + " " + "que desea cargar?");
            String pregunta = scanner.nextLine();

            System.out.print("¿Cuál es la respuesta a la pregunta número"  + " " + i + "?");
            String respuesta = scanner.nextLine();

            System.out.print("¿Cuál es la el valor a la pregunta número"  + " " + i + "?");
            double valor = scanner.nextDouble();

            // Crea la nueva pregunta
            Pregunta preg = new Pregunta(pregunta, respuesta, valor);

            // Le asigna al examen la pregunta creada
            examen.agregarPregunta(preg);

            scanner.nextLine();
        };
        examen.getPreguntas();

        // Alumno Responde Examen y se califica automaticamente.
        System.out.print("Ingrese el nombre a buscar: ");

        String nombre = scanner.next();
        for(Estudiante estudiante : curso.estudiantes){
            if (estudiante.getNombre().equalsIgnoreCase(nombre)){
                for (int i = 1; i <= cantidadPreguntas; i++) {
                    System.out.println("Ingrese la respuesta correcta: ");
                    String resp = scanner.next();
                    examen.calificarExamen(estudiante, resp, i);
                }

            }
            estudiante.verNotas();
        }





    }

}
