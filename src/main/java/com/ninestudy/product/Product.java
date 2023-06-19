package com.ninestudy.product;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    Long id; // 번호
    String name; // 상품명
    Integer price; // 가격
    String review; // 후기


    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public Product(String name, Integer price, String review) {
        this.name = name;
        this.price = price;
        this.review = review;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", review='" + review + '\'' +
                '}';
    }
}
