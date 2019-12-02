package br.com.tcsantos.simpleproject.person.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tcsantos.simpleproject.person.domain.Person;
import br.com.tcsantos.simpleproject.person.repository.PersonRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("api/people")
@Api(description = "Rest API for people resource", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping
    @ApiOperation(value = "Find all people", response = Person.class)
    public List<Person> findAll() {
        return personRepository.findAll();
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "Find person by id", response = Person.class)
    public Person find(@PathVariable("id") Long id) {
        return personRepository.findById(id).get();
    }

    @PutMapping("/{id}")
    @ApiOperation(value = "Update person by id", response = Person.class)
    public Person update(@RequestBody Person person) {
        return personRepository.save(person);
    }

    @PostMapping
    @ApiOperation(value = "Save new person", response = Person.class)
    public Person save(@RequestBody Person person) {
        return personRepository.save(person);
    }

}