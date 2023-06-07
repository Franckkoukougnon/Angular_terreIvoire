package com.terreivoire.Terre_ivoire_back.controller;


import com.terreivoire.Terre_ivoire_back.model.Person;
import com.terreivoire.Terre_ivoire_back.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/all")
    private List<Person> findAll() {
     return personService.findAll();
    }

    @GetMapping("/{id}")
    private Optional<Person> findById(@PathVariable("id") Long idPerson) {
        return personService.findById(idPerson);
    }

    @PostMapping("/add")
    private Person addPerson(@RequestBody Person person) {
        return personService.addPerson(person);
    }

    @PutMapping("/{idPeople}")
    public void updatePerson(@PathVariable("idPeople") Long idPeople,@RequestBody Person person) {
        personService.updatePerson(idPeople,person);
    }

    @DeleteMapping("/{idPeople}")
    public void deletePerson(@PathVariable("idPeople") Long idPeople) {
        personService.deletePerson(idPeople);
    }


}
