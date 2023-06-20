package com.ninestudy.product;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//
//        //Map 생성
//        HashMap<Long, Product> map = new HashMap<>();
//        // 객체 생성
//        Product product1 = new Product("pizza", 23000,"good");
//        Product product2 = new Product("pizza", 23000,"good");
//
//        map.put(1L, new Product("pizza", 23000,"good"));
//        map.put(2L, product2);
//
//        boolean test = map.containsKey(1L);
//        System.out.println("test = " + test); //true
//
//        boolean test2 = map.containsValue(map.get(1L));
//        System.out.println("test2 = " + test2); // true
//        boolean test3 = map.containsValue(product2);
//        System.out.println("product2 = " + product2); //true
//
//        //Map을 List로 바꾸는 방법
//        //Collection<V> values()
//        List<Product> list = new ArrayList<>(map.values());
//
//        for (Product product : list) {
//            System.out.println("product = " + product);
//        }
//
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//
//        for (int a : arr) {
//            System.out.println(a);
//        }
//
//        for(int i=0; i > 10; i--) {
//            System.out.println(i);
//        }
        //i= 0 1 2 3 4 ~~~
        // arr []

        ProductRepository productRepository = new ProductRepository();

        // 객체 생성 (고객이 입력한 값)
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
