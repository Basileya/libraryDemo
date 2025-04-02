package lib.library.map;

import lib.library.dto.BookDTO;
import lib.library.dto.PublishingHouseDTO;
import lib.library.model.Book;
import lib.library.model.PublishingHouse;
import lib.library.repository.PublishingHouseRepository;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@ToString
public class BookMap {


    public Book saveBook(BookDTO bookDTO){
        Book book = new Book();
        book.setName(bookDTO.getName());
        book.setAuthorName(bookDTO.getAuthorName());
        book.setYear(bookDTO.getYear());
        book.setBalance(bookDTO.getBalance());
        book.setDelete(bookDTO.getDelete());
        PublishingHouse publishingHouse = new PublishingHouse();
        publishingHouse.setPublishingHouse(bookDTO.getPublishingHouseDTO().getPublishingHouse());
        publishingHouse.setId(bookDTO.getPublishingHouseDTO().getId());
        book.setPublishingHouse(publishingHouse);
// 26 - 29 - створюєм об'єкт який мапимо до book

        return book;
    }

    public Book updateBook(BookDTO bookDTO, Integer id){
        Book book = new Book();
        book.setId(id);
        book.setName(bookDTO.getName());
        book.setAuthorName(bookDTO.getAuthorName());
        book.setYear(bookDTO.getYear());
        book.setBalance(bookDTO.getBalance());
        return book;
    }

//    public BookDTO saveBook(Book book){
//        BookDTO bookDTO = new BookDTO();
//        bookDTO.setName(book.getName());
//        bookDTO.setAuthorName(book.getAuthorName());
//        bookDTO.setYear(book.getYear());
//        bookDTO.setBalance(book.getBalance());
//
//        PublishingHouse publishingHouse = new PublishingHouse();
//        publishingHouse.setId(book.getPublishingHouse().getId());
//        publishingHouse.setPublishingHouse(book.getPublishingHouse().getPublishingHouse());
//        bookDTO.setPublishingHouse(publishingHouse);
//        return  bookDTO;
//    }
//
//    public BookDTO updateBook(Book book, Integer id){
//        BookDTO bookDTO = new BookDTO();
//
//        bookDTO.setName(book.getName());
//        bookDTO.setAuthorName(book.getAuthorName());
//        bookDTO.setYear(book.getYear());
//        PublishingHouse publishingHouse = new PublishingHouse();
//        publishingHouse.setPublishingHouse(book.getPublishingHouse().getPublishingHouse());
//        publishingHouse.setId(book.getPublishingHouse().getId());
//        bookDTO.setPublishingHouse(publishingHouse);
//        return bookDTO;
//    }

    //написати з Entity створити DTO
}
