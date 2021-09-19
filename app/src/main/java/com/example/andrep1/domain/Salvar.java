package com.example.andrep1.domain;

public class Salvar {
    private Integer id;
    private String valoresGuardados;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
}
    public String getValoresGuardados(){
            return valoresGuardados;
        }
    public void setValoresGuardados(String valoresGuardados){
        this.valoresGuardados = valoresGuardados;
    }
    @Override
    public String toString(){
        return valoresGuardados;
    }
}

