package datos;

/**
 * Representa un conjunto de datos (Dataset) utilizado para entrenar los modelos de ML.
 */
public class Dataset {
    private String nombre;          // Nombre del dataset
    private int cantidadMuestras;   // Cantidad de muestras que contiene el dataset

    /**
     * Constructor para inicializar el dataset con su nombre y muestras.
     */
    public Dataset(String nombre, int cantidadMuestras) {
        this.nombre = nombre;
        this.cantidadMuestras = cantidadMuestras;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidadMuestras() {
        return cantidadMuestras;
    }
}