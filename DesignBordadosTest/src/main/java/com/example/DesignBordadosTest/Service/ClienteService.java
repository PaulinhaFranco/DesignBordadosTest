package com.example.DesignBordadosTest.Service;


import com.example.DesignBordadosTest.Model.Cliente;
import com.example.DesignBordadosTest.Repository.ClienteRepository;
import com.example.DesignBordadosTest.interfaces.IService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class ClienteService implements IService<Cliente, Integer> {

    @Autowired
    private ClienteRepository clienteRepository;


    @Transactional(rollbackFor = Exception.class)
    @Override
    public Cliente create(Cliente cliente) {
        return this.clienteRepository.save(cliente);
    }


    @Override
    public Cliente get(Integer id) {

        Optional<Cliente> clienteEncontrado = clienteRepository.findById(id);
        return clienteEncontrado.orElseGet(Cliente::new);
    }


    @Override
    public List<Cliente> get() {

        return this.clienteRepository.findAll();
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public Cliente update(Integer id, Cliente aluno) {

        Cliente clienteEncontrado = this.get(id);

        if(clienteEncontrado.getId() != null && clienteEncontrado.getId() != 0){
            return this.clienteRepository.save(aluno);
        }
        else{
            return new Cliente();
        }
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void delete(Integer id) {
        this.clienteRepository.deleteById(id);
    }

}
