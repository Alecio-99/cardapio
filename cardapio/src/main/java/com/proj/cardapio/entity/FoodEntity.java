package com.proj.cardapio.entity;

import com.proj.cardapio.DTO.FoodResquestDTO;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "cardapio")
@Entity(name = "cardapio")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class FoodEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String image;
    private Integer price;

    public FoodEntity(FoodResquestDTO data) {
        this.image = data.image();
        this.price = data.price();
        this.title = data.title();

    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public Integer getPrice() {
        return price;

    }
}
