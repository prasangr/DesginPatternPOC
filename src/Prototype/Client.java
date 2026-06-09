package Prototype;

public class Client {

    public static void fillRegistry(StudentRegistry studentRegistry){
        Student julybatch=new Student();
        julybatch.setBatchName("July Batch");
        julybatch.setAverageBatchPsp(90);
        studentRegistry.register("JulyBatch",julybatch);

        Student maybatch=new Student();
        julybatch.setBatchName("May Batch");
        julybatch.setAverageBatchPsp(80);
        studentRegistry.register("MayBatch",julybatch);


        InteligentStudent septBatch = new InteligentStudent();
        septBatch.setBatchName("sept22");
        septBatch.IQ = 100;
        studentRegistry.register("sept22", septBatch);


    }

    public static void main(String[] args) {
        StudentRegistry registry=new   StudentRegistry();
        fillRegistry(registry);


        Student saket=registry.get("JulyBatch").clone();
        saket.setName("Saket");
        saket.setAge(25);

        Student aman=registry.get("sept22").clone();
        aman.setAge(22);
        aman.setName("Aman");

        System.out.println(saket);

    }


}
