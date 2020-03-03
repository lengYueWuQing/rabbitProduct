package com.rabbit.product.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;
import java.util.List;

public class DemoRequestData {

    public static final String ELE_CONTRACT_NO_LIST = "eleContractNoList";
    @JsonProperty(ELE_CONTRACT_NO_LIST)
    @NotNull(message = "不能为null")
    private List<String> eleContractNoList;

    public List<String> getEleContractNoList() {
        return eleContractNoList;
    }

    public void setEleContractNoList(List<String> eleContractNoList) {
        this.eleContractNoList = eleContractNoList;
    }
}
