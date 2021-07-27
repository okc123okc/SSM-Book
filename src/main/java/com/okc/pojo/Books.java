package com.okc.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Package: com.okc.pojo
 * @ClassName: Books
 * @Description:
 * @Author: okc
 * @Date: 2021/7/26 15:05
 * @Version 1.8
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {
    private int bookID;
    private String bookName;
    private int bookCounts;
    private String detail;
}
