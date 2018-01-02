package com.kodilla.good.patterns.challenges;

public class SmsService implements InformationService {

    @Override
    public void inform(User user) {
        System.out.println("Send sms to user: " + user.getUserName() + ". Mobile: " + user.getMobilePhone());
    }
}
