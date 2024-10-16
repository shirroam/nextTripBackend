package NextTrip.backend.models;

import jakarta.persistence.*;

@Entity
@Table
public class TodoListItem {

    //attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int todoListItemId;

    @Column
    private String description;

    @Column
    private String status;
}
