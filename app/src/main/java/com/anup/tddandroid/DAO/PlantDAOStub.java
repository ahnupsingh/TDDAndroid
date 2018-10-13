package com.anup.tddandroid.DAO;

import com.anup.tddandroid.DTO.FlowerDTO;
import com.anup.tddandroid.DTO.PlantDTO;
import com.anup.tddandroid.DTO.TreeDTO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by anup on 10/13/18.
 */

public class PlantDAOStub implements IPlantDAO {
    @Override
    public List<PlantDTO> fetchPlants(String filter) {
        List<PlantDTO> allPlants = new ArrayList<PlantDTO>();
        TreeDTO plant = new TreeDTO();
        plant.setGenus("Cercis");
        plant.setSpecies("canadensis");
        plant.setCommon("Eastern Redbud");
        plant.setSize(30);
        plant.setFallColor("Yellowish");
        plant.setType("Tree");
        allPlants.add(plant);

        FlowerDTO flower = new FlowerDTO();
        flower.setGenus("Tropoleum");
        flower.setSpecies("spp");
        flower.setCommon("Nasturtium");
        flower.setType("flower");
        allPlants.add(flower);

        return allPlants;
    }
}
