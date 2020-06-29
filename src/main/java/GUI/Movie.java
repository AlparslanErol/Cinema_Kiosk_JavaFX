package GUI;

import java.util.List;

public class Movie {
    private String title;
    private String date;
    private String time;
    private String directors;
    private String stars;
    private double rate;
    private String duration;
    private String summary;
    private String image;


    private List<Seat> seats;
    public Movie(List<Seat> seats) {
        this.seats = seats;
    }
    public List<Seat> getMovie() {
        return seats;
    }
    public void setMovie(List<Seat> seats) {
        this.seats = seats;
    }


    public Movie(String title, String date, String time, String directors, String stars, double rate, String duration, String summary, String image) {
        this.title = title;
        this.date = date;
        this.time = time;
        this.directors = directors;
        this.stars = stars;
        this.rate = rate;
        this.duration = duration;
        this.summary = summary;
        this.image = image;
    }

    public Movie() {}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDirectors() {
        return directors;
    }

    public void setDirectors(String directors) {
        this.directors = directors;
    }

    public String getStars() {
        return stars;
    }

    public void setStars(String stars) {
        this.stars = stars;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "Title='" + title + '\'' +
                ", Date='" + date + '\'' +
                ", Time='" + time + '\'' +
                ", Directors='" + directors + '\'' +
                ", Stars='" + stars + '\'' +
                ", Rate='" + rate + '\'' +
                ", Duration='" + duration + '\'' +
                ", Summary='" + summary + '\'' +
                ", Image='" + image + '\'' +
                '}';
    }
}