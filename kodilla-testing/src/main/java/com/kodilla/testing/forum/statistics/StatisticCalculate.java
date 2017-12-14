package com.kodilla.testing.forum.statistics;

public class StatisticCalculate {
    /*
    Ilość użytkowników
    Ilość postów
    Ilość komentarzy
    Średnia ilość postów na użytkownika
    Średnia ilość komentarzy na użytkownika
    Średnia ilość komentarzy na post
*/
    private int usersCount;
    private int postsCount;
    private int commentCount;
    private double avgPostsPerUser;
    private double avgCommentsPerUser;
    private double avgCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics) {

        postsCount = statistics.postsCount();
        commentCount = statistics.commentsCount();
        usersCount = statistics.usersNames().size();

        avgPostsPerUser = (usersCount == 0) ? 0 : (double) postsCount / usersCount;
        avgCommentsPerPost = (postsCount == 0) ? 0 : (double) commentCount / postsCount;
        avgCommentsPerUser = (usersCount == 0) ? 0 : (double) commentCount / usersCount;

    }

    public int getUsersCount() {
        return usersCount;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public double getAvgPostsPerUser() {
        return avgPostsPerUser;
    }

    public double getAvgCommentsPerUser() {
        return avgCommentsPerUser;
    }

    public double getAvgCommentsPerPost() {
        return avgCommentsPerPost;
    }

    public void showStatistics() {
        System.out.println("usersCount: " + usersCount);
        System.out.println("postsCount: " + postsCount);
        System.out.println("commentCount: " + commentCount);
        System.out.println("avgPostsPerUser: " + avgPostsPerUser);
        System.out.println("avgCommentsPerUser: " + avgCommentsPerUser);
        System.out.println("avgCommentsPerPost: " + avgCommentsPerPost);
    }
}
