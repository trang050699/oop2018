package week1;

import java.util.Set;

public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)

    public boolean sameGroup(Student s1, Student s2) {
        // TODO:
        return false; // xóa dòng này sau khi cài đặt
    }

    void studentsByGroup() {
        // TODO:
    }

    void removeStudent(String id) {
        // TODO:
    }

    public static void main(String[] args) {
        // TODO:
        Student trang = new Student();
        trang.setName("Trang");
        trang.setId("1701077");
        trang.setGroup("Thien Thai");
        trang.setEmail("man.050699@gmail.com");
        
        System.out.println("Name: "+trang.getName());
        System.out.println("Id: "+trang.getId());
        System.out.println("Group: "+trang.getGroup());
        System.out.println("Email: "+trang.getEmail());
    }
}
