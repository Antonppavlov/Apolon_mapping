package ru.apolon.www.hibernate.entity.food;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@DynamicUpdate
@DynamicInsert
@Table(name = "food", schema = "apolon")
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "food_name_id")
    private int foodNameId;

    @Column(name = "food_type_id")
    private Integer foodTypeId;

    @Column(name = "food_subtype_id")
    private Integer foodSubtypeId;

    @Column(name = "food_products_id")
    private Integer foodProductsId;

    @Column(name = "food_recipe_id")
    private Integer foodRecipeId;

}
