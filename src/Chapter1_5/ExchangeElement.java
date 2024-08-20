package Chapter1_5;

public class ExchangeElement {
    public static void main(String[] args){
        int a = 5;
        int b = 6;
        // a = 6, b = 5
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b); // a = 6 b = 5
        System.out.println("---");

        // 將 1, 4 互換
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int temp2 = arr[0];
        arr[0] = arr[3];
        arr[3] = temp2;

        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}
