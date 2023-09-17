package web.service;

import web.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);

    Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
