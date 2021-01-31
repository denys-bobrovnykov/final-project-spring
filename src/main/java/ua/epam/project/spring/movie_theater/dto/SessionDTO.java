package ua.epam.project.spring.movie_theater.dto;


import org.springframework.format.annotation.DateTimeFormat;
import ua.epam.project.spring.movie_theater.dto.validators.StartTimeConstraint;
import ua.epam.project.spring.movie_theater.entities.Movie;
import ua.epam.project.spring.movie_theater.entities.Seat;

import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

public class SessionDTO {
    @NotNull
    @FutureOrPresent(message = "alert.field.past.today")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dayOfSession;
    @NotNull
    @DateTimeFormat(pattern = "kk:mm:ss")
    @StartTimeConstraint(message = "error.field.start.time")
    private LocalTime timeStart;
    private Movie movie;
    private Set<Seat> seats;
    private int seatsBought;
    private String movieTitleEn;
    private String movieTitleUa;

    public String getMovieTitleEn() {
        return movieTitleEn;
    }

    public void setMovieTitleEn(String movieTitleEn) {
        this.movieTitleEn = movieTitleEn;
    }

    public String getMovieTitleUa() {
        return movieTitleUa;
    }

    public void setMovieTitleUa(String movieTitleUa) {
        this.movieTitleUa = movieTitleUa;
    }

    public Set<Seat> getSeats() {
        return seats;
    }

    public int getSeatsBought() {
        return seatsBought;
    }

    public void setSeatsBought(int seatsBought) {
        this.seatsBought = seatsBought;
    }

    public void setSeats(Set<Seat> seats) {
        this.seats = seats;
    }

    public LocalDate getDayOfSession() {
        return dayOfSession;
    }

    public void setDayOfSession(LocalDate dayOfSession) {
        this.dayOfSession = dayOfSession;
    }

    public LocalTime getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(LocalTime timeStart) {
        this.timeStart = timeStart;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    @Override
    public String toString() {
        return "SessionDTO{" +
                "dayOfWeek=" + dayOfSession +
                ", timeStart=" + timeStart +
                ", movie=" + movie +
                '}';
    }
}
