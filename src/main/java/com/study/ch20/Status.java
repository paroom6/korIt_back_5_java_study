package com.study.ch20;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Status {
    OK(200, "정상적인 요청"),
    BAD_REQUEST(400, "비정상적인 요청");

    private int code;
    private String statusName;

}
