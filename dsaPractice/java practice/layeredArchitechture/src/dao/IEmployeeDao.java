package dao;

import entity.Employee;

public interface IEmployeeDao {
    void addEmp(Employee employee);
    Employee findById(int id);
    void updateSalary(Employee employee);
    void deleteEmp(Employee employee);
    Employee[] findAll();
}
