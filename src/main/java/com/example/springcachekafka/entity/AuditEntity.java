package com.example.springcachekafka.entity;

import java.time.LocalDateTime;
import java.time.ZoneId;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@MappedSuperclass
@EntityListeners(value = {AuditingEntityListener.class})
public class AuditEntity {

  @CreatedDate
  private LocalDateTime created;

  @CreatedBy
  private String creator;

  @LastModifiedDate
  private LocalDateTime updated;

  @LastModifiedBy
  private String updater;

  public LocalDateTime getCreated() {
    return created;
  }

  public void setCreated(LocalDateTime created) {
    this.created = created;
  }

  public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }

  public LocalDateTime getUpdated() {
    return updated;
  }

  public void setUpdated(LocalDateTime updated) {
    this.updated = updated;
  }

  public String getUpdater() {
    return updater;
  }

  public void setUpdater(String updater) {
    this.updater = updater;
  }

  @PrePersist
  public void created() {
    LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("UTC"));
    this.created = localDateTime;
    this.updated = localDateTime;
  }

  @PreUpdate
  public void updated() {
    this.updated = LocalDateTime.now(ZoneId.of("UTC"));
  }
}
