package main.dao;

import main.model.Product;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: sezin karli
 * Date: 24.05.2014
 * Time: 21:42
 * To change this template use File | Settings | File Templates.
 */
public interface ProductRepositoryCustom {
    public List<Product> findBySkuOnlyAvailablesCustom(String sku);
}
