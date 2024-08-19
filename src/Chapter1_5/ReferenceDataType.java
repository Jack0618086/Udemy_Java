package Chapter1_5;
// 原始資料型別 primitive data type
// 參考資料型態 non-primitive data type
public class ReferenceDataType {
    public static void changeA(int x) {
        x = 20;
    }

    // Non-primitive data type
    // method's actual parameter
    // Java => copy by reference
    public static void changeFirstElement(int[] arr) {
       arr[0] = 1000;
    }

    public static void main(String[] args){
        // Reference Data Type (non-primitive data type)
        // Java's primitive data type is used as an actual parameter
        // Java copy by value 以下這段得到的結果是10
        int a = 10;
        changeA(a);
        System.out.println(a); // 10 or 20?

        // primitive data type
        // assignment operator => copy by value
        int b = 10;
        int c = a; // copy by value
        b = 30;
        System.out.println(b + " " + c); // 30 10

        System.out.println("---");

        int[] myArray1 = {10, 20, 30};
        int[] myArray2 = myArray1; // copy by reference
        myArray1[0] = 100;

        for (int i : myArray1) {
            System.out.println(i + " "); // 100 20 30
        }

        System.out.println("---");

        for (int i : myArray2) {
            System.out.println(i + " "); // 100 20 30
        }

        System.out.println("---");
        int[] myArray10 = {500, 600, 700};
        changeFirstElement(myArray10);

        for (int i : myArray10) {
            System.out.println(i + " "); // 1000 600 700
        }
    }
}
