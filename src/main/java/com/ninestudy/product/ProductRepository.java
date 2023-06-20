package com.ninestudy.product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ProductRepository {

    private Map<Long, Product> store = new HashMap<>(); //데이터베이스 대신 사용 (자료구조)
    private long sequence = 0L; //필드..

    public ProductRepository() {

    }

    //메서드

    public Product save(Product product){
        product.setId(++sequence); // ID 값을 부여해주는
        store.put(product.getId(), product);
        return product;
    }


    public Product findById(Long id){
        return store.get(id); //ID로 값찾지..
    }

    public List<Product> findByAll() {
        return new ArrayList<>(store.values());
    }

    //특정 목록 삭제
    public void deleteId(Long id) {
        store.remove(id);
    }

    //전체삭제
    public void deleteAll(){
        store.clear();
    }
}
