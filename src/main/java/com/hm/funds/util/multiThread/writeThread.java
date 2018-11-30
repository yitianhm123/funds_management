package com.hm.funds.util.multiThread;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public class writeThread implements Runnable  {

    private volatile String startIndex;
    private volatile String endIndex;
    private volatile ByteBuffer byteBuffer;

    public writeThread(String startIndex,String endIndex,ByteBuffer byteBuffer){
        this.startIndex = startIndex;
        this.endIndex = endIndex;
        this.byteBuffer = byteBuffer;

    }

    @Override
    public void run() {

        Integer in1= new Integer("123");
        InputStream inputStream =new InputStream() {
            @Override
            public int read() throws IOException {
                return 0;
            }
        };


        File file =new File("asd.txt");



          System.out.println(Thread.currentThread().getId()+""+Thread.currentThread().getName());
    }
}
