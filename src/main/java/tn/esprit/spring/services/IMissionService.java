package tn.esprit.spring.services;

import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.entities.Mission;

import java.util.List;
import java.util.Optional;

public interface IMissionService {
    public int add(Mission mission);
    public Mission update(Mission mission);
    void delete(int missionId);
    Optional<Mission> getById(int missionId);
    public List<Mission> getAll();

}
