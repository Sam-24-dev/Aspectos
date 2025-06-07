# Aspectos
Tarea 1(Grupo 5)


## Funcionalidad Adicional: Sonido

Con el aspecto **SoundAspect** interceptamos cada llamada a  
`subject.Color.setColor(java.awt.Color)` y emitimos un “beep” del sistema  
usando `Toolkit.getDefaultToolkit().beep()`.  

- **Punto de unión**: todas las ejecuciones de `setColor(...)`.  
- **Advice**: `after` — se dispara justo después de cambiar el color.  
- **Objetivo**: mostrar cómo AOP permite inyectar funcionalidades (audio, logging, métricas, etc.)  
  sin modificar la lógica de la GUI ni el modelo de datos.  

