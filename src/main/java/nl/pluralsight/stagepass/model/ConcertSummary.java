package nl.pluralsight.stagepass.model;

import java.math.BigDecimal;

public class ConcertSummary {
    private Long concertId;
    private String concertTitle;
    private int totalSeats;
    private int seatsBooked;
    private int availableSeats;
    private BigDecimal totalRevenue;

    public ConcertSummary(Long concertId, String concertTitle, int totalSeats, int seatsBooked, int availableSeats,
                          BigDecimal totalRevenue) {
        this.concertId = concertId;
        this.concertTitle = concertTitle;
        this.totalSeats = totalSeats;
        this.seatsBooked = seatsBooked;
        this.availableSeats = availableSeats;
        this.totalRevenue = totalRevenue;
    }


    public Long getConcertId() {
        return concertId;
    }

    public void setConcertId(Long concertId) {
        this.concertId = concertId;
    }

    public String getConcertTitle() {
        return concertTitle;
    }

    public void setConcertTitle(String concertTitle) {
        this.concertTitle = concertTitle;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public int getSeatsBooked() {
        return seatsBooked;
    }

    public void setSeatsBooked(int seatsBooked) {
        this.seatsBooked = seatsBooked;
    }

    public int getSeatsAvailable() {
        return totalSeats - seatsBooked;
    }

    public BigDecimal getTotalRevenue(){
        return totalRevenue;
    }

}

