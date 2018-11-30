package com.hm.funds.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class GuidUtils {



    public static String  getGuid(){

        return UUID.randomUUID().toString().replace("-","");

    }

    public static void main(String[] args){
        cla clacl = ()->5;
        System.out.println(clacl.clac());
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        list.forEach(System.out::print);

        Map<String,Object> hashMap = new ConcurrentHashMap<>() ;

        hashMap.put("as","asdf");
        hashMap.put("as","1233");
        ApplicationContext ac =new ClassPathXmlApplicationContext("");
        ApplicationContext ac1 =new GenericXmlApplicationContext("");


        Integer a=0;
        Integer b=0;
        a.compareTo(b);
    }

    interface cla{
        int clac();
    }


}
