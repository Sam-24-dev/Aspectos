package aspects;

import subject.Color;

public aspect ObserverAspect {
    // Captura setColor(java.awt.Color) en subject.Color
    pointcut colorChange(Color subj, java.awt.Color c):
        execution(void subject.Color.setColor(java.awt.Color))
        && this(subj)
        && args(c);

    // Después de setColor, notificamos y logueamos
    after(Color subj, java.awt.Color c): colorChange(subj, c) {
        subj.notifyAllObservers();
        System.out.println("Color cambiado a: " + c);
    }
}
