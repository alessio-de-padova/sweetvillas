package com.nimesia.sweetvillas.controllers;

import com.nimesia.sweetvillas.dto.CartProductDTO;
import com.nimesia.sweetvillas.entities.CartProductEntity;
import com.nimesia.sweetvillas.entities.UserEntity;
import com.nimesia.sweetvillas.mappers.CartProductMapper;
import com.nimesia.sweetvillas.mappers.ProductMapper;
import com.nimesia.sweetvillas.services.CartProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

@Controller
public class CartProductController extends AbsController {

    @Autowired
    private CartProductService svc;
    @Autowired
    private CartProductMapper mapper;

    /**
     * Add product to cart
     *
     * @param cartProductDTO
     */
    @PostMapping("/products/add-to-cart")
    @Valid
    public ResponseEntity addToCart(
            @Valid @RequestBody CartProductDTO cartProductDTO
            ) {

        UserEntity requestUser = getRequestUser();

        CartProductEntity product = mapper.map(cartProductDTO);
        product.setUser(requestUser);

        svc.save(product);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body("Product added");

    }
}
