package com.study.ch21;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Member {
    private String name;
    private String phone;

}
