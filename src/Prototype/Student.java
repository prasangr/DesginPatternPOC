package Prototype;

public class Student {
    private String name;
    private int age;
    private double psp;
    private double averageBatchPsp;
    private String batchName;

    public Student(){

    }

    public Student(Student student) {
        this.age =student.age;
        this.name=student.name;
        this.averageBatchPsp=student.averageBatchPsp;
        this.psp=student.psp;
        this.batchName=student.batchName;

    }

    public Student clone(){
        return new Student(this);
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public double getAverageBatchPsp() {
        return averageBatchPsp;
    }

    public void setAverageBatchPsp(double averageBatchPsp) {
        this.averageBatchPsp = averageBatchPsp;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }




}
