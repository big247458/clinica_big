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

import model.Animal;

public class AnimalDAO implements Dao<Animal>{
    private List<Animal> animais = new ArrayList<>();
    
    public AnimalDAO() {
        animais.add(new Animal(1, "John", "masculino", 8));
    }
    
    @Override
    public Animal get(long id) {
        return animais.get((int) id);
    }
    
    @Override
    public List<Animal> getAll() {
        return animais;
    }
    
    @Override
    public void save(Animal animal) {
        animais.add(animal);
    }
    
    @Override
    public void update(Animal animal, String[] params) {
        animal.setNome(params[0]);
        animal.setSexo(params[1]);
        
        animais.add(animal);
    }
    
    @Override
    public void delete(Animal animal) {
        animais.remove(animal);
    }
}
