public class Practices {
    public static void main(String[] args) {
        Test m= new Test();
        m.m1();
    }
}

class Test{
    public  void m1(){
        System.out.println("GHY");
    }
}

class Test2 extends Test{
    @Override
    public void m1() {
        System.out.println("GHY1");
    }
}
