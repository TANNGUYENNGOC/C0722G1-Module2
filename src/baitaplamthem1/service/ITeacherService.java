package baitaplamthem1.service;

import java.io.IOException;

public interface ITeacherService {
    void addTeacher() throws IOException;
    void displayTeacher() throws IOException;
    void searchIDTeacher() throws IOException;
    void searchNameTeacher() throws IOException;
    void removeTeacher() throws IOException;
    void sortTeacher() throws IOException;
}
