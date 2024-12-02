package Crud.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import Crud.dto.Student;

@Component
public class StudentDao {
	

	@Autowired
	
	EntityManager manager;


	public void save(Student student) {
		
		manager.getTransaction().begin();
		manager.persist(student);
		manager.getTransaction().commit();
			
	}
	
	public List<Student> fetchAll() {
		
		return manager.createQuery("select x from Student x").getResultList();
		
	}

	public void delete(int id) {
		manager.getTransaction().begin();
		manager.remove(find(id));
		manager.getTransaction().commit();
		
	}

	public Student find(int id) {
		return manager.find(Student.class, id);
	}

	
	public void update(Student student) {
		manager.getTransaction().begin();
		manager.merge(student);
		manager.getTransaction().commit();
	}


}
