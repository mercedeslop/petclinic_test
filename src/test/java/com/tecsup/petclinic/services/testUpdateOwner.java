package com.tecsup.petclinic.services;

@Test
public void testUpdateOwner() {
    String OWNER_NAME = "Fernanda";
    String OWNER_LASTNAME = "Villo";
    String UP_OWNER_NAME = "Fernando";
    String UP_OWNER_LASTNAME = "Villa";
    Owner owner = new Owner(OWNER_NAME, OWNER_LASTNAME, null, null, null);

    // Create
    log.info(">" + owner);
    Owner ownerCreated = this.ownerService.create(owner);
    log.info(">>" + ownerCreated);

    // Update
    // Prepare data for update
    ownerCreated.setFirst_name(UP_OWNER_NAME);
    ownerCreated.setLast_name(UP_OWNER_LASTNAME);

    // Execute update
    Owner upgradedOwner = this.ownerService.update(ownerCreated);
    log.info(">>>>" + upgradedOwner);

    // Verify
    assertEquals(UP_OWNER_NAME, upgradedOwner.getFirst_name());
    assertEquals(UP_OWNER_LASTNAME, upgradedOwner.getLast_name());
}
