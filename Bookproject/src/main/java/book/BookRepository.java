/*
 * @Author Pugazh 
 * JPA Repository are avaliable here
 */
package book;

import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Integer> {

}