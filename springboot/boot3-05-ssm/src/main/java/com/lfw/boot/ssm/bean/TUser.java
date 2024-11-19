package com.lfw.boot.ssm.bean;

import lombok.Data;

@Data
public class TUser {
    private Long id;
    private String loginName;
    private String NickName;
    private String passwd;
}
