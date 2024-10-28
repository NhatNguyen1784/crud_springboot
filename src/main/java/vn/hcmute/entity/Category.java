package vn.hcmute.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Categories")
public class Category implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryid;
    @Column(name = "category_name", length = 200, columnDefinition = "nvarchar(200) not null")
    private String categoryname;
    @Column(name = "category_image")
    private String image;
//
//    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
//    private Set<Product> products;

}
