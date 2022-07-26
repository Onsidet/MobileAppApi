package com.dinsaren.bbuappserver.models;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "bbu_category")
@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String nameKh;
    private String noted;
    private String status;
}
