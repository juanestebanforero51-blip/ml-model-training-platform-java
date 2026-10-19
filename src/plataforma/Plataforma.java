package plataforma;
import java.util.ArrayList;
import java.util.List;


/**
 * Plataforma principal que agrupa múltiples experimentos mediante una lista dinámica (Agregación).
 */
public class Plataforma {
    private String nombre;
    private ArrayList<Experimento> experimentos;

    public Plataforma(String nombre) {
        this.nombre = nombre;
        this.experimentos = new ArrayList<>();
    }

    public void agregarExperimento(Experimento e) {
        if (e != null && !experimentos.contains(e)) {
            experimentos.add(e);
        }
    }

    public List<String> reporteMejorLoss() {
        List<String> reporte = new ArrayList<>();
        for (Experimento e : experimentos) {
            int mejor = (e.getModelo() != null) ? e.getModelo().mejorLoss() : -1;
            reporte.add(e.getId() + ": " + mejor);
        }
        return reporte;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Experimento> getExperimentos() {
        return experimentos;
    }
}