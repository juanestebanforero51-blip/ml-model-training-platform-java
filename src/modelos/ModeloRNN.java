package modelos;

import datos.Dataset;

/**
 * Subclase que representa un modelo de Red Neuronal Recurrente (RNN).
 */
public class ModeloRNN extends Modelo {
    private int numCapas;

    public ModeloRNN(String nombre, int maxEpocas, int numCapas) {
        super(nombre, maxEpocas);
        this.numCapas = numCapas;
    }

    @Override
    public double entrenar(Dataset d) {
        // Registra una época inicial para actualizar el estado del modelo
        registrarEpoca(15);
        return 15.0;
    }

    public int getNumCapas() {
        return numCapas;
    }
}
