package NextTrip.backend.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table
public class ItineraryItem {

    //attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int itineraryItemId;

    @ManyToOne
    @JoinColumn(name = "itineraryId")
    private Itinerary itinerary;

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private Date startDate;

    @Column
    private Date endDate;

    @Column
    private String label;

    @Column
    private int price;
}
