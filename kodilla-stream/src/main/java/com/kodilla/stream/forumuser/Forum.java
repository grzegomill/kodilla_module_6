package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {

    private List<ForumUser> forumUsers;

    public Forum() {

        forumUsers = new ArrayList<>();

        int id = 0;

        forumUsers.add(new ForumUser(++id, "anna", 'F'
                , LocalDate.of(1985, 01, 5), 15));

        forumUsers.add(new ForumUser(++id, "jan", 'M'
                , LocalDate.of(1971, 11, 7), 5));

        forumUsers.add(new ForumUser(++id, "iga", 'F'
                , LocalDate.of(1999, 12, 1), 1));

        forumUsers.add(new ForumUser(++id, "paul", 'M'
                , LocalDate.of(1990, 12, 31), 0));

        forumUsers.add(new ForumUser(++id, "julia", 'F'
                , LocalDate.of(1989, 1, 17), 0));

        forumUsers.add(new ForumUser(++id, "greg", 'M'
                , LocalDate.of(1975, 7, 21), 12));

    }

    public List<ForumUser> getForumUsers() {
        return forumUsers;
    }
}
