package case_study.utils.write_file;

import case_study.models.personModel.Customer;
import case_study.models.personModel.Employee;
import case_study.services.impl.CustomerServiceImpl;
import case_study.services.impl.EmployeeServiceImpl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFileCustomerUtils {
    public static void writeFileCustomer(List<Customer> customerList){
        File file = new File("D:\\module_2\\src\\case_study\\data\\customer_data.csv");
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter(file);
             bufferedWriter = new BufferedWriter(fileWriter);
            for (Customer customer: customerList) {
                bufferedWriter.write(CustomerServiceImpl.getInfoCustomer(customer));
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
