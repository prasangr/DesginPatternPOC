package Builder.BuilderExample;

public class Client {

    public static void main(String[] args) throws IllegalAccessException {
        Helper helper = new Helper();
        helper.name = "John Doe";
        helper.age = 25;

        Student st=new Student(helper);

        System.out.println(st.name);

    }



}
