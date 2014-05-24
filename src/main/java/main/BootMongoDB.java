package main;

import main.model.Product;
import main.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * @author sezin karli
 * @since 3/19/14 9:26 AM
 *        User: Sezin Karli
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class BootMongoDB implements CommandLineRunner {

    @Autowired
    private ProductService productService;

    private static final Logger logger = LoggerFactory.getLogger(BootMongoDB.class);

    public void run(String... args) throws Exception {
        List<Product> sku = productService.getSku("NEX.6");
        logger.info("result of getSku is {}", sku);
        List<Product> availableSku = productService.getAvailableSku("NEX.6");
        logger.info("result of getAvailableSku is {}", availableSku);
        List<Product> availableSkuCustom = productService.getAvailableSkuCustom("NEX.6");
        logger.info("result of availableSkuCustom is {}", availableSkuCustom);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(BootMongoDB.class, args);
    }
}
