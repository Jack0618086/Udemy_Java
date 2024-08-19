package Chapter01;

import com.sun.tools.javac.Main;

public class ReturnValue {

    public ReturnValue() {
    }

    // 1. 如果 return 關鍵字放在迴圈中，它將終止所有迴圈的進行。
    public void testing() {

        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 100; i++) {
                if (i == 5) {
                    break;
                }
                System.out.println(j + "" + i); // 00 01 02 03 04
            }

            System.out.println("-----");

            for (int i = 0; i < 100; i++) {
                if (i == 5) {
                    return; // i = 5 執行 return
                }
                System.out.println(i); // 0 1 2 3 4
            }
        }
    }

    // 2. 在return之下的method內部的程式碼全部都不會被執行。
    public void testing2() {
        System.out.println("before return");
        return;
    }

    // 3. 一個method只能夠一次return一個值。
    public int testing3(int i) {
        System.out.println("-----");
        if (i == 3) {
            return 3;
        } else {
            return 10;
        }
    }

    public static void main(String[] args) {
        ReturnValue rv = new ReturnValue();
        rv.testing();
        rv.testing2();
        System.out.println(rv.testing3(4));
    }
}
