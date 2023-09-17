package frontend;

import com.sun.security.jgss.GSSUtil;
import entity.Employee;
import exceptions.InvalidId;
import exceptions.InvalidNameException;
import exceptions.InvalidSalary;
import service.EmployeeServiceImpl;


public class Frontend {

    public  void runUI() {
        try {
            EmployeeServiceImpl employeeService = new EmployeeServiceImpl(5);
            Employee employee1 = employeeService.addEmployee("Sania", 37000);
            System.out.println(employee1+" Added");
            Employee employee2 = employeeService.addEmployee("Sania Fatima", 200000);
            System.out.println(employee2+" Added");
            Employee employee3 = employeeService.addEmployee("Sara", 80000);
            System.out.println(employee3+" Added");

            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ Getting all the employees after adding employees @@@@@@@@@@@@@@@@@@@@@@@@@@");
            Employee[] employees = employeeService.findAllEmployee();
            show(employees);

            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ Updating Employee @@@@@@@@@@@@@@@@@@@@@@@@@@");
            Employee employee = employeeService.updateSalary(2,300000);
            show(employee);
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ Getting all the employees after updating @@@@@@@@@@@@@@@@@@@@@@@@@@");
            Employee[] employees1 = employeeService.findAllEmployee();
            show(employees1);

            int id = 3;
            Employee delEmployee = employeeService.deleteEmployee(id);
            System.out.println(delEmployee+" ------DELETED");
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ Getting all the employees after deleting @@@@@@@@@@@@@@@@@@@@@@@@@@");
            Employee[] remainingEmployees = employeeService.findAllEmployee();
            show(remainingEmployees);


        } catch (InvalidNameException e) {
            System.out.println(e.getMessage());
        }catch (InvalidSalary e){
            System.out.println(e.getMessage());
        }catch(InvalidId e){
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    private void show(Employee[] employees) {
        for(Employee employee: employees){
            if(employee!=null){
                show(employee);
            }
        }
    }
    private void show(Employee employee) {
                System.out.println("Employee Id is "+employee.getId()+", Employee Name is "+employee.getEmpName()+
                        ", Employee Salary is "+employee.getSalary()+".");
        }

}
