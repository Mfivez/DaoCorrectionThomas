package com.example.jdbci.repositories;

import com.example.jdbci.models.Borrowing;

import java.util.List;

public interface BorrowingRepository extends BaseRepo<Borrowing> {
    List<Borrowing> findByUser(int userId);
    List<Borrowing> findOverdueBooks();
}
