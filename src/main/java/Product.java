/**
 * Created by designer01 on 5/30/17.
 */
public class Product {
    private String title;
    private String status;
    private String code;
    private String retailPrice;
    private String currentPrice;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(String retailPrice) {
        this.retailPrice = retailPrice;
    }

    public String getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(String currentPrice) {
        this.currentPrice = currentPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                ", status='" + status + '\'' +
                ", code='" + code + '\'' +
                ", retailPrice='" + retailPrice + '\'' +
                ", currentPrice='" + currentPrice + '\'' +
                '}';
    }
}
