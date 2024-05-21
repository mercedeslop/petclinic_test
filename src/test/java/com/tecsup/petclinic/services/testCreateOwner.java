package com.tecsup.petclinic.services;

import org.junit.jupiter.api.Test;

@Test
public void testCreateOwner() {
    String OWNER_NAME = "Mario";
    String OWNER_LASTNAME = "Ventosilla";
    Owner owner = new Owner(OWNER_NAME, OWNER_LASTNAME, null, null, null);
    Owner ownerCreated = this.ownerService.create(owner);
    log.info("OWNER CREATED: " + ownerCreated.toString());
    assertNotNull(ownerCreated.getId());
    assertEquals(OWNER_NAME, ownerCreated.getFirst_name());
    assertEquals(OWNER_LASTNAME, ownerCreated.getLast_name());
}
