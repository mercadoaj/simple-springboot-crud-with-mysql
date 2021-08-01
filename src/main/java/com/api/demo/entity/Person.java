
package com.api.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Objects;


@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String middleName;

    private String lastName;

    private final LocalDate createDate;

    private LocalDate birthDate;

    public Person(String firstName, String middleName, String lastName, LocalDate birthDate){
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.createDate = LocalDate.now();
    }
    protected Person(){ this.createDate = LocalDate.now();}

    public Long getId(){
        return this.id;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getMiddleName(){
        return this.middleName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public LocalDate getCreateDate(){
        return this.createDate;
    }
    public LocalDate getBirthDate(){
        return this.birthDate;
    }

    public void setId(Long id){
        this.id = id;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setMiddleName(String middleName){
        this.middleName = middleName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setBirthDate(LocalDate birthDate){
        this.birthDate = birthDate;
    }


    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof Person))
            return false;
        Person person = (Person) o;
        return Objects.equals(this.id, person.getId());
    }

  @Override
  public int hashCode() {
    return Objects.hash(this.id, this.birthDate);
  }

}

