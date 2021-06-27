package Entities;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
public class Feedback {

    @Id
    @GeneratedValue
    private long id;

    private Date createdDateTime;

    @Min(0)
    @Max(10)
    private int score;

    @Size(max = 1000)
    private String text;

    @ManyToOne
    @JoinColumn(name="criteria_id")
    private Criteria criteria;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

}
