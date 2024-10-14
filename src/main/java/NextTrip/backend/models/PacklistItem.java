package NextTrip.backend.models;

import jakarta.persistence.*;

@Entity
@Table
public class PacklistItem {

    //attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int packlistItemId;

    @Column
    private String name;
}
