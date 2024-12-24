public class Student {
    private int id=1;
    private int id_gen;
    private String name;
    private String surname;
    private int age;
    private boolean gender;
    private int[] grades={67,67,67,67,67};
    private double GPA;
        public Student() {
            this.id_gen=id++;
        }


    public Student(String name, String surname, float GPA, int age, boolean gender) {
        this();
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.GPA = GPA;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public boolean isGender() {
        return gender;
    }
    public void setGender(boolean gender) {
        this.gender = gender;
    }
    public void setGrades(int[] grades) {
        this.grades = grades;
    }
    public int getGrades() {
        return grades[0];
    }
    public float getGPA() {
            return (float) GPA;
    }

    public String toString() {
        return
        "Hi i am a student ith id " + id +" " + name +" " + surname +
                "\na " + age +
                " years-old "+ GPA+ " "+  (gender? "male":"female");
    }
}

