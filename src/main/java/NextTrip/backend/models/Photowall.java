package NextTrip.backend.models;

import jakarta.persistence.*;

@Entity
@Table
public class Photowall {

    //attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int photowallId;

    @Column
    private String url;
}
