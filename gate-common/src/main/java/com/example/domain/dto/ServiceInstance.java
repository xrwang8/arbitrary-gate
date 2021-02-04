package com.example.domain.dto;

import lombok.Data;

/**
 * @Description:
 * @author: xrwang8
 * @Date: 2021/2/4 11:21
 */
@Data
public class ServiceInstance {

    private String appName;

    private String ip;

    private Integer port;

    private String version;

    private Integer weight;
}
