package org.kearis.formation.javaee7.chapitre1.ex63bis;

import javax.persistence.*;

public abstract class Item63Bis {

  // ======================================
  // =             Attributes             =
  // ======================================

  protected Long id;
  protected String title;
  protected Float price;
  protected String description;

  // ======================================
  // =            Constructors            =
  // ======================================

  public Item63Bis() {
  }

  public Item63Bis(String title, Float price, String description) {
    this.title = title;
    this.price = price;
    this.description = description;
  }

  // ======================================
  // =          Getters & Setters         =
  // ======================================

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Float getPrice() {
    return price;
  }

  public void setPrice(Float price) {
    this.price = price;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}