package com.example.domain.dto;

import lombok.Data;

/**
 * @Description:
 * @author: xrwang8
 * @Date: 2021/2/4 11:22
 */
@Data
public class RegisterAppDTO {

    private String appName;

    private String contextPath;

    private String version;

    private String ip;

    private Integer port;
}
