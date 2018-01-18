package com.kodilla.patterns.strategy.social.user;

import com.kodilla.patterns.strategy.social.publisher.SnapchatPublisher;

public final class ZGeneration extends User {

    public ZGeneration(String name) {

        super(name);

        this.socialPublisher = new SnapchatPublisher();
    }
}
