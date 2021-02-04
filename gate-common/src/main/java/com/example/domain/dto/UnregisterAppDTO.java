package com.example.domain.dto;

import lombok.Data;

/**
 * @Description:
 * @author: xrwang8
 */
@Data
public class UnregisterAppDTO {

    private String appName;

    private String version;

    private String ip;

    private Integer port;
}
