class Student{
    private  String name;
    private  int age;

    // Giving Name
    public void setName(String name){
        this.name = name;
    }
    // Giving Age
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Sanu");
        s.setAge(10);

        System.out.println("Name of the Student: " + s.getName());
        System.out.println("Age of the student: " + s.getAge());
    }
}
