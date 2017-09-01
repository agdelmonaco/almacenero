package dto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.springframework.stereotype.Component;
import model.Product;
@Component
public class DTOFactory {
	    
	  
	   public static List<ProductDTO> createListOfProductsDTO(List<Product> products){
		   List<ProductDTO> productsDTO = new ArrayList<ProductDTO>();
		   for(Product aProduct: products){
			   ProductDTO aTravelDTO = new ProductDTO();
			   productsDTO.add(aTravelDTO);
		   }
		   return productsDTO;
	   }
	   
}
