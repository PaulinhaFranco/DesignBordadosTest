package com.example.DesignBordadosTest.Testes;

import com.example.DesignBordadosTest.Model.Cliente;
import com.example.DesignBordadosTest.Service.ClienteService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@Configuration
public class ClienteTest {

    @Autowired
    private ClienteService clienteService;


    @Test
    @Transactional
    public void testCreate() {

        Cliente cliente = new Cliente();

        cliente.setNome("Teste Cliente");
        cliente.setEmail("teste@teste.com");
        cliente.setCpf("12345678901"); // CPF de 11 dígitos
        cliente.setFone("123456789"); // FONE max 14 dígitos

        Cliente createdCliente = clienteService.create(cliente);
        assertNotNull(createdCliente.getId());
    }

    @Test
    @Transactional
    public void testGet() {
        Cliente cliente = new Cliente();
        cliente.setNome("Teste Cliente");
        cliente.setEmail("teste@teste.com");
        cliente.setCpf("12345678901");
        cliente.setFone("123456789");

        Cliente createdCliente = clienteService.create(cliente);
        assertNotNull(createdCliente.getId());

        Cliente retrievedCliente = clienteService.get(createdCliente.getId());
        assertNotNull(retrievedCliente);
        assertEquals("Teste Cliente", retrievedCliente.getNome());
    }

    @Test
    @Transactional
    public void testGetAll() {
        Cliente cliente = new Cliente();
        cliente.setNome("Teste Cliente");
        cliente.setEmail("teste@teste.com");
        cliente.setCpf("12345678901");
        cliente.setFone("123456789");

        clienteService.create(cliente);

        // Obtém a lista de clientes do serviço
        List<Cliente> clientes = clienteService.get();
        assertNotNull(clientes);
        assertFalse(clientes.isEmpty());
    }

    @Test
    @Transactional
    public void testUpdate() {
        Cliente cliente = new Cliente();
        cliente.setNome("Teste Cliente");
        cliente.setEmail("teste@teste.com");
        cliente.setCpf("12345678901");
        cliente.setFone("123456789");

        Cliente createdCliente = clienteService.create(cliente);
        createdCliente.setNome("Novo Nome");
        clienteService.update(createdCliente.getId(), createdCliente);

        Cliente updatedCliente = clienteService.get(createdCliente.getId());
        assertEquals("Novo Nome", updatedCliente.getNome());
    }

    @Test
    @Transactional
    public void testDelete() {
        Cliente cliente = new Cliente();
        cliente.setNome("Teste Cliente");
        cliente.setEmail("teste@teste.com");
        cliente.setCpf("12345678901");
        cliente.setFone("123456789");

        Cliente createdCliente = clienteService.create(cliente);
        assertNotNull(createdCliente.getId());

        clienteService.delete(createdCliente.getId());
        assertNull(clienteService.get(createdCliente.getId()));
    }

}
