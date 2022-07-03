package com.thy.springmvc2_thymeleaf.itemservice.domain.item;

import lombok.Getter;

/** 상품 종류 */
@Getter
public enum ItemType {

    BOOK("도서"), FOOD("음식"), ETC("기타");

    private final String description;

    ItemType(String description) {
        this.description = description;
    }
}
