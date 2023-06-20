package com.ninestudy.controller;

import com.ninestudy.product.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/products")
public class ProductController {
    //상품 조회
    @GetMapping
    public String findProduct() {
        Product product = new Product("pizza", 23000, "good");
        return "product";
    }


}
