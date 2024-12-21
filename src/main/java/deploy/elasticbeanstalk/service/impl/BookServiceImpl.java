package deploy.elasticbeanstalk.service.impl;

import deploy.elasticbeanstalk.entity.Book;
import deploy.elasticbeanstalk.repository.BookRepository;
import deploy.elasticbeanstalk.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void addBook(deploy.elasticbeanstalk.entity.Book book) {
        this.bookRepository.save(book);
    }

    @Override
    public List<Book> getBooks() {
        return this.bookRepository.findAll();
    }
}
