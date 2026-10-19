package servicios;

import modelos.Modelo;

/**
 * Servicio que calcula métricas de evaluación para un modelo.
 * Se usa como DEPENDENCIA desde Modelo.calcularMetrica(MetricaEvaluacion).
 */
import modelos.Modelo;

/**
 * Servicio encargado de calcular las métricas de evaluación de un modelo de forma externa (Dependencia).
 */
public class MetricaEvaluacion {

    /**
     * Calcula una métrica basada en el mejor loss obtenido por el modelo.
     */
    public double calcular(Modelo modelo, String nombreMetrica) {
        int mejor = modelo.mejorLoss();
        if (mejor == Integer.MAX_VALUE) {
            return 0.0;
        }
        return 100.0 / (1.0 + mejor);
    }
}