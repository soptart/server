package org.sopt.artoo.model;


import lombok.*;

import java.util.Date;

@Data
public class PurchaseReq {
    // 구매 인덱스
    private int p_idx;
    // 구매 상태
    private int p_state;
    // 구매 날짜
    private Date p_date;
    // 구매 후기
    private String p_comment;
    // 작품 고유 인덱스
    private int a_idx;
    // 작품 구매자 인덱스
    private int p_buyer_idx;
    // 작품 판매자 인덱스
    private int p_seller_idx;
    // 작품 수령자 이름
    private String p_recipient;
    // 작품 수령 주소
    private String p_address;
    // 구매자 / 판매자 구분
    private boolean p_isBuyer;

}
