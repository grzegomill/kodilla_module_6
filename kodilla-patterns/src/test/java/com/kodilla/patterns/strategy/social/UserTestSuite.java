package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publisher.FacebookPublisher;
import com.kodilla.patterns.strategy.social.publisher.SnapchatPublisher;
import com.kodilla.patterns.strategy.social.publisher.TwitterPublisher;
import com.kodilla.patterns.strategy.social.user.Millenials;
import com.kodilla.patterns.strategy.social.user.User;
import com.kodilla.patterns.strategy.social.user.YGeneration;
import com.kodilla.patterns.strategy.social.user.ZGeneration;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public final class UserTestSuite {


    @Test
    public void testDefaultSharingStrategies() {

        //given
        final User millennials = new Millenials("Kornel");
        final User yGeneration = new YGeneration("Paula");
        final User zGeneration = new ZGeneration("Viki");

        //when
        final String mShare = millennials.sharePost();
        final String yShare = yGeneration.sharePost();
        final String zShare = zGeneration.sharePost();

        System.out.println(millennials.getName() + " " + mShare);
        System.out.println(yGeneration.getName() + " " + yShare);
        System.out.println(zGeneration.getName() + " " + zShare);

        //then
        assertEquals("Kornel uses Facebook", millennials.getName() + " " + mShare);
        assertEquals("Paula uses Twitter", yGeneration.getName() + " " + yShare);
        assertEquals("Viki uses Snapchat", zGeneration.getName() + " " + zShare);
    }


    @Test
    public void testIndividualSharingStrategy() {

        //given
        final User millennials = new Millenials("Kornel");
        final User yGeneration = new YGeneration("Paula");
        final User zGeneration = new ZGeneration("Viki");

        //when
        millennials.setSocialPublisher(new TwitterPublisher());
        yGeneration.setSocialPublisher(new SnapchatPublisher());
        zGeneration.setSocialPublisher(new FacebookPublisher());

        final String mShare = millennials.sharePost();
        final String yShare = yGeneration.sharePost();
        final String zShare = zGeneration.sharePost();

        System.out.println(millennials.getName() + " " + mShare);
        System.out.println(yGeneration.getName() + " " + yShare);
        System.out.println(zGeneration.getName() + " " + zShare);

        //then
        assertEquals("Kornel uses Twitter", millennials.getName() + " " + mShare);
        assertEquals("Paula uses Snapchat", yGeneration.getName() + " " + yShare);
        assertEquals("Viki uses Facebook", zGeneration.getName() + " " + zShare);
    }
}
