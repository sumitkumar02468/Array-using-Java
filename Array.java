import java.util.*;

public class Array {
    public static int[] deleteElement(int arr[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your location, which you want to delete");
        int loc = sc.nextInt();
        try {
            for (int i = loc - 1; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invadid index");
        }
        return arr;
    }

    public static int[] editElement(int[] arr) {
        Scanner sc = new Scanner(System.in);
        int loc, data;
        System.out.println("Enter your location, which you want to edit");
        loc = sc.nextInt();
        System.out.println("Enter new data");
        data = sc.nextInt();
        try {
            arr[loc - 1] = data;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index");
        }
        return arr;
    }

    public static int[] insertElement(int arr[]) {
        Scanner sc = new Scanner(System.in);
        int loc, data;
        System.out.println("Enter your location");
        loc = sc.nextInt();
        loc = loc - 1;
        System.out.println("Enter your data");
        data = sc.nextInt();
        if (arr[loc] == 0) {
            arr[loc] = data;
        } else {
            // System.out.println("This place is allrady taken");
            for (int i = arr.length - 2; i >= loc; i--) {
                arr[i + 1] = arr[i];
            }
            arr[loc] = data;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, choice;
        System.out.println("Enter how many elements");
        n = sc.nextInt();
        int arr[] = new int[10];
        System.out.println("Enter your array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter\n1. Insert Element\n2. Edit Element\n3. Delete Element");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                arr = insertElement(arr);
                break;
            case 2:
                arr = editElement(arr);
                break;
            case 3:
                arr = deleteElement(arr);
                break;
            default:
                System.out.println("Enter valid choice");
                break;
        }
        System.out.println("Your new array is ");
        System.out.println(Arrays.toString(arr));
        // System.out.println(arr.length);

    }
}