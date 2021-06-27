package Entities;

import javax.persistence.*;

@Entity
public class FeedbackCriteria {

    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    @JoinColumn(name="feedback_id")
    private Feedback feedback;

    @ManyToOne
    @JoinColumn(name="criteria_id")
    private Criteria criteria;

}
