package modelos;

import datos.Dataset;

/**
 * Subclase que representa un modelo de Regresión.
 */
public class ModeloRegresion extends Modelo {
    private int grado;

    public ModeloRegresion(String nombre, int maxEpocas, int grado) {
        super(nombre, maxEpocas);
        this.grado = grado;
    }

    @Override
    public double entrenar(Dataset d) {
        // Registra una época inicial para actualizar el estado del modelo
        registrarEpoca(20);
        return 20.0;
    }

    public int getGrado() {
        return grado;
    }
}