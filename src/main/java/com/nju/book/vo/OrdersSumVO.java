package com.nju.book.vo;

public class OrdersSumVO {

    //需要统计的用户ID
    private Integer userId;

    //需要统计的年
    private Integer year;

    //返回的统计结果(月)
    private Integer month;

    //返回的统计结果(销费金额)
    private Double total;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
