package lib.library.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "publishingHouse")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class PublishingHouse {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "id")
    private Integer id;

    @Column(name = "publishing_house")
    private String publishingHouse;

    @Column(name = "is_delete")
    @ColumnDefault("false")
    private Boolean delete;

    @OneToMany(mappedBy = "publishingHouse", cascade = CascadeType.ALL)
    private List<Book> books = new ArrayList<>();

//    @Column(name = "book_id")
//    private Integer book_id;
//    @OneToMany(mappedBy = "publishingHouse", cascade = CascadeType.ALL)
//    private List<Book> books = new ArrayList<>();

}
