package com.terreivoire.Terre_ivoire_back.service.impl;

import com.terreivoire.Terre_ivoire_back.model.Person;
import com.terreivoire.Terre_ivoire_back.repository.PersonRepo;
import com.terreivoire.Terre_ivoire_back.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepo personRepo;
    @Override
    public List<Person> findAll() {
        List<Person> personList = new ArrayList<Person>();
       // personRepo.findAll().forEach(personList::add);
        personRepo.findAll().iterator().forEachRemaining(personList::add);
        return personList;
    }

    @Override
    public Optional<Person> findById(Long idPerson) {
        return personRepo.findById(idPerson);
    }

    @Override
    public Person addPerson(Person person) {
        return personRepo.save(person);
    }

    @Override
    public void updatePerson(Long idPeople, Person person) {
        person.setId(idPeople);
        personRepo.save(person);
    }

    @Override
    public void deletePerson(Long idPeople) {
        personRepo.deleteById(idPeople);

    }


}
