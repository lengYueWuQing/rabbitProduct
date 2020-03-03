package com.rabbit.product.rabbit;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)
public class EleRunMq {
    @JsonProperty("DTSSZTLL_ID")
    private String DTSSZTLL_ID;
    @JsonProperty("ELE_ID")
    private String ELE_ID;
    @JsonProperty("COMM_PORT")
    private String COMM_PORT;
    @JsonProperty("HAPPENTIME")
    private String HAPPENTIME;
    @JsonProperty("DOOR_STATUS")
    private String DOOR_STATUS;
    @JsonProperty("BGATELOCK")
    private String BGATELOCK;
    @JsonProperty("DIRECTION")
    private String DIRECTION;
    @JsonProperty("SYNCFLOOR")
    private String SYNCFLOOR;
    @JsonProperty("FGATELOCK")
    private String FGATELOCK;
    @JsonProperty("LOAD_PERCENT")
    private String LOAD_PERCENT;
    @JsonProperty("RUNMODE_CODE")
    private String RUNMODE_CODE;
    @JsonProperty("RUNSTATUS")
    private String RUNSTATUS;
    @JsonProperty("RESERVER")
    private String RESERVER;
    @JsonProperty("VFD_TEMP")
    private String VFD_TEMP;
    @JsonProperty("LOAD_NUMBER")
    private String LOAD_NUMBER;
    @JsonProperty("DTYXSJ")
    private String DTYXSJ;
    @JsonProperty("DTQDCS")
    private String DTQDCS;
    @JsonProperty("ONLINE_STATUS")
    private String ONLINE_STATUS;
    @JsonProperty("CURRENTFLOOR")
    private String CURRENTFLOOR;

    public String getCOMM_PORT() {
        return COMM_PORT;
    }

    public void setCOMM_PORT(String COMM_PORT) {
        this.COMM_PORT = COMM_PORT;
    }

    public String getHAPPENTIME() {
        return HAPPENTIME;
    }

    public void setHAPPENTIME(String HAPPENTIME) {
        this.HAPPENTIME = HAPPENTIME;
    }

    public String getSYNCFLOOR() {
        return SYNCFLOOR;
    }

    public void setSYNCFLOOR(String SYNCFLOOR) {
        this.SYNCFLOOR = SYNCFLOOR;
    }

    public String getDOOR_STATUS() {
        return DOOR_STATUS;
    }

    public void setDOOR_STATUS(String DOOR_STATUS) {
        this.DOOR_STATUS = DOOR_STATUS;
    }

    public String getFGATELOCK() {
        return FGATELOCK;
    }

    public void setFGATELOCK(String FGATELOCK) {
        this.FGATELOCK = FGATELOCK;
    }

    public String getBGATELOCK() {
        return BGATELOCK;
    }

    public void setBGATELOCK(String BGATELOCK) {
        this.BGATELOCK = BGATELOCK;
    }

    public String getDIRECTION() {
        return DIRECTION;
    }

    public void setDIRECTION(String DIRECTION) {
        this.DIRECTION = DIRECTION;
    }

    public String getLOAD_PERCENT() {
        return LOAD_PERCENT;
    }

    public void setLOAD_PERCENT(String LOAD_PERCENT) {
        this.LOAD_PERCENT = LOAD_PERCENT;
    }

    public String getRUNMODE_CODE() {
        return RUNMODE_CODE;
    }

    public void setRUNMODE_CODE(String RUNMODE_CODE) {
        this.RUNMODE_CODE = RUNMODE_CODE;
    }

    public String getRUNSTATUS() {
        return RUNSTATUS;
    }

    public void setRUNSTATUS(String RUNSTATUS) {
        this.RUNSTATUS = RUNSTATUS;
    }

    public String getRESERVER() {
        return RESERVER;
    }

    public void setRESERVER(String RESERVER) {
        this.RESERVER = RESERVER;
    }

    public String getDTSSZTLL_ID() {
        return DTSSZTLL_ID;
    }

    public void setDTSSZTLL_ID(String DTSSZTLL_ID) {
        this.DTSSZTLL_ID = DTSSZTLL_ID;
    }

    public String getELE_ID() {
        return ELE_ID;
    }

    public void setELE_ID(String ELE_ID) {
        this.ELE_ID = ELE_ID;
    }

    public String getVFD_TEMP() {
        return VFD_TEMP;
    }

    public void setVFD_TEMP(String VFD_TEMP) {
        this.VFD_TEMP = VFD_TEMP;
    }

    public String getLOAD_NUMBER() {
        return LOAD_NUMBER;
    }

    public void setLOAD_NUMBER(String LOAD_NUMBER) {
        this.LOAD_NUMBER = LOAD_NUMBER;
    }

    public String getDTYXSJ() {
        return DTYXSJ;
    }

    public void setDTYXSJ(String DTYXSJ) {
        this.DTYXSJ = DTYXSJ;
    }

    public String getDTQDCS() {
        return DTQDCS;
    }

    public void setDTQDCS(String DTQDCS) {
        this.DTQDCS = DTQDCS;
    }

    public String getONLINE_STATUS() {
        return ONLINE_STATUS;
    }

    public void setONLINE_STATUS(String ONLINE_STATUS) {
        this.ONLINE_STATUS = ONLINE_STATUS;
    }

    public String getCURRENTFLOOR() {
        return CURRENTFLOOR;
    }

    public void setCURRENTFLOOR(String CURRENTFLOOR) {
        this.CURRENTFLOOR = CURRENTFLOOR;
    }
}
