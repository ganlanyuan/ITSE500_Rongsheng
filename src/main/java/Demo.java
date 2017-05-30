import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by designer01 on 5/30/17.
 */
public class Demo {
    public static final String URL_ROOT = "http://www.nutrabio.com/category/herbal/";

    public static void main(String[] args) throws IOException {
        Document doc;
        try {
            doc = Jsoup.connect(URL_ROOT).get();
            Elements products = doc.select(".product-item");

            for (Element product : products) {
                Product item = new Product();

                String code = product.select(".product-code").text();
                if (code.length() > 6) {
                    code = code.substring(6);
                }
                String retailPrice = product.select(".product-price-retail:nth-child(2)").text();
                if (retailPrice.length() > 8) {
                    retailPrice = retailPrice.substring(8);
                }
                String currentPrice = product.select(".product-price .bold").text();

                item.setTitle(product.select(".product-name a").text());
                item.setStatus(product.select(".product-inventory").text());
                item.setCode(code);
                item.setRetailPrice(retailPrice);
                item.setCurrentPrice(currentPrice);
                System.out.println(item.toString());
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

    }
}
