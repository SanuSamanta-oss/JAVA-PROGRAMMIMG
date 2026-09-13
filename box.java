public class box{

    double height, length, width;
    
    // default constructor - constructor 1
    public box(){
        this.height = 0;
        this.length = 0;
        this.width = 0;
    }

    // constructor 2  -  parameterized constructor - v1
    public box(int side){
        this.height = side;
        this.length = side;
        this.width = side;
    }

    // parameterized constructor - v2 - constructor 3
    public box(double h, double l, double w){
        this.height = h;
        this.length = l;
        this.width = w;
    }

    public void displayvolume(){
        System.out.println("Volume :" + ((height * length )* width));
    }


    // main function 
    public static void main(String[] args) {
        // object creation 
        box b1 = new box();
        box b2 = new box(80);
        box b3 = new box(20,60,78);

        b1.displayvolume();
        b2.displayvolume();
        b3.displayvolume();
    }
}


