package lib.library.service;

import jakarta.persistence.EntityNotFoundException;
import lib.library.dto.PublishingHouseDTO;
import lib.library.map.PublishingHouseMap;
import lib.library.model.PublishingHouse;
import lib.library.repository.PublishingHouseRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.Optional;

public class PublishingHouseServiceImpl implements PublishingHouseService{

    @Autowired
    PublishingHouseRepository publishingHouseRepository;

    @Autowired
    PublishingHouseMap publishingHouseMap;


    @Override
    public PublishingHouse addPublishingHouse(PublishingHouseDTO publishingHouseDTO) {
        PublishingHouse map = publishingHouseMap.savePublishingHouse(publishingHouseDTO);
        PublishingHouse publishingHouse = publishingHouseRepository.save(map);
        return publishingHouse;
    }

    @Override
    public PublishingHouse updatePublishingHouse(PublishingHouseDTO publishingHouseDTO, Integer id) {
        PublishingHouse map = publishingHouseMap.updatePublishingHouse(publishingHouseDTO, id);
        return publishingHouseRepository.save(map);
    }

    @Override
    public Optional<PublishingHouse> getPublishingHouse(Integer id) {
        return publishingHouseRepository.findById(id);
    }

    @Override
    public void deletePublishingHouse(String name) throws IOException {
        PublishingHouse publishingHouse = publishingHouseRepository.getByName(name);
        if (publishingHouse == null){
             throw new EntityNotFoundException("Видавництва " + name +  " немає в наявності") ;
        }

    }


}
