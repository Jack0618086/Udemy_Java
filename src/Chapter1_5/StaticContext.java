package Chapter1_5;

public class StaticContext {
    // 在 int 前加上 static method 把 add 變成 static 方法
    public static int add(int x, int y) {
        return x + y;
    }

    public static void main(String[] args){
        System.out.println(add(10, 20));
    }
}
