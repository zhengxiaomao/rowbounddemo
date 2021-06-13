package com.example.rowbounddemo.bean;

import lombok.Data;
import org.springframework.stereotype.Component;


@Data
@Component
public class Book {

    private Integer id;
    private String bookName;
    private String bookAuthor;
    private String createDate;
    private String updateDate;


}
