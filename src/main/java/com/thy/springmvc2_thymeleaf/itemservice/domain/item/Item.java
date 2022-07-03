package com.thy.springmvc2_thymeleaf.itemservice.domain.item;

import lombok.Data;

import java.util.List;

@Data
public class Item {

    private Long id;
    private String name;
    private Integer price;
    private Integer quantity;

    /** 판매여부 */
    private boolean open; 
    
    /** 등록 지역 */
    private List<String> regions;
    
    /** 상품 종류 */
    private ItemType itemType;
    
    /** 배송 방식 */
    private String deliveryCode;

    public Item() {
    }

    public Item(String name, Integer price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}
