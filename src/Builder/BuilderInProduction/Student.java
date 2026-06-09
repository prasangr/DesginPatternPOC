package Builder.BuilderInProduction;


public class Student {

    String name;
    int age;
    String gender;
    String universityName;
    String gradYear;
    double cgpa;
    String address;


    public Student(Builder builder) throws IllegalAccessException {
        if(builder.getAge()>100){
            throw new IllegalAccessException("Age cannot be greater than 100");
        }
        this.name=builder.getName();
        this.age=builder.getAge();
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    static class Builder {
        String name;
        int age;
        String gender;
        String universityName;
        String gradYear;
        double cgpa;
        String address;


        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getGender() {
            return gender;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public String getUniversityName() {
            return universityName;
        }

        public Builder setUniversityName(String universityName) {
            this.universityName = universityName;
            return this;
        }

        public String getGradYear() {
            return gradYear;
        }

        public Builder setGradYear(String gradYear) {
            this.gradYear = gradYear;
            return this;

        }

        public double getCgpa() {
            return cgpa;
        }

        public Builder setCgpa(double cgpa) {
            this.cgpa = cgpa;
            return this;
        }

        public String getAddress() {
            return address;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
            }


        public Student build() throws IllegalAccessException {
        return new Student(this);
        }
    }

}
