package com.obifyconsulting.com.fifteen.wraper;

public class WraperMain {
    public static void main(String[] args) {
        Integer num=10;
        Integer num2=new Integer(12345);
        Double salary=234.45;
        Double salary2=new Double(23456.45);
        Float a=102.5f;
        Float a1=new Float(109.2);
        Long l1=1022222L;
        Long l2=new Long(122314);
        Character c='A';
        Character c1=new Character('B');
        Boolean b=new Boolean("true");

        String rollNum="123";
        Integer r=Integer.parseInt(rollNum);
        r=Integer.valueOf(rollNum);
        Double d=Double.parseDouble(rollNum);
//        d=Double.valueOf(rollNum);
        System.out.println(r);
        System.out.println(d);

        int x=55;
        Integer y=x;
        System.out.println(x);
        System.out.println(y);


        Double d1=554.34;
        Double d2=d;
        System.out.println(d1);
        System.out.println(d2);





    }
}
