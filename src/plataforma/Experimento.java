package plataforma;

import datos.Dataset;
import modelos.*;

import datos.Dataset;

/**
 * Representa un experimento que administra un modelo de manera interna (Composición).
 */

import datos.Dataset;
public class Experimento {
    private String id;
    private Modelo modelo;

    public Experimento(String id, String tipoModelo, int maxEpocas) {
        this.id = id;
        if (tipoModelo != null) {
            String tipo = tipoModelo.toUpperCase();
            if (tipo.contains("CNN")) {
                this.modelo = new ModeloCNN("CNN-Model", maxEpocas, 32);
            } else if (tipo.contains("RNN")) {
                this.modelo = new ModeloRNN("RNN-Model", maxEpocas, 2);
            } else if (tipo.contains("REGRESION") || tipo.contains("REGRESIÓN")) {
                this.modelo = new ModeloRegresion("Regresion-Model", maxEpocas, 1);
            } else {
                this.modelo = null;
            }
        } else {
            this.modelo = null;
        }
    }

    public double ejecutar(Dataset d) {
        if (modelo != null) {
            return modelo.entrenar(d);
        }
        return 0.0;
    }

    public String getId() {
        return id;
    }

    public Modelo getModelo() {
        return modelo;
    }
}