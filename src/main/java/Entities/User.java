package Entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
public class User {

    @Id
    @GeneratedValue
    private long id;

    @NotNull
    private String username;

    @Pattern(regexp="(^$|[0-9]{10})")
    private String phoneNumber;



}
