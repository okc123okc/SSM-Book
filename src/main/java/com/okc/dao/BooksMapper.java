package com.okc.dao;

import com.okc.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Package: com.okc.dao
 * @ClassName: BooksMapper
 * @Description: Books接口
 * @Author: okc
 * @Date: 2021/7/26 15:07
 * @Version 1.8
 **/

public interface BooksMapper {

    /**
     *增加一本书
     */
    int addBook(Books book);
    /**
     *删除一本书
     * @param id 书的id
     */
    int deleteBookById(@Param("bookID") int id);
    /**
     *更新一本书
     * @param book 通过id更新
     */
    int updateBook(Books book);
    /**
     *查询一本书
     * @param id 书的id
     */
    Books queryBookById(@Param("bookID") int id);
    /**
     *查询所有书
     */
    List<Books> queryAllBooks();
}
