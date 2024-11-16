// =====================================================
// Project: multiple-datasources
// (c) Heike Winkelvoß
// =====================================================
package de.egladil.web.multiple_datasources.infrastructure.dao.mathe;

import java.util.List;

import de.egladil.web.multiple_datasources.infrastructure.entities.mathe.Deskriptor;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceUnit;

/**
 * DeskriptorDao
 */
@RequestScoped
public class DeskriptorDao {

	@Inject
	@PersistenceUnit(unitName = "mathe")
	EntityManager entityManager;

	public List<Deskriptor> loadAll() {

		return entityManager.createNamedQuery(Deskriptor.LIST_ALL, Deskriptor.class).getResultList();

	}

}
