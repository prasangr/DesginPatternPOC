package Prototype;

public class InteligentStudent extends Student{
    int IQ;
    InteligentStudent(){}

    InteligentStudent(InteligentStudent inteligentStudent){
        super(inteligentStudent);
        this.IQ=inteligentStudent.IQ;
    }

    @Override
    public InteligentStudent clone() {
        return new InteligentStudent(this);
    }

     public int getIQ() {
        return IQ;
    }
}
