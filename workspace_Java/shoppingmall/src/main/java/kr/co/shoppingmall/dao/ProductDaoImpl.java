package kr.co.shoppingmall.dao;

import kr.co.shoppingmall.dto.ProductDTO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductDaoImpl implements ProductDao {

    @Autowired
    private SqlSession sqlSession;

    @Override
    public void insertProduct(ProductDTO product) {
        sqlSession.insert("kr.co.shoppingmall.dao.ProductDao.insertProduct", product);
    }

    @Override
    public ProductDTO findProductById(Long id) {
        return sqlSession.selectOne("kr.co.shoppingmall.dao.ProductDao.findProductById", id);
    }

    @Override
    public List<ProductDTO> findAllProducts() {
        return sqlSession.selectList("kr.co.shoppingmall.dao.ProductDao.findAllProducts");
    }
}
