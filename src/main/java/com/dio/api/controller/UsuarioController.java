package com.dio.api.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dio.api.model.Usuario;
import com.dio.api.repository.UsuarioRepository;



@RestController
public class UsuarioController {
    Logger logger = LoggerFactory.getLogger(UsuarioController.class);

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/users")
    public List<Usuario> getUsers(){
        logger.debug("LIST ALL USERS -------");
        return usuarioRepository.findAll();
    }

    @GetMapping("/users/{username}")
    public Usuario getUser(@PathVariable("username") String username){
        logger.info("GET BY ID USER --- {}",username);
        return usuarioRepository.findByUsername(username);
    }
    
    @DeleteMapping("/users/{id}")
    public void delete(@PathVariable("id") Integer id){
        logger.warn("DELETE BY ID {}",id);
         usuarioRepository.deleteById(id);
    }

    @PostMapping("/users")
    public void getUser(@RequestBody Usuario usuario){
        logger.info("SAVE {}",usuario.getLogin());
        usuarioRepository.save(usuario);
    }
}
