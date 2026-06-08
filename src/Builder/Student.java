package Builder;

public class Student {

    String name;
    int age;
    String gender;
    String universityName;
    String gradYear;
    double cgpa;
    String address;


    public Student(Helper helper) throws IllegalAccessException {
        if(helper.age>100){
            throw new IllegalAccessException("Age cannot be greater than 100");
        }
        this.name=helper.name;
        this.age=helper.age;


    }

}
