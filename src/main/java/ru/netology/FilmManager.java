package ru.netology;

public class FilmManager {
    private String[] movies = new String[0];
    private int limit;

    public FilmManager(int limit) {
        this.limit = limit;
    }

    public FilmManager() {
        this.limit = 10;

    }


    public void addFilm(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int allFilm;
        if (movies.length < limit) {
            allFilm = movies.length;
        } else {
            allFilm = limit;
        }
        String[] result = new String[allFilm];
        for (int i = 0; i < result.length; i++) {
            result[i] = movies[movies.length - 1 - i];
        }
        return result;
    }
}
