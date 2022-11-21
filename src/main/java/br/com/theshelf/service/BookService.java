package br.com.theshelf.service;

import br.com.theshelf.domain.Author;
import br.com.theshelf.domain.Book;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookService {

    //Listagem feita para fins lúdicos
    // o correto seria buscar na camada repository os dados
    public List<Book> listAll(){
        return List.of(
                new Book(1L,"Pequeno Príncipe",
                "Harper Collins",
                2020,
                200,
                false));
    }
}
