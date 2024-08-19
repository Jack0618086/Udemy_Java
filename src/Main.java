public class Main {

    public Main () {}

    // modifier 修飾符 public
    // return type 返回類型 void
    public void sayHello (){
        System.out.println("Hello!");
    }

    // parameter list (formal parameter)
    // modifier 修飾符 public
    // return type 返回類型 int
    public int multiply (int a, int b) {
        return  a * b;
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.sayHello(); // Hello!

        // actual parameter
        // m.multiply(5, 4); 沒有放進sout會看不到回傳值
        System.out.println(m.multiply(5, 4) + m.multiply(7, 4));  // 20 + 28
    }
}