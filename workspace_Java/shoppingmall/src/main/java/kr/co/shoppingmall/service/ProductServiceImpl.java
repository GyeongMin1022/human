package kr.co.shoppingmall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.shoppingmall.dao.ProductDao;
import kr.co.shoppingmall.dto.ProductDTO;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public void addProduct(ProductDTO product) {
        productDao.insertProduct(product);
    }

    @Override
    public ProductDTO getProductById(Long id) {
        return productDao.findProductById(id);
    }

    @Override
    public List<ProductDTO> getAllProducts() {
        return productDao.findAllProducts();
    }
}
