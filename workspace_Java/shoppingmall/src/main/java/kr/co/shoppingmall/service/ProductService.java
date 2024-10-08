package kr.co.shoppingmall.service;

import java.util.List;
import kr.co.shoppingmall.dto.ProductDTO;

public interface ProductService {
    void addProduct(ProductDTO product);
    ProductDTO getProductById(Long id);
    List<ProductDTO> getAllProducts();
}
