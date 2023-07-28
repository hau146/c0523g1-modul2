package case_tudy.repository.employee_repository;

import case_tudy.model.person.Employee;

import java.util.List;

public interface IEmployeeRepository {
    List<Employee> showAllEmployee();
    void addEmployee(Employee employee);
    void editEmployee(int index, Employee employee);
    void deleteEmployee(int indexEmployee);
    List<Employee> searchNameEmployee(String nameEmployee);
    int searchIndex(String id);
}
