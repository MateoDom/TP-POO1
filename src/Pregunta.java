public class Pregunta {
    String pregunta;
    String respuesta;
    double valor;

    public Pregunta(String pregunta, String respuesta, double valor) {
        this.pregunta = pregunta;
        this.respuesta = respuesta;
        this.valor = valor;
    }
    public double corregirPregunta (String respuesta) {
        if (respuesta == this.respuesta) {
            return this.valor;
        }
        return 0;
    }
}
