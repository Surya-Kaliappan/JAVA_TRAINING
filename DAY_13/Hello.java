class Hello{  // Ilegal modifier for the class Hello; only public, abstract & final are permitted

    void check(){
        int a = 10; // local variable (onlu final is permitted public, protected, private not possible)
        System.out.println(a);
    }

    public static void main(String[] args){
        new Hello().check();
    }
}