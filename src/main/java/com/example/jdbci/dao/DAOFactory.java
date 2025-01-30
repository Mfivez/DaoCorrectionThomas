package com.example.jdbci.dao;

import com.example.jdbci.repositories.AddressRepository;
import com.example.jdbci.repositories.BookRepository;
import com.example.jdbci.repositories.BorrowingRepository;
import com.example.jdbci.repositories.UserRepository;

public interface DAOFactory {
    UserRepository user = new UserDAO();
    AddressRepository address = new AddressDAO();
    BookRepository book = new BookDAO();
    BorrowingRepository borrowing = new BorrowingDAO();
}


