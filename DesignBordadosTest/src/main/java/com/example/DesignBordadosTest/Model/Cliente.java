package com.example.DesignBordadosTest.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotNull
    @Column(name = "NOME", length = 100, nullable = false)
    private String nome;

    @NotNull
    @Column(name = "FONE", length = 14, nullable = false)
    private String fone;

    @NotNull
    @Column(name = "CPF", length = 11, nullable = false)
    private String cpf;

    @NotNull
    @Column(name = "EMAIL", length = 100, nullable = false)
    private String email;

}
