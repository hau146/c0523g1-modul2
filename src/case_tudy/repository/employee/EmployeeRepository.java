package case_tudy.repository.employee;

import case_tudy.model.person.Employee;
import case_tudy.ulti.ReadAndWrite;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    public static final String FILE_EMPLOYEE = "D:\\c0523g1-modul2\\src\\case_tudy\\data\\employee_data\\employee.cvs";

    @Override
    public List<Employee> showAllEmployee() {
        List<Employee> employeeList = new ArrayList<>();
        List<String> stringList = ReadAndWrite.readToFileCVS(FILE_EMPLOYEE);
        String[] array = null;
        for (String string : stringList) {
            array = string.split(",");
            Employee employee = new Employee(array[0], array[1], LocalDate.parse(array[2]), array[3], array[4], array[5], array[6], array[7], array[8], Integer.parseInt(array[9]));
            employeeList.add(employee);
        }
        return employeeList;
    }

    @Override
    public void addEmployee(Employee employee) {
        List<String> stringList = new ArrayList<>();
        stringList.add(employee.getInfoCVSEmployee());
        ReadAndWrite.writeToFileCVS(FILE_EMPLOYEE, stringList, true);
    }

    @Override
    public void editEmployee(int index, Employee employee) {
        List<Employee> employeeList = this.showAllEmployee(); //hứng tất cả đối tượng trong file vào List dc tạo
        employeeList.set(index, employee); //sửa đối tượng trong list mới hứng
        switchToString(employeeList);
        ReadAndWrite.writeToFileCVS(FILE_EMPLOYEE, switchToString(employeeList),false); //ghi đè nội dung đã dc sửa vào file
    }

    //hàm này để chuyển tất cả các đối tượng employee thành string để ghi vào file
    private List<String> switchToString(List<Employee> employeeList) {
        List<String> stringList = new ArrayList<>();
        for (Employee emplo: employeeList) {
            stringList.add(emplo.getInfoCVSEmployee());
        }
        return stringList;
    }


    @Override
    public void deleteEmployee(int indexEmployee) {
        List<Employee> employeeList = this.showAllEmployee();
        employeeList.remove(indexEmployee);
        switchToString(employeeList);
        ReadAndWrite.writeToFileCVS(FILE_EMPLOYEE,switchToString(employeeList),false);
    }

    @Override
    public List<Employee> searchNameEmployee(String nameEmployee) {
        List<Employee> employeeList = this.showAllEmployee();
        List<Employee> employeeArrayList = new ArrayList<>();
        for (int i = 0; i < employeeList.size() ; i++) {
            if (employeeList.get(i).getName().contains(nameEmployee)){
                employeeArrayList.add(employeeList.get(i));
            }
        }
        return employeeArrayList;
    }

    //được tạo ra để tìm index cho hàm xóa hoặc sửa
    @Override
    public int searchIndex(String id) {
        List<Employee> employeeList = this.showAllEmployee();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
