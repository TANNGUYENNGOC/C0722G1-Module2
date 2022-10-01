package baitaplamthem1.service;

import java.io.IOException;

public interface IStudentService{
    void addStudent() throws IOException;
    void removeStudent() throws IOException;
    void searchIDStudent() throws IOException;
    void searchNameStudent() throws IOException;
    void displayAllStudent() throws IOException;
    void sortStudent() throws IOException;
}
