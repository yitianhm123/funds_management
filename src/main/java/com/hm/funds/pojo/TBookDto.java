package com.hm.funds.pojo;

import java.io.Serializable;
import java.util.Date;



    public class TBookDto implements Serializable {
        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database column book.id
         *
         * @mbggenerated Sat Nov 18 16:01:14 CST 2017
         */
        private Integer id;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database column book.book_name
         *
         * @mbggenerated Sat Nov 18 16:01:14 CST 2017
         */
        private String bookName;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database column book.book_mark
         *
         * @mbggenerated Sat Nov 18 16:01:14 CST 2017
         */
        private String bookMark;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database column book.book_author
         *
         * @mbggenerated Sat Nov 18 16:01:14 CST 2017
         */
        private String bookAuthor;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database column book.create_time
         *
         * @mbggenerated Sat Nov 18 16:01:14 CST 2017
         */
        private String createTime;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database column book.create_user_id
         *
         * @mbggenerated Sat Nov 18 16:01:14 CST 2017
         */
        private String createUserId;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database column book.remark
         *
         * @mbggenerated Sat Nov 18 16:01:14 CST 2017
         */
        private String remark;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table book
         *
         * @mbggenerated Sat Nov 18 16:01:14 CST 2017
         */
        private static final long serialVersionUID = 1L;

        /**
         * This method was generated by MyBatis Generator.
         * This method returns the value of the database column book.id
         *
         * @return the value of book.id
         *
         * @mbggenerated Sat Nov 18 16:01:14 CST 2017
         */
        public Integer getId() {
            return id;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column book.id
         *
         * @param id the value for book.id
         *
         * @mbggenerated Sat Nov 18 16:01:14 CST 2017
         */
        public void setId(Integer id) {
            this.id = id;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method returns the value of the database column book.book_name
         *
         * @return the value of book.book_name
         *
         * @mbggenerated Sat Nov 18 16:01:14 CST 2017
         */
        public String getBookName() {
            return bookName;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column book.book_name
         *
         * @param bookName the value for book.book_name
         *
         * @mbggenerated Sat Nov 18 16:01:14 CST 2017
         */
        public void setBookName(String bookName) {
            this.bookName = bookName == null ? null : bookName.trim();
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method returns the value of the database column book.book_mark
         *
         * @return the value of book.book_mark
         *
         * @mbggenerated Sat Nov 18 16:01:14 CST 2017
         */
        public String getBookMark() {
            return bookMark;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column book.book_mark
         *
         * @param bookMark the value for book.book_mark
         *
         * @mbggenerated Sat Nov 18 16:01:14 CST 2017
         */
        public void setBookMark(String bookMark) {
            this.bookMark = bookMark == null ? null : bookMark.trim();
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method returns the value of the database column book.book_author
         *
         * @return the value of book.book_author
         *
         * @mbggenerated Sat Nov 18 16:01:14 CST 2017
         */
        public String getBookAuthor() {
            return bookAuthor;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column book.book_author
         *
         * @param bookAuthor the value for book.book_author
         *
         * @mbggenerated Sat Nov 18 16:01:14 CST 2017
         */
        public void setBookAuthor(String bookAuthor) {
            this.bookAuthor = bookAuthor == null ? null : bookAuthor.trim();
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method returns the value of the database column book.create_time
         *
         * @return the value of book.create_time
         *
         * @mbggenerated Sat Nov 18 16:01:14 CST 2017
         */
        public String getCreateTime() {
            return createTime;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column book.create_time
         *
         * @param createTime the value for book.create_time
         *
         * @mbggenerated Sat Nov 18 16:01:14 CST 2017
         */
        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method returns the value of the database column book.create_user_id
         *
         * @return the value of book.create_user_id
         *
         * @mbggenerated Sat Nov 18 16:01:14 CST 2017
         */
        public String getCreateUserId() {
            return createUserId;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column book.create_user_id
         *
         * @param createUserId the value for book.create_user_id
         *
         * @mbggenerated Sat Nov 18 16:01:14 CST 2017
         */
        public void setCreateUserId(String createUserId) {
            this.createUserId = createUserId == null ? null : createUserId.trim();
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method returns the value of the database column book.remark
         *
         * @return the value of book.remark
         *
         * @mbggenerated Sat Nov 18 16:01:14 CST 2017
         */
        public String getRemark() {
            return remark;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column book.remark
         *
         * @param remark the value for book.remark
         *
         * @mbggenerated Sat Nov 18 16:01:14 CST 2017
         */
        public void setRemark(String remark) {
            this.remark = remark == null ? null : remark.trim();
        }
    }

