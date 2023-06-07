package com.terreivoire.Terre_ivoire_back.service;

import com.terreivoire.Terre_ivoire_back.model.Person;

import java.util.List;
import java.util.Optional;

public interface PersonService {
    List<Person> findAll();

    Optional<Person> findById(Long idPerson);

    Person addPerson(Person person);

    void updatePerson(Long idPeople, Person person);

    void deletePerson(Long idPeople);
}
