package com.enesergen.springCourse.bussiness.concretes;

import com.enesergen.springCourse.bussiness.abstracts.ProductService;
import com.enesergen.springCourse.core.utilities.results.*;
import com.enesergen.springCourse.dataAccess.abstracts.ProductDAL;
import com.enesergen.springCourse.entities.concretes.Category;
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

    @Override
    public DataResult<Product> getByProductName(String productName) {
        return new SuccessDataResult<Product>(this.productDAL.getByProductName(productName),"Success");
    }

    @Override
    public DataResult<Product> getByProductNameAndCategory(String productName, Category category) {
        return new SuccessDataResult<Product>(this.productDAL.getByProductNameAndCategory(productName,category),"Success");
    }

    @Override
    public DataResult<List<Product>> getByProductNameOrCategory(String productName, Category category) {
        return new SuccessDataResult<List<Product>>(this.productDAL.getByProductNameOrCategory(productName,category),"Success");
    }

    @Override
    public DataResult<List<Product>> getByCategoryIn(List<Integer> categories) {
        return new SuccessDataResult<List<Product>>(this.productDAL.getByCategoryIn(categories),"Success");
    }

    @Override
    public DataResult<List<Product>> getByProductNameContains(String productName) {
        return new SuccessDataResult<List<Product>>(this.productDAL.getByProductNameContains(productName),"Success");
    }

    @Override
    public DataResult<List<Product>> getByProductNameStartsWith(String productName) {
        return new SuccessDataResult<List<Product>>(this.productDAL.getByProductNameStartsWith(productName),"Success");
    }

    @Override
    public DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId) {
        return new SuccessDataResult<List<Product>>(this.productDAL.getByNameAndCategory(productName,categoryId),"Success");
    }


}
