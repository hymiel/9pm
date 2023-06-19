package com.ninestudy.product;

import java.util.HashMap;
import java.util.Map;


public class ProductRepository {

    private Map<Long, Product> store = new HashMap<>();
    private static long sequence = 0L;
    public ProductRepository(Map<Long, Product> store) {
        this.store = store;
    }

    public ProductRepository() {

    }

    //메서드
    public Product save(Product product){
        product.setId(++sequence); // ID 값을 부여해주는
        store.put(product.getId(), product);
        return product;
    }
    public Product findById(Long id){
        return store.get(id);
    }


}
