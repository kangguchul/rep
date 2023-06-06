package com.example.test13;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import jakarta.persistence.*; //spring 3.0.5
//import javax.persistence.*;   //spring 2.5.1


@Entity
@Table(name="itemaaa")
@Getter
@Setter
@ToString
public class ett {
    @Id
    @Column(name="item_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, length = 50)
    private String itemNm; //상품명

}
