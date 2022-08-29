/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.big.clinica.model;

/**
 *
 * @author georg
 */
public class Consulta {
    private Integer id;
    private String descricao;
    private String data;
    private String diagnostico;

    public Consulta(Integer id, String descricao, String data, String diagnostico) {
        this.id = id;
        this.descricao = descricao;
        this.data = data;
        this.diagnostico = diagnostico;
    }

    public Integer getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getData() {
        return data;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }
    
    
}
