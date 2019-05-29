package com.spnd.dto;

public class DBMapperDTO {
    String oraType;
    String mySQLType;
    String convertable;

    public String getOraType() {
        return oraType;
    }

    public void setOraType(String oraType) {
        this.oraType = oraType;
    }

    public String getMySQLType() {
        return mySQLType;
    }

    public void setMySQLType(String mySQLType) {
        this.mySQLType = mySQLType;
    }

    public String getConvertable() {
        return convertable;
    }

    public void setConvertable(String convertable) {
        this.convertable = convertable;
    }
}
