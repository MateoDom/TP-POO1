public class Pregunta {
    String pregunta;
    String respuesta;
    double valor;

    public Pregunta(String pregunta, String respuesta, double valor) {
        this.pregunta = pregunta;
        this.respuesta = respuesta;
        this.valor = valor;
    }
    public double corregirPregunta(String respuesta) {
        if (respuesta.equalsIgnoreCase(this.respuesta)) {
            return this.valor;
        }
        return 0;
    }

    public String getPregunta(){
        return this.pregunta + " " + this.respuesta + " " + this.valor;
    }
}
