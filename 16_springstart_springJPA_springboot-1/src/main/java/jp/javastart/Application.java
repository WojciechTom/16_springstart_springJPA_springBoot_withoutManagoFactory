package jp.javastart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import jp.javastart.dao.BookDao;
import jp.javastart.model.Book;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws InterruptedException {
		ConfigurableApplicationContext ctx =  SpringApplication.run(Application.class, args);
		BookDao dao = ctx.getBean(BookDao.class);
		Book book = new Book("1115", "czy te oczy mogą kłamać", "chyba nie ");
		dao.save(book);
		Thread.sleep(19000);
		
	}

}
