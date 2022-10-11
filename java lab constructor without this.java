class create{
    static int i;
    static void create(int x){
        i = x;
        System.out.println("Value assigned in the variable \n");
    }
    
    static void create(){
        System.out.println(i);
    }
    
    public static void main(String args[]){
        create cr = new create();
        cr.create(4);
        cr.create();
    }
}
