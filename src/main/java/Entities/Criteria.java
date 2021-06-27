package Entities;

import org.springframework.beans.factory.annotation.Value;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.Date;

@Entity
public class Criteria {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    private String category;

    private String subcategory;

    private int level;

    private Date createdDateTime;

    @Min(0)
    @Max(10)
    private int overAllScore;

}
