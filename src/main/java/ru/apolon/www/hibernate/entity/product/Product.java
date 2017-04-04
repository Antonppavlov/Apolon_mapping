package ru.apolon.www.hibernate.entity.product;

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
@Table(name = "product", schema = "apolon")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "product_name_id")
    private int productNameId;

    @Column(name = "product_type_id")
    private int productTypeId;

    @Column(name = "product_data_id")
    private int productDataId;

//    @OneToOne
//    @JoinColumn
//    private ProductName productName;
//
//    @ManyToOne
//    @JoinColumn
//    private ProductType productType;
//
//    @OneToOne
//    @JoinColumn
//    private ProductData productData;


}
