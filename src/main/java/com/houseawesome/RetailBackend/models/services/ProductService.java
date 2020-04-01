package com.houseawesome.RetailBackend.models.services;

import com.houseawesome.RetailBackend.models.dao.Product;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.UUID;

@Service
public class ProductService {

    public Product getProductByID(UUID id) {

        // this would use the ID to pull from the DB eventually.
        // but for now, return a static product.
        Product p = new Product();
        p.setId(id);
        p.setName("Exterior Paint");
        p.setPrice(new BigDecimal(24.99));

        return p;
    }
}