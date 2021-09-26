package com.company.observable;

import com.company.interfaces.IObservable;
import com.company.interfaces.IObserver;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements IObservable {

    private String name;
    private List<IObserver> subscribers = new ArrayList<>();
    private String nameOfNewVideo;

    public YouTubeChannel(String name) {
        this.name = name;
    }

    @Override
    public void toAdd(IObserver subscriber) {
        this.subscribers.add(subscriber);
    }

    @Override
    public void toRemove(IObserver subscriber) {
        this.subscribers.remove(subscriber);
    }

    @Override
    public void toNotify() {
        for(IObserver subscriber : this.subscribers) {
            subscriber.update(this.name);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameOfNewVideo() {
        return nameOfNewVideo;
    }

    public void setNameOfNewVideo(String nameOfNewVideo) {
        this.nameOfNewVideo = nameOfNewVideo;
        toNotify();
    }

}
