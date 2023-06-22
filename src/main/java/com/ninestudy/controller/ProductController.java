package com.ninestudy.controller;

import com.ninestudy.product.Product;
import com.ninestudy.product.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j // 디버깅하는 어노테이션
@RestController
@RequestMapping("/product")
public class ProductController {

    //데이터 저장소
    @Autowired
    private ProductRepository productRepository;


    // 전체 조회
    @GetMapping
    public List findAllApi(){
        Product product = new Product("pizaa",20,"good");
        productRepository.save(product);
        productRepository.findByAll();
        List<Product> productList = productRepository.findByAll();
        return productList;
    }

    //상품 등록
    // 클라이언트 : 웹브라우저 -> json 객체 정보 (Product class - 이름, 가격, 리뷰)
    // 받는건 RequestBody 객체로 받음
    // productRepository의 save 메서드를 사용해서 데이터를 저장하고
    // model을 사용해서 뷰 로직에 데이터를 전달
    // 자바 객체타입으로 확인 (RestController) 반환 값 : 객체 외
    @PostMapping
    public Product postProductAll(@RequestBody Product product, Model model) {
        //데이터가 들어갔어요
        productRepository.save(product); // 데이터를 저장
        model.addAttribute("product",product);
        return product;
    }

    //특정 상품 수정
    @PatchMapping("{id}")
    public Product postProduct(@PathVariable Long id,@RequestBody Product product) {
        productRepository.postProduct(id, product);
        return product;
    }

    //전체삭제
    @DeleteMapping
    public String deleteProductAll() {
        productRepository.deleteAll();
        return "ok";
    }

    //특정 목록 삭제
    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable Long id) {
        productRepository.deleteId(id);
        return "ok";
    }






}




//    //상품 조회
//    @GetMapping
//    public String findProduct() {
//        Product product = new Product("pizza", 23000, "good");
//        return "product";
//    }