package com.tecsup.petclinic.services;

import com.tecsup.petclinic.entities.Owner;
import com.tecsup.petclinic.exception.OwnerNotFoundException;
import com.tecsup.petclinic.repositories.OwnerRepository;

import java.util.Optional;

public class OwnerService {

    private final OwnerRepository ownerRepository;

    public OwnerService(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    public Owner create(Owner owner) {
        // Implementación para crear un propietario
        return ownerRepository.save(owner);
    }

    public Owner update(Owner owner) {
        // Implementación para actualizar un propietario
        return ownerRepository.save(owner);
    }

    public void delete(Integer id) throws OwnerNotFoundException {
        Optional<Owner> ownerOptional = ownerRepository.findById(id);
        if (ownerOptional.isPresent()) {
            ownerRepository.delete(ownerOptional.get());
        } else {
            throw new OwnerNotFoundException("Owner not found with id: " + id);
        }
    }

    public Owner findById(Integer id) throws OwnerNotFoundException {
        Optional<Owner> owner = ownerRepository.findById(id);

        if (!owner.isPresent()) {
            throw new OwnerNotFoundException("Owner not found with id: " + id);
        }

        return owner.get();
    }
}
