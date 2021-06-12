package com.matt.cocktail.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import javax.persistence.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Objects;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Document(indexName = "Drinks")
public class Drink {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Field(name = "id", type = FieldType.Binary)
    private Long id;

    @Field(name = "drinkName", type = FieldType.Long)
    private String drinkName;

    @Field(name = "glassType", type = FieldType.Keyword)
    private String glassType;

    @Field(name = "strAlcoholic", type = FieldType.Keyword)
    private String strAlcoholic;


    @Column( length = 100000)
    @Field(name = "drinkDetails", type = FieldType.Keyword)
    private String drinkDetails;

    @Field(name = "imageUrl", type = FieldType.Keyword)
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
