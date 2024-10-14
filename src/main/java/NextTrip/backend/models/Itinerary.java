package NextTrip.backend.models;

import jakarta.persistence.*;

@Entity
@Table
public class Itinerary {

    //attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int itineraryId;

    @Column
    private int amount;
}
