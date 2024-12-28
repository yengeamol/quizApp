package com.quizApp.amol.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.quizApp.amol.Model.Exam.Category;
import com.quizApp.amol.Service.categoryService;



@RestController
@RequestMapping("/category")
@CrossOrigin(origins = "http://localhost:4200")
public class categoryController {

    @Autowired
    private categoryService categoryService;

    @PostMapping("/")
    public ResponseEntity<?> addCategory(@RequestBody Category category){
        Category c=this.categoryService.addCategory(category);
        return ResponseEntity.ok(c);
    }

    @GetMapping("/")
    public ResponseEntity<?> getAllCategories(){
        return ResponseEntity.ok(this.categoryService.getAllCategories());
    }

    @GetMapping("/{id}")
    public Category getCategoryById(@PathVariable Long id){
        return this.categoryService.getCategoryById(id);
    }

    @PutMapping("/{id}")
    public Category updateCategory(@PathVariable Long id,@RequestBody Category category) throws Exception {
        return this.categoryService.updateCategory(id,category);
    }

    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable Long id){
        this.categoryService.deleteCategory(id);
    }
}
