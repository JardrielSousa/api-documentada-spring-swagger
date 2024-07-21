package com.dio.api.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.dio.api.model.Usuario;

@Repository
public class UsuarioRepository {

    public void save(Usuario usuario){
        if(usuario.getId()==null){
            System.out.println("SAVE ---");
        }else{
            System.out.println("UPDATE ---");

        }
    }

    public void deleteById(Integer id){
        System.out.println(String.format("DELETE ", id));
        System.out.println(id);
    }

    public List<Usuario> findAll(){
        System.out.println("LIST USERS:");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("usuario 1", "qwe123"));
        usuarios.add(new Usuario("usuario 2", "root"));
        return usuarios;
    }

    public Usuario findById(Integer id){
        System.out.println("FIND/id : "+id);
        return new Usuario("usuario 1", "qwe123");
    }

    public Usuario findByUsername(String userName){
        System.out.println("FIND/username : "+userName);
        return new Usuario("usuario 1", "qwe123");
    }
}
