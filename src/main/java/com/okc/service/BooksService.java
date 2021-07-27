package com.okc.service;

import com.okc.pojo.Books;

import java.util.List;

/**
 * @ClassName: BooksService
 * @Author: okc
 * @Date: 2021/7/26 17:46
 * @Version 1.8
 **/
public interface BooksService {
    /**
     *增加一本书
     */
    int addBook(Books book);
    /**
     *删除一本书
     * @param id 书的id
     */
    int deleteBookById(int id);
    /**
     *更新一本书
     * @param book 通过id更新
     */
    int updateBook(Books book);
    /**
     *查询一本书
     * @param id 书的id
     */
    Books queryBookById(int id);
    /**
     *查询所有书
     */
    List<Books> queryAllBooks();
}
