package org.todd.Sword.respository;

import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.todd.Sword.po.Person;

@Repository
@Table(name = "person")
@Qualifier("personRespository")
public interface IPersonRespository extends CrudRepository<Person, Integer> {

	
}
