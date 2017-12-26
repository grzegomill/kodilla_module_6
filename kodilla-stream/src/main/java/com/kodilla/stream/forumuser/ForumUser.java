package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    final int identifier;
    final String userName;
    final char sex;
    final LocalDate birthDate;
    final int publicPostCount;

    public ForumUser(final int identifier, final String userName, final char sex,
                     final LocalDate birthDate, final int publicPostCount) {
        this.identifier = identifier;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = birthDate;
        this.publicPostCount = publicPostCount;
    }

    public int getIdentifier() {
        return identifier;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPublicPostCount() {
        return publicPostCount;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "identifier=" + identifier +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", publicPostCount=" + publicPostCount +
                '}';
    }
}
