package com.smartentry.backend.services;

import com.smartentry.backend.domain.*;
import com.smartentry.backend.domain.dto.CorrespondenceDTO;
import com.smartentry.backend.domain.dto.DwellerDTO;
import com.smartentry.backend.repositories.CorrespondenceRepository;
import com.smartentry.backend.repositories.DwellerRepository;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Service
public class DwellerService {

    @Autowired
    private DwellerRepository repository;

    @Autowired
    private ResidenceService dwellerService;

    @Autowired
    private ContactDwellerService contactDwellerService;

    @Transactional(readOnly = true)
    public List<Dweller> findAll() {
        return repository.findAll();
    }

    @Transactional(readOnly = true)
    public Dweller findById(Integer id) {
        Optional<Dweller> result = repository.findById(id);
        return result.orElseThrow();
    }

    public Dweller insert(DwellerDTO obj) {
        return fromDto(obj);
    }

    private Dweller fromDto(DwellerDTO obj) {
        Dweller newObj = new Dweller();
        newObj.setId(obj.getId());
        newObj.setNome(obj.getNome());
        newObj.setCpf(obj.getCpf());
        newObj.setRg(obj.getRg());
        newObj.setStatus(obj.getStatus());

        Residence residence = dwellerService.findById(obj.getResidence());

        ContactDweller contactDweller = contactDwellerService.findById(obj.getContactDweller());

        newObj.setResidence(residence);
        newObj.setContactDweller(contactDweller);

        return repository.save(newObj);

    }
}