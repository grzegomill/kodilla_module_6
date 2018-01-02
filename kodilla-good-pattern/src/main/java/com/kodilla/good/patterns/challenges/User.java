package com.kodilla.good.patterns.challenges;

public final class User {

    final private String userName;
    final private String email;
    final private String mobilePhone;
    final private PreferredContactType preferredContact;

    public User(String userName, String email, String mobilePhone, PreferredContactType preferredContact) {
        this.userName = userName;
        this.email = email;
        this.mobilePhone = mobilePhone;
        this.preferredContact = preferredContact;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public PreferredContactType getPreferredContact() {
        return preferredContact;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", mobilePhone='" + mobilePhone + '\'' +
                ", preferredContact=" + preferredContact +
                '}';
    }
}
