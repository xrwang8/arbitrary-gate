package com.example.domain.dto;

import lombok.Data;

/**
 * @Description:
 * @author: xrwang8
 * @Date: 2021/2/4 11:21
 */
@Data
public class AppRuleDTO {

    private Integer id;

    private Integer appId;

    private String appName;

    private String version;

    private String matchObject;

    private String matchKey;

    private Byte matchMethod;

    private String matchRule;

    private Integer priority;
}
