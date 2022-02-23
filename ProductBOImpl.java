package com.vyshnu.product.bo;

import com.vyshnu.product.dao.ProductDAO;
import com.vyshnu.product.dao.ProductDAOImpl;
import com.vyshnu.product.dto.Product;

public class ProductBOImpl implements ProductBO {

	private static ProductDAO dao = new ProductDAOImpl();

	@Override
	public void create(Product product) {
		dao.create(product);
	}

	@Override
	public Product findProduct(int id) {
		return dao.read(id);
	}

}
