package aspects;

// Declaras el aspecto y le das un nombre
public aspect SoundAspect {

    // Punto de unión: cualquier ejecución de setColor(Color) en tu clase subject.Color
    pointcut colorChange(subject.Color subj, java.awt.Color c):
        execution(void subject.Color.setColor(java.awt.Color))
        && this(subj)
        && args(c);

    // Advice after: tras cada cambio de color, emite un beep
    after(subject.Color subj, java.awt.Color c): colorChange(subj, c) {
        java.awt.Toolkit.getDefaultToolkit().beep();
    }
}

