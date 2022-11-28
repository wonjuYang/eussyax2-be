package com.triplej.eussyax2.model;

import java.time.LocalDateTime;
import javax.persistence.*;

@Entity
@Table(name = "todo")
public class Todo {


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public LocalDateTime getCreatedDateTime() {
    return createdDateTime;
  }

  public void setCreatedDateTime(LocalDateTime createdDateTime) {
    this.createdDateTime = createdDateTime;
  }

  public boolean getIsComplete() {
    return isComplete;
  }

  public void setIsComplete(boolean isComplete) {
    this.isComplete = isComplete;
  }

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Column(name = "content")
  private String content;

  @Column(name = "createdDateTime")
  private LocalDateTime createdDateTime;

  @Column(name = "isComplete")
  private boolean isComplete;

  public Todo() {

  }

  public Todo(String content, LocalDateTime createdDateTime, Boolean isComplete) {
    this.content = content;
    this.createdDateTime = createdDateTime;
    this.isComplete = isComplete;
  }

  @Override
  public String toString() {
    return "Todo [id=" + id +
        ", content=" + content +
        ", createdDateTime=" + createdDateTime +
        ", isComplete=" + isComplete + "]";
  }

}