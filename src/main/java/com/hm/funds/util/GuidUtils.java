package com.hm.funds.util;

import java.util.UUID;

public class GuidUtils {

    public static String  getGuid(){

        return UUID.randomUUID().toString().replace("-","");
    }
}
