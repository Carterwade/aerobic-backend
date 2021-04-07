package com.nju.book.model;

import java.util.Date;

public class LoggerInfo {
    private Integer id;

    private String operCode;

    private String operType;

    private String operRemark;

    private Integer operator;

    private Date operDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode == null ? null : operCode.trim();
    }

    public String getOperType() {
        return operType;
    }

    public void setOperType(String operType) {
        this.operType = operType == null ? null : operType.trim();
    }

    public String getOperRemark() {
        return operRemark;
    }

    public void setOperRemark(String operRemark) {
        this.operRemark = operRemark == null ? null : operRemark.trim();
    }

    public Integer getOperator() {
        return operator;
    }

    public void setOperator(Integer operator) {
        this.operator = operator;
    }

    public Date getOperDate() {
        return operDate;
    }

    public void setOperDate(Date operDate) {
        this.operDate = operDate;
    }
}