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
}
