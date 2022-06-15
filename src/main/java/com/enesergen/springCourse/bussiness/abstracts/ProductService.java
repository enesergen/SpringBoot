package com.enesergen.springCourse.bussiness.abstracts;

import com.enesergen.springCourse.core.utilities.results.DataResult;
import com.enesergen.springCourse.core.utilities.results.Result;
import com.enesergen.springCourse.entities.concretes.Category;
import com.enesergen.springCourse.entities.concretes.Product;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductService {
    DataResult<List<Product>> getAll();

    Result add(Product product);

    DataResult<Product> getByProductName(String productName);

    DataResult<Product> getByProductNameAndCategory(String productName, Category category);

    DataResult<List<Product>> getByProductNameOrCategory(String productName, Category category);

    DataResult<List<Product>> getByCategoryIn(List<Integer> categories);

    DataResult<List<Product>> getByProductNameContains(String productName);

    DataResult<List<Product>> getByProductNameStartsWith(String productName);

    DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId);

}
