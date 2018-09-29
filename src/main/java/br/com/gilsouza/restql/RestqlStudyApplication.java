package br.com.gilsouza.restql;

import br.com.gilsouza.restql.model.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import restql.core.RestQL;
import restql.core.manager.RestEntityManager;
import restql.core.query.QueryOptions;

import java.util.List;

@SpringBootApplication
public class RestqlStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestqlStudyApplication.class, args);

		QueryOptions opts = new QueryOptions();
		opts.setDebugging(true);
		opts.setGlobalTimeout(10000);
		opts.setTimeout(3000);

		RestEntityManager entityManager = new RestEntityManager(opts);

		List<Product> fetch = entityManager.fetch(Product.class);
		System.out.println(fetch);
	}
}
