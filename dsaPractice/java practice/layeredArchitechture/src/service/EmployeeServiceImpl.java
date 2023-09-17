package service;

import dao.EmployeeDaoImpl;
import entity.Employee;
import exceptions.EmployeeNotFound;
import exceptions.InvalidId;
import exceptions.InvalidNameException;
import exceptions.InvalidSalary;

public class EmployeeServiceImpl implements IEmployeeService {
    EmployeeDaoImpl employeeDao;

    public EmployeeServiceImpl(int capacity) {
        employeeDao = new EmployeeDaoImpl(capacity);
    }

    @Override
    public Employee addEmployee(String empName, int salary) {
        validateName(empName);
        validateSalary(salary);
        Employee employee = new Employee(empName,salary);
//        employee.setEmpName(empName);
//        employee.setSalary(salary);
        employeeDao.addEmp(employee);
        return employee;
    }

    @Override
    public Employee findById(long id)throws EmployeeNotFound {
        validateId(id);
      Employee employee = employeeDao.findById(id);
      if(employee==null){
          throw new EmployeeNotFound("Employee is not present with Id "+id);
      }
        return employee;
    }

    @Override
    public Employee updateSalary(long id, int salary)throws  EmployeeNotFound {
        validateId(id);
        validateSalary(salary);
        Employee employee = findById(id);
        employee.setSalary(salary);
        employeeDao.updateSalary(employee);
        return employee;
    }

    @Override
    public Employee deleteEmployee(long id)throws EmployeeNotFound {
        validateId(id);
        Employee employee = findById(id);
        employeeDao.deleteEmp(employee);
        return employee;
    }

    @Override
    public Employee[] findAllEmployee() {
        return employeeDao.findAll();
    }
    private void validateName(String name){
        if(name.length()==0 || name.isEmpty() || name == null){
            throw new InvalidNameException("Please enter a valid name");
        }
    }
    private void validateId(long id){
        if(id<0){
            throw new InvalidId("Id cannot be negative");
        }
    }
    private void validateSalary(int salary){
        if(salary<0){
            throw new InvalidSalary("Salary cannot be negative");
        }
    }
}
