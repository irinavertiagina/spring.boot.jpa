package com.irinav.spring.boot.spring_boot.dao;

import com.irinav.spring.boot.spring_boot.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

/**
 * Author irkin
 **/
@Repository
public class EmployeeDAOEmpl implements EmployeeDAO{

    @Autowired
    private EntityManager entityManager ;

    @Override
    public List<Employee> getAllEmployee() {
//        Session session = entityManager.unwrap(Session.class);
//        Query<Employee> query = session.createQuery(" from Employee", Employee.class);
//        List<Employee> allEmp = query.getResultList();
        Query query = entityManager.createQuery("from Employee");
        List<Employee> allEmp = query.getResultList();
        return allEmp;
    }

    @Override
    public void saveEmployee(Employee employee) {
//        Session session = entityManager.unwrap(Session.class);
//        session.saveOrUpdate(employee);
        entityManager.merge(employee);


    }

    @Override
    public Employee getEmployee(int id) {
//        Session session = entityManager.unwrap(Session.class);
//        Employee employee = session.get(Employee.class, id);
        Employee employee = entityManager.find(Employee.class, id);
        return employee;
    }

    @Override
    public void deleteEmployee(int id) {
//        Session session = entityManager.unwrap(Session.class);
//        Query<Employee> query = session.createQuery("delete from Employee where id =:employeeId");
//        query.setParameter("employeeId" , id);
//        query.executeUpdate();
        Query query = entityManager.createQuery("delete from Employee where id=:employeeID");
        query.setParameter("employeeID", id);
        query.executeUpdate();

    }
}
