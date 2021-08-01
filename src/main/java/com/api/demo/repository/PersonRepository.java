package com.api.demo.repository;

import java.util.List;
import com.api.demo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
    List<Person> findByFirstNameIgnoreCaseContainingOrLastNameIgnoreCaseContainingOrMiddleNameIgnoreCaseContaining(String firstName, String lastName, String middleName);
}