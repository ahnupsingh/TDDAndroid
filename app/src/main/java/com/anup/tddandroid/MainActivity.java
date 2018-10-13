package com.anup.tddandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

import com.anup.tddandroid.DTO.PlantDTO;
import com.anup.tddandroid.Service.IPlantService;
import com.anup.tddandroid.Service.PlantService;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    IPlantService plantService;
    private AutoCompleteTextView actPlantName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        plantService = new PlantService();
        actPlantName = findViewById(R.id.actPlantName);
    }

    public void searchPlants(View v){
        List<PlantDTO> plants = plantService.fetchPlants(actPlantName.getText().toString());

        for(PlantDTO plant: plants){
            Toast.makeText(this,plant.toString(),Toast.LENGTH_LONG).show();
        }
    }
}
