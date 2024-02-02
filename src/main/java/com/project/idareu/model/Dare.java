package com.project.idareu.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Entity
public class Dare {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private int dareId;
    private String heading;
    private String description;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
