package code.projectantoanfinal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import code.projectantoanfinal.entities.Person;
import code.projectantoanfinal.repository.PersonDao;

@Service
public class PersonService {

	@Autowired
	private PersonDao dao;

	public List<Person> findAllPersons() {
		return (List<Person>) dao.findAll();
	}

	public void addPerson(Person person) {
		dao.save(person);
	}

	public void addListPerson(List<Person> persons) {
		dao.saveAll(persons);
	}

}
