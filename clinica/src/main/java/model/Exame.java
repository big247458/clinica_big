/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author georg
 */
public class Exame {
    private Integer id;
    private String descricao;
    private String resultado;

    public Exame(Integer id, String descricao, String resultado) {
        this.id = id;
        this.descricao = descricao;
        this.resultado = resultado;
    }

    public Integer getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getResultado() {
        return resultado;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    
    
}
