package com.klund.product.bo;

import com.klund.product.dto.Product;

public interface ProductBO {
	
	public void create(Product product);
	
	public Product findProduct(int id);

}
