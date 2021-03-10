
package com.product.repository; 
import org.springframework.data.repository.CrudRepository;  
import com.product.model.Products; 
//repository that extends CrudRepository  
public interface ProductsRepository extends CrudRepository<Products, Integer>  
{  
}  