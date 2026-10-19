package usuarios;

import plataforma.Experimento;
import java.util.ArrayList;


/**
 * Representa a un investigador que colabora en múltiples experimentos (Asociación N:M).
 */
public class Investigador {
    private String nombre;
    private ArrayList<Experimento> experimentos; // Asociación bidireccional mediante lista

    public Investigador(String nombre) {
        this.nombre = nombre;
        this.experimentos = new ArrayList<>();
    }

    /**
     * Asocia un experimento al investigador evitando duplicados.
     */
    public void asociarExperimento(Experimento e) {
        if (e != null && !experimentos.contains(e)) {
            experimentos.add(e);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Experimento> getExperimentos() {
        return experimentos;
    }
}