package com.xworkz.app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.app.dto.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	public EmployeeDaoImpl() {
System.out.println("----EmployeeDaoImpl---------------");	}
	@Autowired
	private EntityManagerFactory factory;
	private EntityManager entityManager=null;

	public Employee save(Employee employee) {
		System.out.println("--employee Dao---------");
		boolean isEmployeeSaved=false;
		try {
		entityManager=factory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(employee);
		transaction.commit();
		System.out.println("--employee saved---------");

		isEmployeeSaved=true;
		//entityManager.close();
		//factory.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return isEmployeeSaved? employee : null;
	}

	public List<Employee> searchByEmployeeFirstName(String firstname) {
		List<Employee> employee = null;
		try {
			entityManager = factory.createEntityManager();
			Query query = entityManager.createQuery("SELECT s FROM Employee s WHERE s.firstname LIKE :firstname");
			query.setParameter("firstname", firstname+"%");
			employee =  query.getResultList();
			System.out.println("-------firstname------" + employee.toString());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
		}
		return employee;
	}

}
