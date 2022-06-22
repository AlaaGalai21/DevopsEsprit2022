package tn.esprit.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.entities.Mission;
import tn.esprit.spring.services.IEmployeService;
import tn.esprit.spring.services.IEntrepriseService;
import tn.esprit.spring.services.IMissionService;
import tn.esprit.spring.services.ITimesheetService;

import java.util.List;
import java.util.Optional;

public class IControllerMission {
    @Autowired
    IMissionService iMissionService;

    public int ajouterMission(Mission mission) {
        iMissionService.add(mission);
        return mission.getId();
    }

    public void deleteMissionById(int MissionID)
    {
        iMissionService.delete(MissionID);
    }
    public Optional<Mission> getMissionById(int MissionID) {

        return iMissionService.getById(MissionID);
    }

    public List<Mission> getAllDMissions() {
        return iMissionService.getAll();
    }


}
