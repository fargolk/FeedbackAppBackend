package Entities;

import javax.persistence.*;

@Entity
public class UserFeedback {

    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    @JoinColumn(name="feedback_id")
    private Feedback feedback;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;


}
