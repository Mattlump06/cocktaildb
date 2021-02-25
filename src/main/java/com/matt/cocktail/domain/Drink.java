package com.matt.cocktail.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Objects;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Drink {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String drinkName;
    private String glassType;
    private String strAlcoholic;


    @Column( length = 100000)
    private String drinkDetails;
    private String imageUrl;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Drink drink = (Drink) o;
        return Objects.equals(id, drink.id) && Objects.equals(drinkName, drink.drinkName) && Objects.equals(glassType, drink.glassType) && Objects.equals(strAlcoholic, drink.strAlcoholic) && Objects.equals(drinkDetails, drink.drinkDetails) && Objects.equals(imageUrl, drink.imageUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, drinkName, glassType, strAlcoholic, drinkDetails, imageUrl);
    }

    @Override
    public String toString() {
        return "Drink{" +
                "id=" + id +
                ", drinkName='" + drinkName + '\'' +
                ", glassType='" + glassType + '\'' +
                ", strAlcoholic='" + strAlcoholic + '\'' +
                ", drinkDetails='" + drinkDetails + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
