package br.com.tcsantos.simpleproject.person.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.tcsantos.simpleproject.person.domain.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}