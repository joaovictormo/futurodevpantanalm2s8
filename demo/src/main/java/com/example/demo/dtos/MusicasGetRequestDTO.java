package com.example.demo.dtos;

public class MusicasGetRequestDTO {
    private Boolean possuiGenero;
    private Integer generoId;

    public Boolean getPossuiGenero() {
        return possuiGenero;
    }

    public void setPossuiGenero(Boolean possuiGenero) {
        this.possuiGenero = possuiGenero;
    }

    public Integer getGeneroId() {
        return generoId;
    }

    public void setGeneroId(Integer generoId) {
        this.generoId = generoId;
    }
}
