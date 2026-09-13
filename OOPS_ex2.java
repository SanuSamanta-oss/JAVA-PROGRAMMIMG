class Student{
    String Name;
    int Roll;
    int age;

    public void printInfo(){
        System.out.println("Name of the student:"+this.Name);
        System.out.println("Age of the student:"+this.age);
        System.out.println("Roll of the student:"+this.Roll);
    }

}
public class OOPS_ex2{
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.Name = "Sanu Samanta";
        student1.age = 20;
        student1.Roll = 01;
        student1.printInfo();
    }
}