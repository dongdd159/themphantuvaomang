import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class themphantuvaomang {
    public static void main(String[] args) {
        int size;
        int[] array;
        int x;
        int index;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size should not exceed 20");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element" + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.print("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        System.out.print("Enter a number:");
        x=scanner.nextInt();
        System.out.print("Enter location:");
        index=scanner.nextInt();
        array = addvalue(x, index, array);
        System.out.print("New property list: ");
        for (int j =0;j< array.length;j++){
            System.out.print(array[j] + "\t");
        }
    }
    public static int [] addvalue(int a,int n,int[] arr) {
        int s2 = arr.length+1;
        int [] arr2  = new int[s2];
        if (n==arr.length){
            for (int i=0;i<n;i++){
                arr2[i]=arr[i];
            }
            arr2[n]=a;
        }else {
            for (int i=0;i<n;i++){
                arr2[i]=arr[i];
            }
            for (int i=n;i<arr.length;i++){
                arr2[i+1]=arr[i];
            }
            arr2[n]=a;
        }
        return arr2;
    }
}
