package com.nimesia.sweetvillas.controllers;

import com.nimesia.sweetvillas.dto.StoreDTO;
import com.nimesia.sweetvillas.dto.UserDTO;
import com.nimesia.sweetvillas.entities.StoreEntity;
import com.nimesia.sweetvillas.entities.UserEntity;
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
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
    public ResponseEntity<StoreDTO> get(
            @RequestParam(name = "id") Integer id
    ) {
        StoreDTO store = mapper.map(svc.get(id));

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(store);
    }

    /**
     * Search request
     *
     * @param str
     * @param cityId
     * @param page
     * @param limit
     */
    @GetMapping("/stores/search")
    public ResponseEntity search(
            @RequestParam(name = "str", defaultValue = "") String str,
            @RequestParam(name = "cityId", defaultValue = "0") Integer cityId,
            @RequestParam(name = "page", defaultValue = "0") Integer page,
            @RequestParam(name = "limit", defaultValue = "20") Integer limit
    ) {

        List<StoreEntity> storeEntities = svc.search(str, cityId, page, limit);

        List<StoreDTO> stores = storeEntities.stream()
                .map(entity -> mapper.map(entity))
                .collect(Collectors.toList());


        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(stores);
    }

    /**
     * Create store
     *
     * @param store
     */
    @PostMapping("/stores/create")
    @Valid
    public ResponseEntity create(
            @Valid @RequestBody StoreDTO store
    ) {
        UserEntity requestUser = getRequestUser();

        if ( !requestUser.getRole().getId().equals( getSTR() ) ) {
            return ResponseEntity
                    .status(HttpStatus.FORBIDDEN)
                    .body("Cannot create store");
        }

        StoreEntity storeEntity = mapper.map(store);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(svc.save(storeEntity));

    }
}
