package me.dio.lab.padroesprojetos.services;

import me.dio.lab.padroesprojetos.entities.Cliente;

/**
 * Interface que define o padrão <b>Strategy</b> no domínio de cliente. Com
 * isso, se necessário, podemos ter multiplas implementações dessa mesma
 * interface.
 * 
 * @author guilherj
 */
public interface ClienteService {
	
	Iterable<Cliente> buscarTodos();
	
	Cliente buscarPorId(Long id);
	
	void inserir(Cliente cliente);
	
	void atualizar(Cliente cliente);
	
	void deletar(Long id);
}
