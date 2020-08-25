/*
 *
 * Copyright (c) 2019 Rafael Corchuelo.
 *
 * In keeping with the traditional purpose of furthering education and research, it is
 * the policy of the copyright owner to permit non-commercial use and redistribution of
 * this software. It has been tested carefully, but it is not guaranteed for any particular
 * purposes.  The copyright owner does not offer any warranties or representations, nor do
 * they accept any liabilities with respect to them.
 */

package acme.features.entrepreneur.application;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.application.Application;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface EntrepreneurApplicationRepository extends AbstractRepository {

	@Query("select ap from Application ap where ap.investment.entrepreneur.id = ?1 group by ap.ticker order by ap.ticker desc")
	Collection<Application> findManyApplicationByEntrepreneurId(Integer entrepreneurId);
	
	@Query("select ap from Application ap where ap.id = ?1")
	Application findOne(Integer id);


}
