package com.cyker.service;

import com.cyker.domain.Product;
import com.cyker.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repo;

    public List<Product>listAll(){
        return repo.findAll();
    }

    public void save(Product product){
        repo.save(product);
    }

    public void delete(Long id){
        repo.deleteById(id);
    }

    public Product get(Long id){
        return repo.findById(id).get();
    }


}
