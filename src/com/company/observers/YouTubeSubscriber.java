package com.company.observers;

import com.company.interfaces.IObserver;
import com.company.observable.YouTubeChannel;

import java.util.HashMap;
import java.util.Map;

public class YouTubeSubscriber implements IObserver {

    String name;
    Map<String, YouTubeChannel> youTubeChannels = new HashMap<>();

    public YouTubeSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String name) {

        System.out.println("Hey " +
                this.name +
                "! " +
                "In the " +
                this.youTubeChannels.get(name).getName() +
                " channel a new video: " +
                this.youTubeChannels.get(name).getNameOfNewVideo() +
                " - has been released!");
        System.out.println("______________________________________________________________________________________________________________________________________________________");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, YouTubeChannel> getYouTubeChannels() {
        return this.youTubeChannels;
    }

    public void setYouTubeChannels(String name, YouTubeChannel youTubeChannel) {
        this.youTubeChannels.put(name, youTubeChannel);
    }
}
