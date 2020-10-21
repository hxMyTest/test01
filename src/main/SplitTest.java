package main;

import java.util.HashMap;
import java.util.Map;

public class SplitTest {
    public static void main(String []args){
        String values="";
//        System.out.print(values+=values+"1;");


        Map<String,String> dayPeriodTarriPriceMap = new HashMap<String,String>();
        //此处的数量代表所分的时段数量
        dayPeriodTarriPriceMap.put("01","1");
//        dayPeriodTarriPriceMap.put("02","2");
//        dayPeriodTarriPriceMap.put("03","3");
//        dayPeriodTarriPriceMap.put("04","4");
//        dayPeriodTarriPriceMap.put("05","5");
//        dayPeriodTarriPriceMap.put("06","6");
//        dayPeriodTarriPriceMap.put("07","7");
//        dayPeriodTarriPriceMap.put("08","8");
        Long maxTouTariffNum=8L;

        for (int i = 0; i < maxTouTariffNum; i++) {
            //如果没有则补0
            values = values+(!isEmptyString(dayPeriodTarriPriceMap.get(0+String.valueOf(i+1)))?dayPeriodTarriPriceMap.get(0+String.valueOf(i+1)):"0")+";";
        }
        values = values.substring(0,values.length()-1); //1;2;3;4
        System.out.println("截取前--》"+values);
        String [] valuesArr = values.split(";");
        int valuesLength = valuesArr.length;
//        Boolean flag = false;
//        flag = (valuesLength<8)?(flag==true):flag;
        if(valuesLength<8){
            //计算需要补零“;0”的个数
            int need = 8-valuesLength;
            for(int i=0;i<need;i++){
                values = values+";0";
            }
        }
        System.out.println("截取后《--"+values);
        System.out.println("去零后《--"+trimZero(values));


    }

    //字符串判断非空
    public static final boolean isEmptyString(String s){
        return s==null || s.trim().equals("")||s.equals(null)||s.equals("NULL")||s.trim().equals("undefined");
    }
    //移除多余的零
    public static String trimZero(String s){
        if(s.indexOf(".")>0){
            s=s.replaceAll("0+?$","");
            s=s.replaceAll("[.]$","");
            System.out.print("test001");
            System.out.print("test002");
            System.out.print("这个才是dev上修改");

        }
        return s;

    }
}
