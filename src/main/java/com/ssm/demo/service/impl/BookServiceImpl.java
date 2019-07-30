package com.ssm.demo.service.impl;

import com.ssm.demo.dao.BookDao;
import com.ssm.demo.entity.Book;
import com.ssm.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    @Override
    public Book getBooks() {
        return bookDao.getBooks();
    }
}
