package Prototype;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    Map<String,Student> studentMap=new HashMap<>();

    Student get(String key){
        return studentMap.get(key);
    }
    void register(String key,Student student){
        studentMap.put(key,student);
    }

}
