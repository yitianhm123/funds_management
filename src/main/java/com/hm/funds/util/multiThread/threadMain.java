package com.hm.funds.util.multiThread;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class threadMain {

    public static void main(String[] args){

     ExecutorService es =  Executors.newFixedThreadPool(3);
     for (int i=1;i<3;i++)
     es.submit(new writeThread("1","2",null));
//     es.execute();
       es.shutdown();

       Map map =new HashMap();
       map.put("asd","asd");
        Set<String> strings= new HashSet<>();
       Executor executor=command -> {
           System.out.println();
       };
    }
}
