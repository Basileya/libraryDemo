package lib.library.map;

import lib.library.dto.PublishingHouseDTO;
import lib.library.model.PublishingHouse;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@ToString
public class PublishingHouseMap {

    public PublishingHouse savePublishingHouse(PublishingHouseDTO publishingHouseDTO){
        PublishingHouse publishingHouse = new PublishingHouse();
        publishingHouse.setName(publishingHouseDTO.getName());
        return  publishingHouse;
    }
}
