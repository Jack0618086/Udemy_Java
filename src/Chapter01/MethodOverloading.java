package Chapter01;

public class MethodOverloading {
    public void addition(int a, int b) {
        System.out.println(a + b);
    }

    public void addition(String a, String b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();
        mo.addition(1, 2); // actual parameter 這邊用的是兩個 int 所以會自動執行 int a, int b
        mo.addition("Hello", "World"); // actual parameter 實際參數
    }
}