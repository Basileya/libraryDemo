package lib.library.dto;

import lib.library.model.Book;
import lib.library.model.PublishingHouse;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BookDTO {

    private String name;
    private String authorName;
    private Integer year;
    private Integer balance;
    private Boolean delete;
    private PublishingHouseDTO publishingHouseDTO;


}
