package com.nimesia.sweetvillas.controllers;

import com.nimesia.sweetvillas.dto.SpecDTO;
import com.nimesia.sweetvillas.entities.SpecEntity;
import com.nimesia.sweetvillas.mappers.SpecMapper;
import com.nimesia.sweetvillas.services.AccountService;
import com.nimesia.sweetvillas.services.SpecService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
class SpecController extends AbsController {

    @Autowired
    private SpecService svc;
    @Autowired
    private AccountService accountSvc;
    @Autowired
    private SpecMapper mapper;


    /**
     * Get by id request
     *
     * @param id
     */
    @GetMapping("/specs/get")
    public ResponseEntity<SpecEntity> get(
            @RequestParam(name = "id") String id
    ) {
        SpecEntity spec = svc.get(id).get();
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(spec);
    }

    /**
     * Create request
     *
     * @param spec
     */
    @PostMapping("/specs/create")
    @Valid
    public ResponseEntity create(
            @Valid @RequestBody SpecDTO spec
    ) {

        SpecEntity specEntity = mapper.map(spec);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(svc.create(specEntity));

    }

}