package com.israelsouza1230.site.entidade;

import java.io.Serializable;

public class Usuario implements Serializable {

  private long id;
  private String nome;
  private String email;
  private String telefone;
  private String senha;

  public Usuario() {
  }

  public Usuario(long id, String nome, String email, String telefone, String senha) {
    this.id = id;
    this.nome = nome;
    this.email = email;
    this.telefone = telefone;
    this.senha = senha;
  }

  /**
   * @return long return the id
   */
  public long getId() {
    return id;
  }

  /**
   * @param id the id to set
   */
  public void setId(long id) {
    this.id = id;
  }

  /**
   * @return String return the nome
   */
  public String getNome() {
    return nome;
  }

  /**
   * @param nome the nome to set
   */
  public void setNome(String nome) {
    this.nome = nome;
  }

  /**
   * @return String return the email
   */
  public String getEmail() {
    return email;
  }

  /**
   * @param email the email to set
   */
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * @return String return the telefone
   */
  public String getTelefone() {
    return telefone;
  }

  /**
   * @param telefone the telefone to set
   */
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  /**
   * @return String return the senha
   */
  public String getSenha() {
    return senha;
  }

  /**
   * @param senha the senha to set
   */
  public void setSenha(String senha) {
    this.senha = senha;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + (int) (id ^ (id >>> 32));
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Usuario other = (Usuario) obj;
    if (id != other.id)
      return false;
    return true;
  }

}