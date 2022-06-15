package com.enesergen.springCourse.bussiness.concretes;

import com.enesergen.springCourse.bussiness.abstracts.ProductService;
import com.enesergen.springCourse.core.utilities.results.*;
import com.enesergen.springCourse.dataAccess.abstracts.ProductDAL;
import com.enesergen.springCourse.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductManager implements ProductService {
    private ProductDAL productDAL;
    @Autowired
    public ProductManager(ProductDAL productDAL) {
        this.productDAL = productDAL;
    }

    @Override
    public DataResult<List<Product>> getAll() {
       //bussniness code
        if(true){
            return new SuccessDataResult<List<Product>>(this.productDAL.findAll(),"Success");
        }else{
            //false state
            return new ErrorDataResult<List<Product>>(null,"error");

        }

    }

    @Override
    public Result add(Product product) {
        //bussines
        if(true){
            this.productDAL.save(product);
            return new SuccessResult("Success");
        } else{
            return new ErrorResult("Error");
        }
    }
}
