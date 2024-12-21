package deploy.elasticbeanstalk.service;

import deploy.elasticbeanstalk.entity.Book;

import java.util.List;

public interface BookService {

    void addBook(deploy.elasticbeanstalk.entity.Book book);

    public List<Book> getBooks();
}
