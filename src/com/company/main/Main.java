package com.company.main;

import com.company.observable.YouTubeChannel;
import com.company.observers.YouTubeSubscriber;

public class Main {
    public static void main(String[] args) {

        YouTubeChannel labelcom = new YouTubeChannel("LABELCOM");
        YouTubeChannel vGostiahUGordona = new YouTubeChannel("Дмитрий Гордон");

        YouTubeSubscriber madikhan = new YouTubeSubscriber("Madikhan");
        YouTubeSubscriber mirkhat = new YouTubeSubscriber("Mirkhat");
        YouTubeSubscriber gabiden = new YouTubeSubscriber("Gabiden");
        YouTubeSubscriber madi = new YouTubeSubscriber("Madi");
        YouTubeSubscriber nurbolat = new YouTubeSubscriber("Nurbolat");


        labelcom.toAdd(madikhan);
        madikhan.setYouTubeChannels(labelcom.getName(), labelcom);
        vGostiahUGordona.toAdd(madikhan);
        madikhan.setYouTubeChannels(vGostiahUGordona.getName(), vGostiahUGordona);

        labelcom.toAdd(mirkhat);
        mirkhat.setYouTubeChannels(labelcom.getName(), labelcom);
        vGostiahUGordona.toAdd(mirkhat);
        mirkhat.setYouTubeChannels(vGostiahUGordona.getName(), vGostiahUGordona);

        labelcom.toAdd(gabiden);
        gabiden.setYouTubeChannels(labelcom.getName(), labelcom);
        vGostiahUGordona.toAdd(gabiden);
        gabiden.setYouTubeChannels(vGostiahUGordona.getName(), vGostiahUGordona);

        labelcom.toAdd(madi);
        madi.setYouTubeChannels(labelcom.getName(), labelcom);
        vGostiahUGordona.toAdd(madi);
        madi.setYouTubeChannels(vGostiahUGordona.getName(), vGostiahUGordona);

        labelcom.toAdd(nurbolat);
        nurbolat.setYouTubeChannels(labelcom.getName(), labelcom);
        vGostiahUGordona.toAdd(nurbolat);
        nurbolat.setYouTubeChannels(vGostiahUGordona.getName(), vGostiahUGordona);





        labelcom.setNameOfNewVideo("Моргенштерн х Егор Крид | ЧТО БЫЛО ДАЛЬШЕ?");

        vGostiahUGordona.setNameOfNewVideo("Музыкант Jah Khalib. \"В гостях у Дмитрия Гордона\"(2019)");


    }
}
