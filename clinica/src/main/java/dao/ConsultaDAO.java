/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.List;
import java.util.ArrayList;

import model.Consulta;
/**
 *
 * @author georg
 */
public class ConsultaDAO implements Dao<Consulta> {
    private List<Consulta> consultas = new ArrayList<>();
    
    public ConsultaDAO(){
        consultas.add(new Consulta(1, "Dificuldade respiratória", "12/02/2022", "Pneumonia"));
    }
    
    @Override
    public Consulta get(long id){
        return consultas.get((int) id);
    }
    
    @Override
    public List<Consulta> getAll(){
        return consultas;
    }
    
    @Override
    public void save(Consulta consulta){
        consultas.add(consulta);
    }
    
    @Override
    public void update(Consulta consulta, String[] params){
        consulta.setDescricao(params[0]);
        consulta.setData(params[0]);
        consulta.setDiagnostico(params[0]);
    }
    
    @Override
    public void delete(Consulta consulta){
        consultas.remove(consulta);
    }
}
