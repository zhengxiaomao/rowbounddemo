package com.example.rowbounddemo;


import com.example.rowbounddemo.bean.Book;
import com.example.rowbounddemo.dao.BookMapper;
import org.apache.ibatis.session.RowBounds;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootJspApplicationTests {

    @Autowired
    private BookMapper bookMapper;

    @Test
    public void contextLoads() {
        Book book = new Book();
        book.setBookName("三国演义");
        book.setBookAuthor("罗关中");
//        book.setId(2);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        book.setCreateDate(sdf.format(new Date()));
        book.setUpdateDate(sdf.format(new Date()));
        bookMapper.insert(book);
        System.out.println("返回的主键:   "+book.getId());
    }

    @Test
    public void run(){

        System.out.println(bookMapper);
    }

    @Test
    public void query() {
//        Map<String, Object> map = new HashMap<String, Object>();
//        map.put("bookName", "");
//        map.put("bookAuthor", "");
        String book_name="三国演义";
        List<Book> list = bookMapper.selectBookByName(book_name, new RowBounds(4, 1));

//        for(Book b : list) {
//            System.out.println(b.getBook_name());
//        }

//        System.out.println(list.size());

        for(int i=0;i<list.size();i++){

            System.out.println(list.get(i));
        }
    }

}

