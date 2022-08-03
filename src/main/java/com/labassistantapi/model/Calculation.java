package com.labassistantapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "calculation")
public class Calculation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String title;
    private Integer userId;

    public Calculation() {
    }

    public Calculation(Integer id, String title, Integer userId) {
        this.id = id;
        this.title = title;
        this.userId = userId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Calculation that = (Calculation) o;
        return Objects.equals(id, that.id) && Objects.equals(title, that.title) && Objects.equals(userId, that.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, userId);
    }

    @Override
    public String toString() {
        return "Calculation{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", userId=" + userId +
                '}';
    }
}
