import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1D array
        String[] products = {
            "Cozy Nights Monarch mattress",
            "Restonic Barbados mattress",
            "Sealy Phuket mattress"
        };

        // 2D array [3 products][3 months]
        int[][] sales = new int[3][3];

        for (int i = 0; i < products.length; i++) {
            System.out.println();
            for (int month = 0; month < 3; month++) {
                System.out.print("Enter number of sales for month " + (month + 1)
                        + " for " + products[i] + ": ");
                sales[i][month] = sc.nextInt();
            }
        }

        Product product = new Product(products, sales);
        PrintProduct printer = new PrintProduct(product);
        printer.PrintReport();

        sc.close();
    }
}