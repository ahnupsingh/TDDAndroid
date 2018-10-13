package com.anup.tddandroid.Service;

import com.anup.tddandroid.DAO.IPlantDAO;
import com.anup.tddandroid.DAO.PlantDAOStub;
import com.anup.tddandroid.DAO.PlantJsonDao;
import com.anup.tddandroid.DTO.PlantDTO;

import java.util.List;

/**
 * Created by anup on 10/13/18.
 */

public class PlantService implements IPlantService {

    IPlantDAO plantDAO;

    public PlantService(){
        plantDAO = new PlantDAOStub();
    }

    @Override
    public List<PlantDTO> fetchPlants(String filter) {
        return plantDAO.fetchPlants(filter);
    }
}
