package com.example.DesignBordadosTest.Resource;


import com.example.DesignBordadosTest.Model.Cliente;
import com.example.DesignBordadosTest.Service.ClienteService;
import com.example.DesignBordadosTest.interfaces.IResource;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("api/v1/cliente")
public class ClienteResource implements IResource<Cliente, Integer> {

    @Autowired
    private ClienteService clienteService;

    @PostMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE,
                    MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Operation(
            summary = "Cria um aluno",
            description = "Método responsável para criar um aluno no sistema",
            tags = {"cliente"})
    @ApiResponses({
            @ApiResponse(responseCode = "400", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "405", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "407", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "401", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "403", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "415", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "500", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "501", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "502", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "503", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "504", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),

            @ApiResponse(responseCode = "201", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "200", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "303", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),
    })


    @Override
    public Cliente create(@Valid @RequestBody Cliente cliente) {
        log.info("Cadastro do cliente iniciado");
        log.debug("Informações do cliente: {}", cliente);

        return this.clienteService.create(cliente);
    }

    @GetMapping(
            value = "/{id}", //http://localhost:8080/api/v1/cliente/1
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @Operation(
            summary = "Recupera um cliente baseado em um identificador",
            description = "Método responsável para recuperar um cliente no sistema baseado no identificador",
            tags = {"cliente"})
    @ApiResponses({
            @ApiResponse(responseCode = "400", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "405", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "407", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "401", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "403", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "415", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "500", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "501", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "502", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "503", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "504", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),

            @ApiResponse(responseCode = "200", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "304", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),
    })

    @Override
    public Cliente get(@PathVariable("id") Integer id) {
        return this.clienteService.get(id);
    }

    @GetMapping(
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Operation(
            summary = "Recupera uma lista de clientes",
            description = "Método responsável para recuperar uma lista de clientes",
            tags = {"cliente"})
    @ApiResponses({
            @ApiResponse(responseCode = "400", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "405", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "407", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "401", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "403", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "415", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "500", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "501", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "502", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "503", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "504", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),

            @ApiResponse(responseCode = "200", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "206", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "304", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "416", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)})
    })

    @Override
    public List<Cliente> get() {
        return this.clienteService.get();
    }

    @PutMapping(
            value = "/{id}",
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Operation(
            summary = "Atualiza todos os dados de um cliente",
            description = "Método responsável para atualizar todos os dados de um cliente.",
            tags = {"cliente"})
    @ApiResponses({
            @ApiResponse(responseCode = "400", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "405", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "407", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "401", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "403", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "415", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "500", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "501", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "502", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "503", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "504", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),

            @ApiResponse(responseCode = "200", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "201", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "204", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "409", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)})
    })

    @Override
    public Cliente update(@PathVariable Integer id, @RequestBody Cliente cliente) {
        return this.clienteService.update(id, cliente);
    }

    @DeleteMapping(value = "/{id}")
    @Operation(
            summary = "Exclui um cliente com base no identificador.",
            description = "Método responsável para deletar um cliente com base no identificador.",
            tags = {"cliente"})
    @ApiResponses({
            @ApiResponse(responseCode = "400", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "405", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "407", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "401", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "403", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "415", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "500", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "501", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "502", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "503", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "504", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),

            @ApiResponse(responseCode = "200", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "202", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "204", content = {@Content(schema = @Schema(implementation = Cliente.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),
    })

    @Override
    public void delete(@PathVariable Integer id) {
        this.clienteService.delete(id);
    }

}
