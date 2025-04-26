package com.example.track.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "vehicles")
@Getter
@Setter
public class vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String proprietario;

    @Column(nullable = false, unique = true)
    private String cpf;

    private String placa;

    private String chassi;

    private String marca;

    private String modelo;

    private boolean licensed;



}
