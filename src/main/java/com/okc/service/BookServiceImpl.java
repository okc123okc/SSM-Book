package com.okc.service;

import com.okc.dao.BooksMapper;
import com.okc.pojo.Books;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Package: com.okc.service
 * @ClassName: BookServiceImpl
 * @Description:
 * @Author: okc
 * @Date: 2021/7/26 17:47
 * @Version 1.8
 **/
@Service
public class BookServiceImpl implements BooksService {
    //调用dao层的操作，设置一个set接口，方便Spring管理
    private BooksMapper booksMapper;

    public void setBooksMapper(BooksMapper booksMapper) {
        this.booksMapper = booksMapper;
    }

    public int addBook(Books book) {
        return booksMapper.addBook(book);
    }

    public int deleteBookById(int id) {
        return booksMapper.deleteBookById(id);
    }

    public int updateBook(Books book) {
        return booksMapper.updateBook(book);
    }

    public Books queryBookById(int id) {
        return booksMapper.queryBookById(id);
    }

    public List<Books> queryAllBooks() {
        return booksMapper.queryAllBooks();
    }
}
