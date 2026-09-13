class student {
    String name;
    int age;
    
    // constructor creation
    // constructor have no return type 
    // class name and constructor name must be same 
    // constructor will automatically called when an object is created 
    student(){
        System.out.println("This is called constructor");
        name ="sanu";
        age = 30;
    }

    public static void main(String[] args) {
        student s1 = new student();

        System.out.println("Name of the student:" + s1.name);
        System.out.println("Age of the student:" + s1.age);
    }
    
    
}