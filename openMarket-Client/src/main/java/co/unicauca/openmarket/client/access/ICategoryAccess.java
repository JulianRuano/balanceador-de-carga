/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.openmarket.client.access;


//import co.unicauca.openmarket.client.domain.Category;
import co.unicauca.openmarket.commons.domain.Category;
import java.util.List;



/**
 *
 * @author brayan majin, julian ruano
 */
public interface ICategoryAccess {
    
   boolean save(Category newCategory)throws Exception;
   boolean edit(Long id, Category category);
   boolean delete(Long id);
   Category findById(Long id);
   List<Category> findAll();
   List<Category> findByName(String name);
   //boolean clearCategories();

}
