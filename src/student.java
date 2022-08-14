import java.util.Scanner;

public class student {
    public void setArray(int[] array) {
    int size;
    Scanner scanner = new Scanner(System.in);
 do {
        System.out.print("Enter a size:");
        size = scanner.nextInt();
        if (size > 30)
            System.out.println("Size should not exceed 30");
    } while (size > 30);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter a mark for student " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
}

}