// =====================================================
// Project: multiple-datasources
// (c) Heike Winkelvoß
// =====================================================
package de.egladil.web.multiple_datasources.infrastructure.entities.mathe;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

/**
 * Deskriptor
 */
@Entity
@Table(name = "DESKRIPTOREN")
@NamedQueries({
	@NamedQuery(name = Deskriptor.LIST_ALL, query = "select d from Deskriptor d order by d.id")
})
public class Deskriptor {

	public static final String LIST_ALL = "Deskriptor.LIST_ALL";

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;

	@Column(name = "NAME")
	public String name;

	@Column(name = "ADMIN")
	public boolean admin;

	/**
	 *
	 */
	public Deskriptor() {

		super();
	}

	/**
	 * @param name
	 *                  String
	 * @param adminOnly
	 *                  boolean
	 */
	public Deskriptor(final String name, final boolean adminOnly) {

		this.name = name;
		this.admin = adminOnly;
	}

	@Override
	public String toString() {

		return "Deskriptor [id=" + id + ", name=" + name + ", admin=" + admin + "]";
	}

}
