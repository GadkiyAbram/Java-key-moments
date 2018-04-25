public class Main {

    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new B();
        A a3 = new C();

        System.out.println(a1 instanceof C);    //return false
        System.out.println(a2 instanceof A);    //return true, because a2 = new B(), B extends A
        System.out.println(a3 instanceof A);    //return true, because a3 = new C(), C extends A
    }
}
