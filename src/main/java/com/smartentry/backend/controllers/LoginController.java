package com.smartentry.backend.controllers;

import com.smartentry.backend.domain.dto.UserDTO;
import com.smartentry.backend.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(value = "/api/login")
public class LoginController {

//    @Autowired
//    private RoleService service;
//
//    @PostMapping
//    public ResponseEntity<UserDTO> insert(@RequestBody UserDTO obj) {
//        obj = new UserDTO(service.insert(obj));
//        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
//                .path("/{id}").buildAndExpand(obj.getId()).toUri();
//        return ResponseEntity.created(uri).build();
//    }
}
