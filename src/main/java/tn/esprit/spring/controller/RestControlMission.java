package tn.esprit.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.entities.Mission;
import tn.esprit.spring.services.IEmployeService;
import tn.esprit.spring.services.IMissionService;

import java.util.List;
import java.util.Optional;

public class RestControlMission {

    @Autowired
    IMissionService imissionservice;

    @PostMapping("/ajouterMission")
    @ResponseBody
    public int ajouterMission(@RequestBody Mission mission) {
        imissionservice.add(mission) ;
        return mission.getId();
    }


    @DeleteMapping("/deleteMissionById/{idmission}")
    @ResponseBody
    public void deleteMissionById(@PathVariable("idmission")int missionId)
    {
        imissionservice.delete(missionId);
    }


    @GetMapping(value = "getMissionById/{idmission}")
    @ResponseBody
    public Optional<Mission> getMissionById(@PathVariable("idmission") int missionId) {

        return imissionservice.getById(missionId);
    }


    @GetMapping(value = "getAllMissions")
    @ResponseBody
    public List<Mission> getAllMissions() {
        return imissionservice.getAll();
    }
}
