package com.ninestudy.controller;

import com.ninestudy.product.Product;
import com.ninestudy.product.ProductRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/product/view")
public class ProductViewController {
    //데이터 저장소
    private ProductRepository productRepository = new ProductRepository();


    @GetMapping
    public String findAllView(Model model){
        Product product = new Product("pizaa",20,"good");
        productRepository.save(product);
        productRepository.findByAll();
        List<Product> productList = productRepository.findByAll();
        model.addAttribute("products" , productList);
        return "product";
    }
}
