package com.israelsouza1230.site.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.israelsouza1230.site.entidade.Usuario;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioResource {

  @GetMapping
  public ResponseEntity<Usuario> findALL() {
    Usuario u = new Usuario(1L, "Maria", "maria@gmail.com", "19123456789", "12345");
    return ResponseEntity.ok().body(u);

  }

}