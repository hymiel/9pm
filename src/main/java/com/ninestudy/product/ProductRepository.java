package com.ninestudy.product;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ProductRepository {

    private Map<Long, Product> store = new HashMap<>(); //데이터베이스 대신 사용 (자료구조)
    private long sequence = 0L; //필드..

    public ProductRepository() {

    }

    //메서드

    // 상품등록
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

    //특정 상품 수정

    // 1. 수정 할 id 값을 받아옴

    // 수정된 내용을 저장
    public Product postProduct(Long id, Product product) {
        // 2.특정 상품 id값을 받아온 뒤 데이터에서 맵에서 찾음
        Product findById = findById(id);
//        product.setId(id);
        // 3. 해당 아이디 값의 내용을 수정
        findById.setName(product.getName());
        findById.setPrice(product.getPrice());
        findById.setReview(product.getReview());
        return findById;
    }
}
