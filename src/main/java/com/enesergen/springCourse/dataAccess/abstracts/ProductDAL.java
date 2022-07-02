package com.enesergen.springCourse.dataAccess.abstracts;

import com.enesergen.springCourse.entities.concretes.Category;
import com.enesergen.springCourse.entities.concretes.Product;
import com.enesergen.springCourse.entities.dtos.ProductWithCategoryDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductDAL extends JpaRepository<Product, Integer> {
    Product getByProductName(String productName);

    Product getByProductNameAndCategory_CategoryId(String productName, int categoryId);

    List<Product> getByProductNameOrCategory_CategoryId(String productName, int categoryId);

    List<Product> getByCategoryIn(List<Integer> categories);

    List<Product> getByProductNameContains(String productName);

    List<Product> getByProductNameStartsWith(String productName);

    @Query("From Product where productName=:productName and category.categoryId=:categoryId")
    List<Product> getByNameAndCategory(String productName, int categoryId);

    @Query("select new com.enesergen.springCourse.entities.dtos.ProductWithCategoryDto" +
            "(p.id,p.productName,c.categoryName) from  Category c inner join c.products p")
    List<ProductWithCategoryDto> getProductWithCategoryDetails();
}
