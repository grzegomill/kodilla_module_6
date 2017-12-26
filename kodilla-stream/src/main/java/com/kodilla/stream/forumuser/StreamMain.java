package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

// StreamMain for forum user

public class StreamMain {

    public static void main(String[] args) {

        final Forum forum = new Forum();

        final Map<Integer, ForumUser> userMap = forum.getForumUsers().stream()
                .filter(x -> x.getSex() == 'M')
                .filter(x -> !x.getBirthDate().isAfter(LocalDate.now().plusYears(-20)))
                .filter(x -> x.getPublicPostCount() > 0)
                .collect(Collectors.toMap(ForumUser::getIdentifier, forumUser -> forumUser));

        userMap.entrySet().stream()
                .map(e -> e.getKey() + " : " + e.getValue())
                .forEach(System.out::println);
    }
}
