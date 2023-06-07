package com.terreivoire.Terre_ivoire_back.repository;

import com.terreivoire.Terre_ivoire_back.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepo extends CrudRepository<Person, Long> {
}
