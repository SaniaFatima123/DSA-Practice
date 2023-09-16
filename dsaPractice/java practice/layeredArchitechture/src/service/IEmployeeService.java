package service;

import entity.Employee;
import exceptions.EmployeeNotFound;

public interface IEmployeeService {
Employee addEmployee(String empName, int salary);
Employee findById(long id)throws EmployeeNotFound;
Employee updateSalary(long id, int salary)throws EmployeeNotFound;

Employee deleteEmployee(long id)throws EmployeeNotFound;
Employee[] findAllEmployee();
}
