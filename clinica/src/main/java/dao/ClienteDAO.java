/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
/**
 *
 * @author georg
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

import model.Cliente;

public class ClienteDAO implements Dao<Cliente>{
    private List<Cliente> clientes = new ArrayList<>();
    
    public ClienteDAO() {
        clientes.add(new Cliente(1, "John", "47326464847", "john@domain.com"));
    }
    
    @Override
    public Cliente get(long id) {
        return clientes.get((int) id);
    }
    
    @Override
    public List<Cliente> getAll() {
        return clientes;
    }
    
    @Override
    public void save(Cliente cliente) {
        clientes.add(cliente);
    }
    
    @Override
    public void update(Cliente cliente, String[] params) {
        cliente.setNome(Objects.requireNonNull(
          params[0], "Nome não pode ser nulo"));
        cliente.setEmail(Objects.requireNonNull(
          params[1], "Email não pode ser nulo"));
        
        clientes.add(cliente);
    }
    
    @Override
    public void delete(Cliente cliente) {
        clientes.remove(cliente);
    }
}
