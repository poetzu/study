package com.example.study.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity // order_detail
@ToString(exclude = {"user","item"})
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // mysql이라서 identity
    private Long id;

    private LocalDateTime orderAt;

    // N : 1
    @ManyToOne
    private User user; // user_id

    // N : 1
    @ManyToOne
    private Item item;
}
