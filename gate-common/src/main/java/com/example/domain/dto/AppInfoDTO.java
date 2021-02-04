package com.example.domain.dto;

import lombok.Data;

import java.util.List;

/**
 * @Description:
 * @author: xrwang8
 * @Date: 2021/2/4 11:20
 */
@Data
public class AppInfoDTO {

    private Integer appId;

    private String appName;

    private Byte enabled;

    private List<ServiceInstance> instances;

    private List<String> enabledPlugins;
}
