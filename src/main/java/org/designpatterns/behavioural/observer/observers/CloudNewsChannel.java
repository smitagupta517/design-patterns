package org.designpatterns.behavioural.observer.observers;

public class CloudNewsChannel implements Channel{
    @Override
    public void update(String news) {
        System.out.println(news + " by News channel cloud");
    }
}
