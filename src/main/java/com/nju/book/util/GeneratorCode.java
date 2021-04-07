package com.nju.book.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class GeneratorCode {

    public static String generatorOrderCode(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        Date date = new Date();
        //生成当前时间字符串
        String time = simpleDateFormat.format(date);
        String uuid = UUID.randomUUID().toString();
        //生成订单编号
        String code = time + uuid.replaceAll("-","").substring(0,10);
        return code;
    }

    public static void main(String[] args){
        System.out.println(GeneratorCode.generatorOrderCode());
    }

}
