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

    //getters and setters
    public int getItineraryItemId() {
        return itineraryItemId;
    }

    public void setItineraryItemId(int itineraryItemId) {
        this.itineraryItemId = itineraryItemId;
    }

    public Itinerary getItinerary() {
        return itinerary;
    }

    public void setItinerary(Itinerary itinerary) {
        this.itinerary = itinerary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
