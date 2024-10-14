package NextTrip.backend.models;

import jakarta.persistence.*;

@Entity
@Table
public class TodoList {

    //attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int todoListId;

    @Column
    private int amount;
}
