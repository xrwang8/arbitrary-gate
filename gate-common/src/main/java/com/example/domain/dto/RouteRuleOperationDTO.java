package com.example.domain.dto;

import lombok.Data;

import java.util.List;

/**
 * @Description:
 * @author: xrwang8
 * @Date: 2021/2/4 11:22
 */
@Data
public class RouteRuleOperationDTO {

    private String operationType;

    private List<AppRuleDTO> ruleList;
}
