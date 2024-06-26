package com.tecsup.petclinic.services;

import org.junit.jupiter.api.Test;

@Test
public void testUpdateOwner() {
    String OWNER_NAME = "Paolo";
    String OWNER_LASTNAME = "Guerrero";
    String UP_OWNER_NAME = "José";
    String UP_OWNER_LASTNAME = "Miranda";
    Owner owner = new Owner(OWNER_NAME, OWNER_LASTNAME, null, null, null);

    // Create
    log.info(">" + owner);
    Owner ownerCreated = this.ownerService.create(owner);
    log.info(">>" + ownerCreated);

    //Actualizar
    ownerCreated.setFirst_name(UP_OWNER_NAME);
    ownerCreated.setLast_name(UP_OWNER_LASTNAME);

    //Ejecutar actualización
    Owner upgradedOwner = this.ownerService.update(ownerCreated);
    log.info(">>>>" + upgradedOwner);

    //Verificar
    assertEquals(UP_OWNER_NAME, upgradedOwner.getFirst_name());
    assertEquals(UP_OWNER_LASTNAME, upgradedOwner.getLast_name());
}
