package br.com.tcsantos.simpleproject.person.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
@ApiModel(value = "Person", description = "People resource.")
public class Person implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private Long id;

    private String Name;

}