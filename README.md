# TP-POO1

UML con ayuda de Chat-GPT:

                +-----------------+
                |      Nota       |
                +-----------------+
                | -valor: double  |
                | -fecha: Date    |
                | -estudiante: Estudiante |
                | -curso: Curso   |
                | -examen: Examen  |
                +-----------------+
                | +Nota(valor: double, estudiante: Estudiante, curso: Curso, examen: Examen)
                | +getValor(): double
                | +getFecha(): Date
                | +getEstudiante(): Estudiante
                | +getCurso(): Curso
                | +getExamen(): Examen

                +-----------------+
                |   Estudiante    |
                +-----------------+
                | -nombre: String |
                | -apellido: String |
                | -notas: List<Nota> |
                | -identificacion: String |
                +-----------------+
                | +Estudiante(nombre: String, apellido: String, identificacion: String)
                | +getNombreCompleto(): String
                | +agregarNota(nota: Nota): void
                | +getNotas(): List<Nota>
                | +verNotas(): String
                | +calcularPromedio(): double

                +-----------------+
                |     Examen      |
                +-----------------+
                | -nombre: String |
                | -preguntas: List<Pregunta> |
                | -curso: Curso   |
                +-----------------+
                | +Examen(nombre: String, curso: Curso)
                | +agregarPregunta(pregunta: Pregunta): void
                | +calificarExamen(estudiante: Estudiante, respuestas...): void
                | +getNombre(): String

                +-----------------+
                |      Curso      |
                +-----------------+
                | -nombre: String |
                | -estudiantes: List<Estudiante> |
                +-----------------+
                | +Curso(nombre: String)
                | +agregarEstudiante(estudiante: Estudiante): void
                | +getEstudiantes(): String
                | +calcularPromedio(): double

                +-----------------+
                |    Pregunta     |
                +-----------------+
                | -pregunta: String |
                | -respuesta: String |
                | -valor: double  |
                +-----------------+
                | +Pregunta(pregunta: String, respuesta: String, valor: double)
                | +corregirPregunta(respuesta: String): double
