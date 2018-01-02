package com.kodilla.good.patterns.challenges;

public class EmailService implements InformationService {

    @Override
    public void inform(User user) {
        System.out.println("Send email to user: " + user.getUserName() + ". Email: " + user.getEmail());
    }
}
