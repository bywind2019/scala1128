/**
 * @Author lzc
 * @Date 2019-04-15 11:13
 */
public class Tesst {
    public static void main(String[] args) {
        B b = new B();
        A a = b;
        System.out.println(b.a);  // 20
        System.out.println(a.a); // 10
//        System.out.println(b.getA());
//        System.out.println(a.getA());
    }
}

class A {


    public int a = 10;

    public int getA() {
        return this.a;
    }
}

class B extends A {
    public int a = 20;

    @Override
    public int getA() {
        return this.a;
    }
}