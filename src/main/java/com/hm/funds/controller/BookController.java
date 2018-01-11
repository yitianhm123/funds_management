package com.hm.funds.controller;


import com.alibaba.druid.support.json.JSONUtils;
import com.hm.funds.pojo.TBook;
import com.hm.funds.pojo.TBookDto;
import com.hm.funds.pojo.TBookExample;
import com.hm.funds.pojo.TReader;
import com.hm.funds.service.tFundsService;
import com.hm.funds.util.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping(value = "pages/book")
public class BookController{

    private static  final Logger log = LoggerFactory.getLogger(BookController.class);

    @Autowired
    private tFundsService tFundsService;

        @RequestMapping(value = "/commitMark",method = RequestMethod.POST)
        @ResponseBody
        @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
        public Result<TBook> saveBookMark(@RequestParam("bookMark") String bookMark,
                                   @RequestParam("bookAuthor") String bookAuthor,
                                   @RequestParam("bookName") String bookName) {

            TBook book = new TBook();

            book.setBookAuthor(bookAuthor);
            book.setBookMark(bookMark);
            book.setBookName(bookName);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String date = simpleDateFormat.format(new Date());
            Date dateTime = new Date();
            book.setCreateTime(dateTime);

            TReader reader = new TReader();
            reader.setId("");
            try{
            tFundsService.saveBookMark(book);
            tFundsService.updateReader(reader);
            }catch (Exception e){
                log.info("exception here ");
                throw new RuntimeException(e.getMessage());
            }

            Result result = new Result();
            List<TBook> list = new ArrayList<>();
            log.info("book{}", book.getBookAuthor()+ " bookAuthor "+
            book.getBookMark()+" bookMark "+book.getBookName()+"  bookName " );
            list.add(book);
            result.setList(list);
            return result;
        }

    @RequestMapping(value = "/queryBookComment",method = RequestMethod.GET)
    @ResponseBody
    public Result<TBook> queryBookComment(@RequestParam("bookName") String bookName) {

        TBook book = new TBook();
//        book.setBookAuthor(bookAuthor);
//        book.setBookMark(bookMark);
        book.setBookName(bookName);

        Date dateTime = new Date();
        book.setCreateTime(dateTime);
        Result result = new Result();
        result = tFundsService.queryTbookAll();
//        Result result = new Result();
        List<TBookDto> list = new ArrayList<>();
        log.info("book{}", book.getBookAuthor()+ " bookAuthor "+
                book.getBookMark()+" bookMark "+book.getBookName()+"  bookName " );
//        list.add(list);
//        result.setList(books);
//        result.setNumber(books.size());
        return result;
    }
   @RequestMapping(value = "/deleteBookMark",method = RequestMethod.POST)
    @ResponseBody
    public Result<TBook> deleteBookMark(@RequestParam("bookName") String bookName,@RequestParam("id") int id) {

        TBook book = new TBook();

        book.setBookName(bookName);

        Date dateTime = new Date();
        book.setCreateTime(dateTime);
        Result result = new Result();
        TBook bookExample = new TBook();
       bookExample.setId(id);
        tFundsService.deleteBookMark(bookExample);
//        Result result = new Result();
        List<TBookDto> list = new ArrayList<>();
        log.info("book{}", book.getBookAuthor()+ " bookAuthor "+
                book.getBookMark()+" bookMark "+book.getBookName()+"  bookName " );
//        list.add(list);
//        result.setList(books);
//        result.setNumber(books.size());
        return result;
    }

}
