package service;

import entity.Employee;
import exceptions.EmployeeNotFound;
import exceptions.InvalidId;
import exceptions.InvalidNameException;
import exceptions.InvalidSalary;

public class EmployeeServiceImpl implements IEmployeeService {

    @Override
    public Employee addEmployee(String empName, int salary) {
        return null;
    }

    @Override
    public Employee findById(long id)throws EmployeeNotFound {
        return null;
    }

    @Override
    public Employee updateSalary(long id, int salary)throws  EmployeeNotFound {
        return null;
    }

    @Override
    public Employee deleteEmployee(long id)throws EmployeeNotFound {
        return null;
    }

    @Override
    public Employee[] findAllEmployee() {
        return new Employee[0];
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
    private void validateId(int salary){
        if(salary<0){
            throw new InvalidSalary("Salary cannot be negative");
        }
    }
}
