public class Product implements IProduct {
    // 1D array - product names
    private String[] productNames;
    // 2D array - sales [product][month]
    private int[][] sales;

    public Product(String[] productNames, int[][] sales) {
        this.productNames = productNames;
        this.sales = sales;
    }

    @Override
    public int GetTotalProductsSold() {
        int total = 0;
        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                total += sales[i][j];
            }
        }
        return total;
    }

    @Override
    public double GetAverageProductSold() {
        int total = GetTotalProductsSold();
        int count = sales.length * sales[0].length; // 3 products x 3 months = 9
        return (double) total / count;
    }

    @Override
    public String GetMostPopularProduct() {
        int highestTotal = -1;
        int highestSingle = -1;
        String popular = "";
        // Find product with highest TOTAL sales
        for (int i = 0; i < sales.length; i++) {
            int productTotal = 0;
            int productMax = 0;
            for (int j = 0; j < sales[i].length; j++) {
                productTotal += sales[i][j];
                if (sales[i][j] > productMax) productMax = sales[i][j];
            }
            if (productTotal > highestTotal) {
                highestTotal = productTotal;
                highestSingle = productMax;
                popular = productNames[i];
            }
        }
        // Matches sample format: Cozy Nights Monarch(25)
        // 25 = highest single month for that product
        return popular + "(" + highestSingle + ")";
    }
}