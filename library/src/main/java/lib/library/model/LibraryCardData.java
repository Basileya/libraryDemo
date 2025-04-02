package lib.library.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.boot.registry.selector.spi.StrategyCreator;

import java.util.ArrayList;

import java.util.Date;
import java.util.List;
import java.util.stream.Gatherer;

@Entity
@Data
@EqualsAndHashCode
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "libraryCardData")
public class LibraryCardData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Temporal(TemporalType.DATE)
    @Column(name = "date")
    private Date date;

    @Column(name = "is_delete")
    @ColumnDefault("false")
    private Boolean delete;

//    @ManyToOne
//    private Book book;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "libraryCardData", cascade = CascadeType.ALL)
    private List<Book> books = new ArrayList<>();

    //    @OneToOne(mappedBy = "user")
//    private User user;







//    @OneToOne
//    @JoinColumn(name = "user_id", unique = true)
//    private User user;
//
//    @ManyToOne
//    @JoinColumn(name = "libraryBase_id")
//    private LibraryBase libraryBase;

    //OneToMany

    // у карті має бути посилання на користувача
    // яку книжку взяв
    // на скільки взяв (з - по)
    // кількість книг які взяв
    // String note. (примітки щодо книг, в якому стані).

}
