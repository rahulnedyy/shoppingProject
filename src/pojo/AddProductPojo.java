package pojo;
public class AddProductPojo
{
    private static String productName;
    private static String productPrice;

    public static String getProductName() {
        return productName;
    }

    public static void setProductName(String productName) {
        AddProductPojo.productName = productName;
    }

    public static String getProductPrice() {
        return productPrice;
    }

    public static void setProductPrice(String productPrice) {
        AddProductPojo.productPrice = productPrice;
    }
   
}