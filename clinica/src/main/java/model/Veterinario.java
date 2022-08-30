/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author georg
 */
public class Veterinario extends Pessoa{
    private String crm;
    private String turno;
    private float salario;

    public Veterinario(String crm, String turno, float salario, Integer id, String nome, String cpf, String email) {
        super(id, nome, cpf, email);
        this.crm = crm;
        this.turno = turno;
        this.salario = salario;
    }

    public String getCrm() {
        return crm;
    }

    public String getTurno() {
        return turno;
    }

    public float getSalario() {
        return salario;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
    
}
