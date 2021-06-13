package com.example.rowbounddemo;

import com.example.rowbounddemo.bean.Book;
import com.example.rowbounddemo.dao.BookMapper;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class test {

    @Autowired
    BookMapper bookMapper;

    @RequestMapping("/test")
    public List query(){
        String book_name="三国演义";
//        List<Book> list = bookMapper.selectBookByName(book_name, new RowBounds(2, 3));
        List<Book> list = bookMapper.selectBookByName(book_name, new RowBounds(2, 3));
        return list;
    }
}
