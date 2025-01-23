package org.designpatterns.behavioural.observer.subjects;

import org.designpatterns.behavioural.observer.observers.Channel;

public interface NewsAgency {
    void addObserver(Channel channel);
    void removeObserver(Channel channel);
    void notifyObservers(String news);
}
