package com.thy.springmvc2_thymeleaf.itemservice.domain.item;

/** 상품 종류 */
public enum ItemType {

    BOOK("도서"), FOOD("음식"), ETC("기타");

    private final String description;

    ItemType(String description) {
        this.description = description;
    }
}