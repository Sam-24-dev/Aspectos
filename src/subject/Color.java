package subject;


import observer.Observer;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;




public class Color implements Subject {
	 private List<Observer> observers = new CopyOnWriteArrayList<>();
	    private java.awt.Color color;

	    @Override
	    public void register(Observer o) {
	        observers.add(o);
	    }

	    @Override
	    public void unregister(Observer o) {
	        observers.remove(o);
	    }

	    // Cambia el estado; el aspect llamará a notifyAllObservers()
	    public void setColor(java.awt.Color c) {
	        this.color = c;
	    }

	    public java.awt.Color getColor() {
	        return color;
	    }

	    // Notifica a todos los observers
	    public void notifyAllObservers() {
	        for (Observer o : observers) {
	            o.update(color);
	        }
	    }
	
	
	
}
