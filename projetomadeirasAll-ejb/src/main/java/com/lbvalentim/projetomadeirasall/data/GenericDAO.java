package com.lbvalentim.projetomadeirasall.data;


public class GenericDAO<T> {
 private final Class<T> classe;
  public GenericDAO(Class<T> classe) {
    this.classe = classe;  
}
}