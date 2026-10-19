# Comprensión del diseño — Enunciado B
**Nombre:** JUAN ESTEBAN FORERO PERDOMO

**Fecha:** 19/10/2026

Responde con tus palabras, basándote en `docs/UML-final.md`. Respuestas
concisas (2–4 líneas por pregunta). Evidencia que entendiste el contrato
**antes** de programar.

---

### 1. Herencia y polimorfismo
¿Por qué `Modelo` es una clase abstracta y no concreta? Menciona qué método
obliga a cada subclase a implementar y qué gana el sistema con eso.

> _Modelo es una clase abstracta porque define atributos y métodos comunes a cualquier tipo de arquitectura 
> de aprendizaje automático, pero no posee una lógica de entrenamiento universal. Obliga a cada subclase 
> (ModeloCNN, ModeloRNN, ModeloRegresion) a implementar el método abstracto entrenar(Dataset). 
> El sistema gana polimorfismo, permitiendo invocar el entrenamiento de forma unificada sin conocer la 
> clase exacta en tiempo de compilación._

---

### 2. Composición vs. agregación
Explica la diferencia entre `Experimento ◆— Modelo` (composición) y
`Plataforma ◇— Experimento` (agregación). ¿Qué pasaría con el modelo si se
elimina el experimento? ¿Y con los experimentos si se elimina la plataforma?

> _La composición (Experimento ◆— Modelo) implica que el modelo se crea internamente dentro del experimento 
> y su ciclo de vida depende de él; si se elimina el experimento, el modelo se destruye. En la agregación 
> (Plataforma ◇— Experimento), los experimentos se crean de forma independiente y la plataforma solo guarda 
> sus referencias en una lista; si la plataforma se elimina, los experimentos subsisten._

---

### 3. Asociación
En `Investigador — Experimento`, ¿quién es dueño de quién? ¿Por qué se modela
como N:M y no como composición?

> _En la relación Investigador — Experimento, ninguno es dueño del otro; es una colaboración bidireccional
> basada en referencias mutuas. Se modela como N:M porque un investigador puede gestionar múltiples 
> experimentos y un experimento puede involucrar a varios investigadores de forma simultánea, sin 
> restricciones de ciclo de vida ni exclusividad._

---

### 4. Dependencia
¿Por qué `Modelo` **depende** de `MetricaEvaluacion` en lugar de **tenerlo**
como atributo? ¿Qué ventaja tiene pasar el servicio como parámetro?

> _Modelo depende de MetricaEvaluacion porque el cálculo de rendimiento es una operación puntual y 
> transitoria (calcularMetrica), no un estado permanente del modelo. Pasarlo como parámetro desacopla 
> ambas clases, permitiendo evaluar el modelo con diferentes métricas dinámicamente sin saturar su 
> estructura interna con atributos innecesarios._

---

### 5. Listas
En este proyecto se usan dos estructuras distintas:
- `int[] lossPorEpoca` en `Modelo`
- `ArrayList<Experimento>` en `Plataforma`

Explica por qué en cada caso se eligió esa estructura y no la otra.

> _Se eligió el arreglo primitivo int[] lossPorEpoca porque el número máximo de épocas está acotado 
> desde la inicialización, optimizando memoria y rendimiento. Por el contrario, se usa ArrayList<Experimento> 
> en la plataforma porque la cantidad de experimentos es variable y dinámica, requiriendo una colección flexible 
> que permita adiciones en tiempo de ejecución._