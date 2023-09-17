package web.dao;


import web.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    Employee getEmployee(int id);

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    void deleteEmployee(int id);
}
