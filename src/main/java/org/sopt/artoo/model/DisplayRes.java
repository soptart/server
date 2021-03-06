package org.sopt.artoo.model;

import lombok.Data;
import org.sopt.artoo.dto.Display;

import java.util.Date;

@Data
public class DisplayRes {
    //전시회 정보
    Display display;

    //작품 정보
    private int a_idx;
    private String a_name;

    //유저 정보
    private int u_idx;
    private String u_name;

    private int state; //1- 전시신청완료 2- 전시완료 3- 확정되어서 대기 중인 전시

    private int dc_idx;
    private String dc_date;
}

