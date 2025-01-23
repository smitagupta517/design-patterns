package org.designpatterns.behavioural.observer.subjects;

import org.designpatterns.behavioural.observer.observers.Channel;

import java.util.ArrayList;
import java.util.List;

public class CloudNewsAgency implements NewsAgency{
    private String news;
    List<Channel> channels = new ArrayList<>();

    @Override
    public void addObserver(Channel channel) {
        channels.add(channel);
    }

    @Override
    public void removeObserver(Channel channel) {
        channels.remove(channel);
    }

    @Override
    public void notifyObservers(String news) {
        this.news = news;
        for(Channel channel: channels){
            channel.update(this.news);
        }
    }
}
