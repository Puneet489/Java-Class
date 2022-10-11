class student{
    public String name;
    int age, marks;
    static int m;
    void printdata(){
        System.out.println("The name entered is "+name);
        System.out.println("This is the marks "+ marks);
        System.out.println("This is the age "+ age);
    }
    
    public static void main(String[] args){
        student s1 = new student();
        s1.name = "Amit";
        s1.marks = 90;
        s1.age = 19;
        
        student s2 = new student();
        s1.printdata();
    }
}
