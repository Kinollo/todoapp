package pl.sda.todoapp;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue
    long id;
   private String name;
   private String surname;
   private String mail;
}
