package modelos;

import datos.Dataset;
import servicios.MetricaEvaluacion;

/**
 * Clase abstracta base que define la estructura y comportamiento común de cualquier modelo de ML.
 */
public abstract class Modelo {
    protected String nombre;
    protected int[] lossPorEpoca;
    protected int epocaActual;
    protected int mejorLossRegistrado;

    public Modelo(String nombre, int maxEpocas) {
        this.nombre = nombre;
        this.lossPorEpoca = new int[maxEpocas];
        this.epocaActual = 0;
        this.mejorLossRegistrado = Integer.MAX_VALUE;
    }

    // Método abstracto que será sobreescrito por las subclases
    public abstract double entrenar(Dataset d);

    /**
     * Registra el valor de loss de una época respetando la capacidad del arreglo.
     */
    public void registrarEpoca(int loss) {
        if (epocaActual < lossPorEpoca.length) {
            lossPorEpoca[epocaActual] = loss;
            epocaActual++;
        }
        if (loss < mejorLossRegistrado) {
            mejorLossRegistrado = loss;
        }
    }

    /**
     * Retorna el mejor loss registrado o Integer.MAX_VALUE si no se han registrado épocas.
     */
    public int mejorLoss() {
        if (epocaActual == 0) {
            return Integer.MAX_VALUE;
        }
        return mejorLossRegistrado;
    }

    /**
     * Delega la evaluación al servicio externo.
     */
    public double calcularMetrica(MetricaEvaluacion m) {
        return m.calcular(this, "accuracy");
    }

    public String getNombre() {
        return nombre;
    }

    public int[] getLossPorEpoca() {
        return lossPorEpoca;
    }

    public int getEpocaActual() {
        return epocaActual;
    }

    public int getMejorLossRegistrado() {
        return mejorLossRegistrado;
    }
}