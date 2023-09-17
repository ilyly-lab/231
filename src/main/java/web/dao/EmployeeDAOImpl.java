package web.dao;



import org.springframework.stereotype.Component;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.entity.Employee;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Employee> getAllEmployees() {
        List<Employee> list = entityManager.createQuery("select u from Employee u", Employee.class).getResultList();
        return list;
    }

    @Override
    public void saveEmployee(Employee employee) {entityManager.merge(employee);}

    @Override
    public void deleteEmployee(int id) {
        entityManager.remove(getEmployee(id));
    }

    @Override
    public Employee getEmployee(int id) {
        return entityManager.find(Employee.class,id);
    }


}
