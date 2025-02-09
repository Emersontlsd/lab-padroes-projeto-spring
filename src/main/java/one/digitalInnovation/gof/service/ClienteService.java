package one.digitalInnovation.gof.service;

import one.digitalInnovation.gof.model.Cliente;

/**
 * interface que define o padrão <b>Strategy</b> no domínio de cliente.
 * Com isso, se necessário, podemos ter multiplas implementações dessa
 * mesma interfgce.
 *
 * @author Emerson
 */

public interface ClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);

}
