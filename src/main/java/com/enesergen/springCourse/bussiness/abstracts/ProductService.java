package com.enesergen.springCourse.bussiness.abstracts;

import com.enesergen.springCourse.core.utilities.results.DataResult;
import com.enesergen.springCourse.core.utilities.results.Result;
import com.enesergen.springCourse.entities.concretes.Product;

import java.util.List;

public interface ProductService {
    DataResult<List<Product>>getAll();
    Result add(Product product);

}
