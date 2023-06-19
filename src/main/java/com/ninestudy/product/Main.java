package com.ninestudy.product;


public class Main {
    public static void main(String[] args) {
        ProductRepository productRepository = new ProductRepository();

        // 객체 생성
        Product product1 = new Product("pizza",23000,"good"); // 객체를 생성
        Product product2 = new Product("coffee",500,"cool");
        Product product3 = new Product("juice",5000,"best");

        // 객체 저장
        productRepository.save(product1);
        productRepository.save(product2);
        productRepository.save(product3);

        // 객체 꺼내기
        Product id1 = productRepository.findById(1L);
        Product id2 = productRepository.findById(2L);
        Product id3 = productRepository.findById(3L);

        System.out.println("id1 = " + id1);
        System.out.println("id2 = " + id2);
        System.out.println("id3 = " + id3);


    }
}
