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

    @Column(nullable = false, unique = true)
    private String placa;

    private String chassi;

    private String marca;

    private String modelo;

    private boolean licenciado;

    public boolean getLicenciado() {
        return licenciado;
    }

    public void setLicenciado(boolean licenciado) {
        this.licenciado = licenciado;
    }



}
