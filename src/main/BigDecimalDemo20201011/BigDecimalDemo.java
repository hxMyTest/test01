package main.BigDecimalDemo20201011;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class BigDecimalDemo {
    public static void main(String [] args){
        Map<String,Object> testMap = new HashMap();
        testMap.put("01",11);
        testMap.put("02",null);
        testMap.put("03","003");
        //testMap.put("test01",testMap.get("01")==null?null:new BigDecimal(testMap.get("01")));
        testMap.put("test02",testMap.get("01"));

    }
}
