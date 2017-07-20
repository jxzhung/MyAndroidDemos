// IBookManager.aidl
package com.jzhung.demos.aidl;
import com.jzhung.demos.aidl.Book;
// Declare any non-default types here with import statements

interface IBookManager {
    List<Book> getBookList();
    void addBook(in Book book);
}
