package com.nimesia.sweetvillas.controllers;

import com.nimesia.sweetvillas.dto.StoreDTO;
import com.nimesia.sweetvillas.entities.StoreEntity;
import com.nimesia.sweetvillas.mappers.StoreMapper;
import com.nimesia.sweetvillas.services.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

@Controller
public class StoreController extends AbsController {

    @Autowired
    private StoreService svc;
    @Autowired
    private StoreMapper mapper;

    /**
     * Get by id request
     *
     * @param id
     */
    @GetMapping("/stores/get")
    public ResponseEntity<StoreEntity> get(
            @RequestParam(name = "id") Integer id
    ) {
        StoreEntity store = svc.get(id);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(store);
    }

    /**
     * Create store
     *
     * @param store
     */
    @PostMapping("/stores/save")
    @Valid
    public ResponseEntity save(
            @Valid @RequestBody StoreDTO store
    ) {

        StoreEntity storeEntity = mapper.map(store);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(svc.save(storeEntity));

    }
}
