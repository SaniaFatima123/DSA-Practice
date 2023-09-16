package dao;

import entity.Employee;

public class EmployeeDaoImpl implements IEmployeeDao {
    Employee employees[];

    public EmployeeDaoImpl(int capacity) {
        employees = new Employee[capacity];
    }
    private long generatedId;
    private long generateId(){
        return ++generatedId;
    }
    @Override
    public void addEmp(Employee employee) {
   for(int i=0; i<employees.length; i++){
       employee.setId(generateId());
       employees[i] = employee;
   }
    }

    @Override
    public Employee findById(int id) {
        for(Employee employee: employees){
            if(employee!=null && employee.getId()==id){
                return employee;
            }
        }
        return null;
    }

    @Override
    public void updateSalary(Employee employee) {
    for(int i=0; i< employees.length; i++){
        if(employees[i].getId() == employee.getId()){
            employees[i] = employee;
        }
    }
    }

    @Override
    public void deleteEmp(Employee employee) {
        for(int i=0; i< employees.length; i++){
            if(employees[i].getId() == employee.getId()){
                employees[i] = null;
                return;
            }
        }
    }

    @Override
    public Employee[] findAll() {
        return employees;
    }
}
