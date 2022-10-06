package case_study.utils.write_file;

import case_study.models.personModel.Employee;
import case_study.services.impl.EmployeeServiceImpl;

import javax.imageio.IIOException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFileEmployeeUtils {
    public static void writeFileEmployee(List<Employee> employeeList){
        File file = new File("D:\\module_2\\src\\case_study\\data\\Employee.csv");
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter(file);
             bufferedWriter = new BufferedWriter(fileWriter);
            for (Employee employee: employeeList) {
                bufferedWriter.write(EmployeeServiceImpl.getInfoEmployee(employee));
                bufferedWriter.newLine();

            }
        } catch (IOException e){
            e.printStackTrace();
        }
        try {
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
