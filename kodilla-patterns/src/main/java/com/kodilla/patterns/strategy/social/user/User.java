package com.kodilla.patterns.strategy.social.user;

import com.kodilla.patterns.strategy.social.publisher.SocialPublisher;

public class User {

    private final String name;

    protected SocialPublisher socialPublisher;

    public User(String name) {
        this.name = name;
    }

    public String sharePost() {

        return socialPublisher.share();

    }

    public void setSocialPublisher(SocialPublisher socialPublisher) {

        this.socialPublisher = socialPublisher;
    }

    public String getName() {

        return name;
    }
}
