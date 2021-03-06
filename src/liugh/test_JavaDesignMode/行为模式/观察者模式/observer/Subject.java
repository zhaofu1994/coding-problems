package liugh.test_JavaDesignMode.行为模式.观察者模式.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 主题或抽象通知者
 * 
 */
public abstract class Subject {
    private List<Observer> observers = new ArrayList<Observer>();

    public void attach(Observer observer) {
	observers.add(observer);
    }

    public void detach(Observer observer) {
	observers.remove(observer);
    }

    public void notifyObserver() {
	for (Observer observer : observers) {
	    observer.update();
	}
    }
}
