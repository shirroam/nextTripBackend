package NextTrip.backend.models;

import jakarta.persistence.*;

@Entity
@Table
public class User {

    //attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    @Column
    private String name;

    @Column
    private String email;

    @Column
    private String password;


}
