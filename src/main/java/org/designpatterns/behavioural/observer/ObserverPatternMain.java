package org.designpatterns.behavioural.observer;

import org.designpatterns.behavioural.observer.observers.CloudNewsChannel;
import org.designpatterns.behavioural.observer.subjects.CloudNewsAgency;
import org.designpatterns.behavioural.observer.subjects.NewsAgency;

public class ObserverPatternMain {
    public static void main(String[] args) {
        NewsAgency newsAgency = new CloudNewsAgency();
        newsAgency.addObserver(new CloudNewsChannel());
        newsAgency.notifyObservers("ABCD");
    }
}
