package com.okc.controller;

import com.okc.pojo.Books;
import com.okc.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Package: com.okc.controller
 * @ClassName: BookController
 * @Description:
 * @Author: okc
 * @Date: 2021/7/27 1:29
 * @Version 1.8
 **/

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    @Qualifier("BookServiceImpl")
    private BooksService booksService;

    /**
     * @Description: getAll获取所有图书信息
     * @param: [model]
     * @return: java.lang.String
     */
    @RequestMapping("/allBook")
    public String getAll(Model model) {
        List<Books> list = booksService.queryAllBooks();
        model.addAttribute("list", list);
        return "allBook";
    }
    /**
     * @Description: toAddBook方法是跳转到添加图书页面
     * @param: []
     * @return: java.lang.String
     */
    @RequestMapping("/toAddBook")
    public String toAddBook(){
        return "addBook";
    }

    /**
     * @Description: addBook是执行添加图书并重定向到图书列表
     * @param: [books]
     * @return: java.lang.String
     */
    @RequestMapping("/addBook")
    public String addBook(Books books) {
        System.out.println(books);
        booksService.addBook(books);
        return "redirect:/book/allBook";
    }

    /**
     * @Description: toUpdateBook方法是跳转到图书更新页面
     * @param: [model, id]
     * @param id 更新的书的id
     * @return: java.lang.String
     */
    @RequestMapping("/toUpdateBook")
    public String toUpdateBook(Model model, int id) {
        Books books = booksService.queryBookById(id);
        System.out.println(books);
        model.addAttribute("book",books );
        return "updateBook";
    }

    /**
     * @Description: updateBook方法是执行更新书籍并且重定向到图书列表
     * @param: [model, book]
     * @return: java.lang.String
     */
    @RequestMapping("/updateBook")
    public String updateBook(Model model, Books book) {
        System.out.println(book);
        booksService.updateBook(book);
        Books books = booksService.queryBookById(book.getBookID());
        model.addAttribute("books", books);
        return "redirect:/book/allBook";
    }

    /**
     * @Description: deleteBook方法是根据id删除图书并重定向到书籍列表
     * @param: [id]
     * @return: java.lang.String
     */
    @RequestMapping("/del/{bookId}")
    public String deleteBook(@PathVariable("bookId") int id) {
        booksService.deleteBookById(id);
        return "redirect:/book/allBook";
    }
}