package com.quizApp.amol.Service;

import java.util.List;

import com.quizApp.amol.Model.Exam.Category;

public interface categoryService {

    public Category addCategory(Category category);
    public Category updateCategory(Long id,Category category) throws Exception;
    public List<Category> getAllCategories();
    public Category getCategoryById(Long categoryId);
    public void deleteCategory(Long categoryId);
}
