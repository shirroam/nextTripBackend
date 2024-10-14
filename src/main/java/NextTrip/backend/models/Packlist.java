package NextTrip.backend.models;

import jakarta.persistence.*;

@Entity
@Table
public class Packlist {

    //attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int packlistId;

    @Column
    private int amount;
}
