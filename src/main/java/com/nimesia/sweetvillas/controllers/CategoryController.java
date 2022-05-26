package com.nimesia.sweetvillas.controllers;

import com.nimesia.sweetvillas.dto.CategoryDTO;
import com.nimesia.sweetvillas.models.CategoryEntity;
import com.nimesia.sweetvillas.mappers.CategoryMapper;
import com.nimesia.sweetvillas.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class CategoryController extends AbsController {

    @Autowired
    private CategoryService svc;
    @Autowired
    private CategoryMapper mapper;

    /**
     * Get by id request
     *
     * @param id
     */
    @GetMapping("/categories/get")
    public ResponseEntity<CategoryEntity> get(
            @RequestParam(name = "id") Integer id
    ) {
        CategoryEntity category = svc.get(id);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(category);
    }

    /**
     * Create request
     *
     * @param category
     */
    @PostMapping("/categories/save")
    @Valid
    public ResponseEntity save(
            @Valid @RequestBody CategoryDTO category
    ) {

        CategoryEntity categoryEntity = mapper.map(category);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(svc.save(categoryEntity));

    }

    /**
     * Delete request
     *
     * @param id
     */
    @DeleteMapping("/categories/delete")
    public ResponseEntity delete(
            @RequestParam(name = "id") Integer id
    ) {
        svc.delete(id);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(String.format("Category id %s deleted", id));

    }
}
