package com.rabbit.product.rabbit;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * mq返回电梯故障信息
 */
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)
public class EleTroubleMq {
    @JsonProperty("WORKORDER_ID")
    private String WORKORDER_ID;
    @JsonProperty("WO_STATUS_CODE")
    private String WO_STATUS_CODE;
    @JsonProperty("CREATION_DATE")
    private String CREATION_DATE;
    @JsonProperty("ELE_ID")
    private String ELE_ID;
    @JsonProperty("ELE_CONTRACT_NO")
    private String ELE_CONTRACT_NO;
    @JsonProperty("ELE_FAULT_ID")
    private String ELE_FAULT_ID;
    @JsonProperty("REPORT")
    private String REPORT;
    @JsonProperty("EXAMINE")
    private String EXAMINE;
    @JsonProperty("REPAIR")
    private String REPAIR;
    @JsonProperty("REPORT_DATE")
    private String REPORT_DATE;
    @JsonProperty("LEAVE_DATE")
    private String LEAVE_DATE;
    @JsonProperty("EST_ARRIVE_TIME")
    private String EST_ARRIVE_TIME;
    @JsonProperty("TRAPPED_NUMBER")
    private String TRAPPED_NUMBER;
    @JsonProperty("RESCUED_TIME")
    private String RESCUED_TIME;
    @JsonProperty("ACCEPT_USER_NAME")
    private String ACCEPT_USER_NAME;
    @JsonProperty("STATUS_CODE_POST")
    private String STATUS_CODE_POST;
    @JsonProperty("CHG_TIME")
    private Long CHG_TIME;
    @JsonProperty("GZXXID")
    private String GZXXID;
    @JsonProperty("WORKORDER_NO")
    private String WORKORDER_NO;

    public String getWORKORDER_ID() {
        return WORKORDER_ID;
    }

    public void setWORKORDER_ID(String WORKORDER_ID) {
        this.WORKORDER_ID = WORKORDER_ID;
    }

    public String getWO_STATUS_CODE() {
        return WO_STATUS_CODE;
    }

    public void setWO_STATUS_CODE(String WO_STATUS_CODE) {
        this.WO_STATUS_CODE = WO_STATUS_CODE;
    }

    public String getELE_ID() {
        return ELE_ID;
    }

    public void setELE_ID(String ELE_ID) {
        this.ELE_ID = ELE_ID;
    }

    public String getELE_CONTRACT_NO() {
        return ELE_CONTRACT_NO;
    }

    public void setELE_CONTRACT_NO(String ELE_CONTRACT_NO) {
        this.ELE_CONTRACT_NO = ELE_CONTRACT_NO;
    }

    public String getELE_FAULT_ID() {
        return ELE_FAULT_ID;
    }

    public void setELE_FAULT_ID(String ELE_FAULT_ID) {
        this.ELE_FAULT_ID = ELE_FAULT_ID;
    }

    public String getREPORT() {
        return REPORT;
    }

    public void setREPORT(String REPORT) {
        this.REPORT = REPORT;
    }

    public String getEXAMINE() {
        return EXAMINE;
    }

    public void setEXAMINE(String EXAMINE) {
        this.EXAMINE = EXAMINE;
    }

    public String getREPAIR() {
        return REPAIR;
    }

    public void setREPAIR(String REPAIR) {
        this.REPAIR = REPAIR;
    }

    public String getLEAVE_DATE() {
        return LEAVE_DATE;
    }

    public void setLEAVE_DATE(String LEAVE_DATE) {
        this.LEAVE_DATE = LEAVE_DATE;
    }

    public String getEST_ARRIVE_TIME() {
        return EST_ARRIVE_TIME;
    }

    public void setEST_ARRIVE_TIME(String EST_ARRIVE_TIME) {
        this.EST_ARRIVE_TIME = EST_ARRIVE_TIME;
    }

    public String getTRAPPED_NUMBER() {
        return TRAPPED_NUMBER;
    }

    public void setTRAPPED_NUMBER(String TRAPPED_NUMBER) {
        this.TRAPPED_NUMBER = TRAPPED_NUMBER;
    }

    public String getRESCUED_TIME() {
        return RESCUED_TIME;
    }

    public void setRESCUED_TIME(String RESCUED_TIME) {
        this.RESCUED_TIME = RESCUED_TIME;
    }

    public String getACCEPT_USER_NAME() {
        return ACCEPT_USER_NAME;
    }

    public void setACCEPT_USER_NAME(String ACCEPT_USER_NAME) {
        this.ACCEPT_USER_NAME = ACCEPT_USER_NAME;
    }

    public String getSTATUS_CODE_POST() {
        return STATUS_CODE_POST;
    }

    public void setSTATUS_CODE_POST(String STATUS_CODE_POST) {
        this.STATUS_CODE_POST = STATUS_CODE_POST;
    }

    public String getWORKORDER_NO() {
        return WORKORDER_NO;
    }

    public void setWORKORDER_NO(String WORKORDER_NO) {
        this.WORKORDER_NO = WORKORDER_NO;
    }

    public String getCREATION_DATE() {
        return CREATION_DATE;
    }

    public void setCREATION_DATE(String CREATION_DATE) {
        this.CREATION_DATE = CREATION_DATE;
    }

    public String getREPORT_DATE() {
        return REPORT_DATE;
    }

    public void setREPORT_DATE(String REPORT_DATE) {
        this.REPORT_DATE = REPORT_DATE;
    }

    public Long getCHG_TIME() {
        return CHG_TIME;
    }

    public void setCHG_TIME(Long CHG_TIME) {
        this.CHG_TIME = CHG_TIME;
    }

    public String getGZXXID() {
        return GZXXID;
    }

    public void setGZXXID(String GZXXID) {
        this.GZXXID = GZXXID;
    }
}
