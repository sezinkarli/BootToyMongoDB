package main.dao;

import main.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

/**
 * @author sezin karli
 * @since 4/7/14 1:56 PM
 *        User: Sezin Karli
 */
// Table 5.1. Supported keywords for query methods
// http://docs.spring.io/spring-data/data-mongodb/docs/current/reference/html/mongo.repositories.html
public interface ProductRepository extends MongoRepository<Product, String>, ProductRepositoryCustom {
    public List<Product> findBySku(String sku);

    @Query(value = "{sku: ?0, availability : 1}")
    public List<Product> findBySkuOnlyAvailables(String sku);
}
