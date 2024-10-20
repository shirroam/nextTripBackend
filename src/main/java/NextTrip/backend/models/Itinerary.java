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
}
