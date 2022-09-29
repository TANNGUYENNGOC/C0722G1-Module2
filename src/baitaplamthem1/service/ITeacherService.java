package baitaplamthem1.service;

import java.io.IOException;

public interface ITeacherService {
    void addTeacher() throws IOException;
    void displayTeacher() throws IOException;
    void searchIDTeacher();
    void searchNameTeacher();
    void removeTeacher();
    void sortTeacher() throws IOException;
}
