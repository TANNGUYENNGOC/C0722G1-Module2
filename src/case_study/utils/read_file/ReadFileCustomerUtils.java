package case_study.utils.read_file;

import case_study.models.personModel.Customer;
import case_study.models.personModel.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReadFileCustomerUtils {
    public static List<Customer> readFileCustomer(){
        List<Customer> customerList = new LinkedList<>();
        BufferedReader bufferedReader = null;
        try {
             bufferedReader = new BufferedReader(new FileReader("D:\\module_2\\src\\case_study\\data\\customer_data.csv"));
            String info[];
            String line;
            Customer customer;
            while ((line = bufferedReader.readLine()) != null){
                info = line.split(",");
                customer = new Customer(info[0],info[1], LocalDate.parse(info[2]),info[3],info[4],info[5],info[6],info[7],info[8]);
                customerList.add(customer);
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

        return customerList;
    }
}
