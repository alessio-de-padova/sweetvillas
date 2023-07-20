package com.nimesia.sweetvillas.controllers;

import com.nimesia.sweetvillas.dto.ProductDTO;
import com.nimesia.sweetvillas.dto.UserDTO;
import com.nimesia.sweetvillas.models.ProductEntity;
import com.nimesia.sweetvillas.mappers.ProductMapper;
import com.nimesia.sweetvillas.models.UserEntity;
import com.nimesia.sweetvillas.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class ProductController extends AbsController {
    @Autowired
    private ProductService svc;
    @Autowired
    private ProductMapper mapper;


    /**
     * Get by id request
     *
     * @param id
     */
    @GetMapping("/products/{id}")
    public ResponseEntity<ProductDTO> get(
            @PathVariable(name = "id") Integer id
    ) {
        ProductDTO product = mapper.map(svc.get(id));

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(product);
    }

    /**
     * Update product
     *
     * @param product
     */
    @PutMapping("/products")
    @Valid
    public ResponseEntity update(
            @Valid @RequestBody ProductDTO product
    ) {

        if (!getRequestUser().getRole().getId().equals(getSTR())) {
            return ResponseEntity
                    .status(HttpStatus.FORBIDDEN)
                    .body("Cannot create product");
        }

        ProductEntity prevProduct = svc.get(product.getId());

        ProductEntity productEntity = mapper.map(product);

        if ( productEntity.getCategories() == null ) {
            productEntity.setCategories(prevProduct.getCategories());
        }

        if ( productEntity.getStore() == null ) {
            productEntity.setStore(prevProduct.getStore());
        }

        ProductDTO productDTO = mapper.map(svc.save(productEntity));
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(productDTO);

    }

    /**
     * Create product
     *
     * @param product
     */
    @PostMapping("/products")
    @Valid
    public ResponseEntity save(
            @Valid @RequestBody ProductDTO product
    ) {

        if (!getRequestUser().getRole().getId().equals(getSTR())) {
            return ResponseEntity
                    .status(HttpStatus.FORBIDDEN)
                    .body("Cannot create product");
        }

        ProductEntity productEntity = mapper.map(product);

        ProductDTO productDTO = mapper.map(svc.save(productEntity));
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(productDTO);

    }

    @DeleteMapping("/products/{id}")
    @Valid
    public ResponseEntity delete(
            @PathVariable(name = "id") Integer id
    ) {

        UserEntity user = getRequestUser();
        if (!user.getRole().getId().equals(getSTR())) {
            return ResponseEntity
                    .status(HttpStatus.FORBIDDEN)
                    .body("Cannot create product");
        }

        ProductEntity product = svc.get(id);

        if (!product.getStore().getUser().getId().equals(user.getId())) {
            return ResponseEntity
                    .status(HttpStatus.FORBIDDEN)
                    .body("Cannot create product");
        }


        svc.delete(id);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(true);

    }

}
