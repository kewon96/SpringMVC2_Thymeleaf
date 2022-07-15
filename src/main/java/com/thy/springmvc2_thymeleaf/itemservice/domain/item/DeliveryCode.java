package com.thy.springmvc2_thymeleaf.itemservice.domain.item;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * FAST: 빠른 배송
 * NORMAL: 일반 배송
 * SLOW: 느린 배송
 */
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class DeliveryCode {

    /** 시스템에서 전달하는 값 */
    private String code; 
    
    /** 사용자에게 보여주는 값 */
    private String displayName;

}
