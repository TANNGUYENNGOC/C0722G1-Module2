package case_study.utils.read_file;

import case_study.models.personModel.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ReadFileEmployeeUtils {
    public static List<Employee> readFileEmployee(){
        List<Employee> employeeList = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
             bufferedReader = new BufferedReader(new FileReader("D:\\module_2\\src\\case_study\\data\\Employee.csv"));
            String info[];
            String line;
            Employee employee;
            while ((line = bufferedReader.readLine()) != null){
                info = line.split(",");
                employee = new Employee(info[0],info[1], LocalDate.parse(info[2]),info[3],info[4],info[5],info[6],info[7],info[8],Double.parseDouble(info[9]));
                employeeList.add(employee);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        try {
            if (bufferedReader != null) {
                bufferedReader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return employeeList;
    }
}
