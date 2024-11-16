package de.egladil.web.multiple_datasources.infrastructure.resources;

import java.util.List;

import de.egladil.web.multiple_datasources.infrastructure.dao.auth.UserDao;
import de.egladil.web.multiple_datasources.infrastructure.dao.mathe.DeskriptorDao;
import de.egladil.web.multiple_datasources.infrastructure.entities.auth.PersistenterUser;
import de.egladil.web.multiple_datasources.infrastructure.entities.mathe.Deskriptor;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

	@Inject
	UserDao userDao;

	@Inject
	DeskriptorDao deskriptorDao;

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String hello() {

		List<PersistenterUser> users = userDao.loadAllUsers();
		List<Deskriptor> deskriptoren = deskriptorDao.loadAll();

		return "Hello. There are " + users.size() + " users and " + deskriptoren.size() + " Deskriptoren";
	}
}
