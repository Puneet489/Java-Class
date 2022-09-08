class A{
    int a =13;
    
}

class B extends A{
    int b=10;
    public static void main(String args[]){
        B b = new B();
        System.out.println(b.a);
    }
}

class B1 extends A{
    public static void main(String args[]){
        B1 o = new B1();
        System.out.println(o.a);
    }
}

class C extends B{
    public static void main(String args[]){
        C c = new C();
        System.out.println(c.b);
        System.out.println(c.a);
    }
}
