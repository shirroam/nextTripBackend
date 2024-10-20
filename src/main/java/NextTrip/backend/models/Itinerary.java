package NextTrip.backend.models;

import jakarta.persistence.*;

@Entity
@Table
public class Itinerary {

    //attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int itineraryId;

    @OneToOne
    @JoinColumn(name = "tripId")
    private Trip trip;

    @Column
    private int amount;

    //getters and setters
    public int getItineraryId() {
        return itineraryId;
    }

    public void setItineraryId(int itineraryId) {
        this.itineraryId = itineraryId;
    }

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
