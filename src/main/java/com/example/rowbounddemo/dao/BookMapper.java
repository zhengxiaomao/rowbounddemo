package com.example.rowbounddemo.dao;

import com.example.rowbounddemo.bean.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Component;
import java.util.List;

@Mapper
@Component
public interface BookMapper {

    //添加数据
    int insert(Book book);

    //模糊查询
//    List<Book> selectBookByName(String book_name, RowBounds rowBounds);
    List<Book> selectBookByName(String book_name, RowBounds rowBounds);

}
