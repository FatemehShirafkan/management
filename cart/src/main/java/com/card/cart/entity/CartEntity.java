package com.card.cart.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_cart")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class CartEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "fk_pdt")
    private Long productId;
    @Column(name = "count")
    private Integer count;
    @Column(name = "fk_use")
    private Long userId;

}
