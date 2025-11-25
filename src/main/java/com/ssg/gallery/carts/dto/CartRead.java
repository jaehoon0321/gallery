package com.ssg.gallery.carts.dto;

import lombok.Data;
import lombok.Builder;
import lombok.AllArgsConstructor;

/// CartRead : 장바구니 조회 DTO
@Data
@Builder // 빌더 패턴 활성화
@AllArgsConstructor //
public class CartRead {
    private Integer id;
    private Integer itemId;
}