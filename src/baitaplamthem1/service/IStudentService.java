package baitaplamthem1.service;

import java.io.IOException;

public interface IStudentService{
    void addStudent() throws IOException;
    void removeStudent();
    void searchIDStudent();
    void searchNameStudent();
    void displayAllStudent() throws IOException;
    void sortStudent();
}
