package com.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Product;
import com.dao.ProductDao;

@Service
public class ProductService {

	@Autowired
	ProductDao productDao;
	
		public String storeProduct(Product product) {
				
				productDao.save(product);	//save predefined method of JpaRepository 
		
			return "Record saved";
		}
		
		public List<Product> findAllProducts() {
			
			return productDao.findAll();	// findAll pre defined retrieve all product as list of product
			
		}
		
		public String deleteProduct(int pid) {
			if(productDao.existsById(pid)) {		// if record present return true else return false.
				productDao.deleteById(pid);	// no return type means void 
				return "product record deleted";
			}else {
				return "product not present";
			}
		}
		
		public String updateProduct(Product product) {		// pid = 1, pname = "TV", price = 55000
			
			
			Optional<Product> result = productDao.findById(product.getPid());
			
			if(result.isPresent()) {
					Product p1 = result.get();	// retrieve that product object from db. 
					p1.setPname(product.getPname());
					p1.setPrice(product.getPrice());  // replace new data. 
					productDao.saveAndFlush(p1);		// update existing record with new information 
					return "Product updated successfully";
			}else {
				return "product not present";
			}
		}
}









