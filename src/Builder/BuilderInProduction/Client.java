package Builder.BuilderInProduction;

import java.text.CollationElementIterator;
import java.util.Collections;
import java.util.List;
import java.util.zip.CheckedOutputStream;

public class Client {

    public static void main(String[] args) throws IllegalAccessException {
        Student st = Student.getBuilder()
                .setName("John Doe")
                .setAge(25)
                .build();
        //Student st=builder.build();

        System.out.println(st.name);

    }



}
