package subject;

import observer.Observer;

public interface Subject {

	
	void register(Observer o);
    void unregister(Observer o);
	
}
