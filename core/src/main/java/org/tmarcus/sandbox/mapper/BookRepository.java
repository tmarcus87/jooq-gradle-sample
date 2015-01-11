package org.tmarcus.sandbox.mapper;

import org.jooq.DSLContext;
import org.jooq.types.UInteger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.tmarcus.sandbox.data.tables.Book;

import java.util.List;

/**
 * @author ono_takahiko
 * @since 2015/01/11
 */
@Repository
public class BookRepository {

	private static final Book BOOK = Book.BOOK;

	@Autowired
	private DSLContext create;

	public List<Book> list(int limit, int offset) {
		Book b = new Book();
		return create.selectFrom(b.as("b"))
				.limit(limit)
				.offset(offset)
				.fetch().into(Book.class);
	}

	public Book read(int id) {
		List<Book> book =
				create.selectFrom(BOOK)
						.where(BOOK.ID.eq(UInteger.valueOf(id)))
						.fetch().into(Book.class);
		return book.size() == 0 ? null : book.get(0);
	}
}
