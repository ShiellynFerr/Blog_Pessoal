package br.org.generation.blogpessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.generation.blogpessoal.model.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository <Postagem, Long> {

	public List <Postagem> findAllbyTituloContainingIgnoreCase(String titulo); //equivalente ao select //ignorar se o titulo vêm em maiusculo ou minisculo
	// select * from tb_postagens where titulo like %titulo%;


	

	
}
