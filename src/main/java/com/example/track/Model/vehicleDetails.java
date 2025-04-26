package com.example.track.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class vehicleDetails {

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
