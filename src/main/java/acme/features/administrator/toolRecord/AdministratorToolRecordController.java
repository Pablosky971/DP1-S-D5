/*
 * AnonymousUserAccountController.java
 *
 * Copyright (c) 2019 Rafael Corchuelo.
 *
 * In keeping with the traditional purpose of furthering education and research, it is
 * the policy of the copyright owner to permit non-commercial use and redistribution of
 * this software. It has been tested carefully, but it is not guaranteed for any particular
 * purposes. The copyright owner does not offer any warranties or representations, nor do
 * they accept any liabilities with respect to them.
 */

package acme.features.administrator.toolRecord;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.entities.notice.Notice;
import acme.entities.overture.Overture;
import acme.entities.toolRecord.ToolRecord;
import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;
import acme.framework.entities.Administrator;
import acme.framework.entities.Anonymous;
import acme.framework.entities.Authenticated;

@Controller
@RequestMapping("/administrator/tool-record/")
public class AdministratorToolRecordController extends AbstractController<Administrator, ToolRecord> {

	// Internal state ---------------------------------------------------------

	@Autowired
	private AdministratorToolRecordListService listService;
	
	@Autowired
	private AdministratorToolRecordShowService showService;
	
	@Autowired
	private AdministratorToolRecordCreateService createService;
	
	@Autowired
	private AdministratorToolRecordDeleteService deleteService;

	@Autowired
	private AdministratorToolRecordUpdateService updateService;


	// Constructors -----------------------------------------------------------

	@PostConstruct
	private void initialise() {
		super.addBasicCommand(BasicCommand.LIST, this.listService);
		super.addBasicCommand(BasicCommand.SHOW, this.showService);
		super.addBasicCommand(BasicCommand.CREATE, this.createService);
		super.addBasicCommand(BasicCommand.DELETE, this.deleteService);
		super.addBasicCommand(BasicCommand.UPDATE, this.updateService);
	}

}
