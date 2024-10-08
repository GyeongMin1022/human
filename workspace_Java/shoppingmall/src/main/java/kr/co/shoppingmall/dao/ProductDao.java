package kr.co.shoppingmall.dao;

import kr.co.shoppingmall.dto.ProductDTO;

import java.util.List;

public interface ProductDao {
    void insertProduct(ProductDTO product);
    ProductDTO findProductById(Long id);
    List<ProductDTO> findAllProducts();
}
