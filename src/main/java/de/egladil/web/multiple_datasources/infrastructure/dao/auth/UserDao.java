// =====================================================
// Project: multiple-datasources
// (c) Heike Winkelvoß
// =====================================================
package de.egladil.web.multiple_datasources.infrastructure.dao.auth;

import java.util.List;

import de.egladil.web.multiple_datasources.infrastructure.entities.auth.PersistenterUser;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceUnit;

/**
 * UserDao
 */
@RequestScoped
public class UserDao {

	@Inject
	@PersistenceUnit(unitName = "auth")
	EntityManager entityManager;

	/**
	 * @return
	 */
	public List<PersistenterUser> loadAllUsers() {

		return entityManager.createNamedQuery(PersistenterUser.FIND_BY_UUID_LIKE, PersistenterUser.class)
			.setParameter("uuid", "a%").getResultList();
	}

}
