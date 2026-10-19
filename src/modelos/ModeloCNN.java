package modelos;

import datos.Dataset;

/**
 * Subclase que representa un modelo de Red Neuronal Convolucional (CNN).
 */
public class ModeloCNN extends Modelo {
    private int numFiltros;

    public ModeloCNN(String nombre, int maxEpocas, int numFiltros) {
        super(nombre, maxEpocas);
        this.numFiltros = numFiltros;
    }

    @Override
    public double entrenar(Dataset d) {
        // Registra una época inicial para actualizar el estado del modelo
        registrarEpoca(10);
        return 10.0;
    }

    public int getNumFiltros() {
        return numFiltros;
    }
}