package code.projectantoanfinal.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import code.projectantoanfinal.entities.Person;

@Transactional
public interface PersonDao extends CrudRepository<Person, Long>{

}
