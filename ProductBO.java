package com.vyshnu.product.bo;

import com.vyshnu.product.dto.Product;

public interface ProductBO {

	void create(Product product);
	
	Product findProduct(int id);
}
