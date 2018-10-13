package com.anup.tddandroid.DAO;

import com.anup.tddandroid.DTO.PlantDTO;

import java.util.List;

/**
 * A collection of methods to access plant data.
 * Created by anup on 10/13/18.
 */

public interface IPlantDAO {

    /**
     * Accept filter, text and return a collection of plants that contain that filter text
     * @param filter the text we want to match in our returned list of plants.
     * @return a list of plants that contain given filter text in either genus, species, cultivar or common name.
     */
    public List<PlantDTO> fetchPlants(String filter);


}
