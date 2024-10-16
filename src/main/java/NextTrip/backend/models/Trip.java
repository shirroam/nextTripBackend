package NextTrip.backend.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table
public class Trip {

    //attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tripId;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    @Column
    private String name;

    @Column
    private Date startDate;

    @Column
    private Date endDate;

    @Column
    private Date createdDate;

    @Column
    private String destination;

    @Column
    private String status;

    @Column
    private String transportMode;

    //getters and setters
    public int getTripId() {
        return tripId;
    }

    public void setTripId(int tripId) {
        this.tripId = tripId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTransportMode() {
        return transportMode;
    }

    public void setTransportMode(String transportMode) {
        this.transportMode = transportMode;
    }
}
