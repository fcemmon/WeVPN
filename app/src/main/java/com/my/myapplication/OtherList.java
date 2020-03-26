package com.my.myapplication;

import java.util.ArrayList;
import java.util.List;

public final class OtherList {
    public static final String MOVIE_CATEGORY[] = {
            "Recent Locations",
            "All Locations",
    };

    private static List<Other> list;
    private static long count = 0;

    public static List<Other> getList() {
        if (list == null) {
            list = setupOthers();
        }
        return list;
    }

    public static List<Other> setupOthers() {
        list = new ArrayList<>();
        String title[] = {
                "Introducing Recent Locations",
                "Introducing All locations"
        };
        String bgImageUrl[] = {
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/Zeitgeist/Zeitgeist%202010_%20Year%20in%20Review/bg.jpg",
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/Demo%20Slam/Google%20Demo%20Slam_%2020ft%20Search/bg.jpg",
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Gmail%20Blue/bg.jpg",
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Fiber%20to%20the%20Pole/bg.jpg",
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Nose/bg.jpg",
        };
        String cardImageUrl[] = {
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/Zeitgeist/Zeitgeist%202010_%20Year%20in%20Review/card.jpg",
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/Demo%20Slam/Google%20Demo%20Slam_%2020ft%20Search/card.jpg",
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Gmail%20Blue/card.jpg",
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Fiber%20to%20the%20Pole/card.jpg",
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Nose/card.jpg"
        };

        for (int index = 0; index < title.length; ++index) {
            list.add(
                    buildOtherInfo(
                            title[index],
                            cardImageUrl[index],
                            bgImageUrl[index]));
        }

        return list;
    }

    private static Other buildOtherInfo(
            String title,
            String cardImageUrl,
            String backgroundImageUrl) {
        Other other = new Other();
        other.setId(count++);
        other.setTitle(title);
        other.setCardImageUrl(cardImageUrl);
        other.setBackgroundImageUrl(backgroundImageUrl);
        return other;
    }
}
