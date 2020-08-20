<%--
- form.jsp
-
- Copyright (c) 2019 Rafael Corchuelo.
-
- In keeping with the traditional purpose of furthering education and research, it is
- the policy of the copyright owner to permit non-commercial use and redistribution of
- this software. It has been tested carefully, but it is not guaranteed for any particular
- purposes.  The copyright owner does not offer any warranties or representations, nor do
- they accept any liabilities with respect to them.
--%>

<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form>
	<acme:form-textbox code="authenticated.inquiries.form.label.title" path="title"/>
	<jstl:if test="${command != 'create' }">
	<acme:form-moment code="authenticated.inquiries.form.label.dateOfCreation" path="dateOfCreation" readonly="true"/>
	</jstl:if>
	<acme:form-moment code="authenticated.inquiries.form.label.deadline" path="deadline"/>
	<acme:form-textarea code="authenticated.inquiries.form.label.description" path="description" />
	<acme:form-money code="authenticated.inquiries.form.label.minMoney" path="minMoney" />
	<acme:form-money code="authenticated.inquiries.form.label.maxMoney" path="maxMoney" />
	<acme:form-textbox code="authenticated.inquiries.form.label.email" path="email"/>

    <acme:form-submit test="${command == 'show'}" code="authenticated.inquiries.form.button.update" action="/authenticated/inquiries/update"/>
    <acme:form-submit test="${command == 'show'}" code="authenticated.inquiries.form.button.delete" action="/authenticated/inquiries/delete"/>
    <acme:form-submit test="${command == 'create'}" code="authenticated.inquiries.form.button.create" action="/authenticated/inquiries/create"/>
    <acme:form-submit test="${command == 'update'}" code="authenticated.inquiries.form.button.update" action="/authenticated/inquiries/update"/>
    <acme:form-submit test="${command == 'delete'}" code="authenticated.inquiries.form.button.delete" action="/authenticated/inquiries/delete"/>

	<acme:form-return code="authenticated.inquiries.form.button.return"/>
</acme:form>
