import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ProductTest {

    public void GetTotalProductSales_WithValidData_ReturnsCorrectValue() {
        // Arrange - same data as sample
        String[] products = {"Cozy Nights Monarch mattress", "Restonic Barbados mattress", "Sealy Phuket mattress"};
        int[][] sales = {{25, 18, 20}, {15, 10, 12}, {18, 15, 20}};
        Product p = new Product(products, sales);
        // Act + Assert - 25+18+20+15+10+12+18+15+20 = 153
        assertEquals(153, p.GetTotalProductsSold());
    }

    public void GetAverageSales_WithValidData_ReturnsCorrectValue() {
        // Arrange
        String[] products = {"Cozy Nights Monarch mattress", "Restonic Barbados mattress", "Sealy Phuket mattress"};
        int[][] sales = {{25, 18, 20}, {15, 10, 12}, {18, 15, 20}};
        Product p = new Product(products, sales);
        // Act + Assert - 153 / 9 = 17.0
        assertEquals(17.0, p.GetAverageProductSold(), 0.01);
    }
}