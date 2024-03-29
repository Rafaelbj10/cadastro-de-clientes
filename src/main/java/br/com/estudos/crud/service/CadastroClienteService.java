package br.com.estudos.crud.service;

import br.com.estudos.crud.model.Cliente;
import br.com.estudos.crud.parameters.ClienteRequest;
import br.com.estudos.crud.presenters.cliente.ClienteDto;

import java.util.List;

public interface CadastroClienteService {

    Long cadastrar(ClienteRequest request);

    ClienteDto findByCpfDto(String cpf);

    Cliente findByCpf(String cpf);

    String findCpf(String cpf);

    List<Cliente> findAll();

    int deleteClienteByCpf(String cpf);

}
