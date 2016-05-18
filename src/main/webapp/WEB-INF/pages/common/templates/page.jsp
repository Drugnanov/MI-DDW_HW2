<%
  /*
   * Copyright 2016 by SEFIRA, spol. s r. o.
   * http://www.sefira.cz
   * 
   * Created: 14.1.2016
   * Author:  dyntar
   */

/**
 * Definice šablony stránky.
 */
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>

<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="tilesx" uri="http://tiles.apache.org/tags-tiles-extras" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sefira" tagdir="/WEB-INF/tags" %>

<%--@elvariable id="breadcrumbs" type="java.util.List"--%>
<%--@elvariable id="messages" type="java.util.List"--%>

<tilesx:useAttribute name="title" classname="java.lang.String"/>
<tilesx:useAttribute name="content" ignore="true"/>

<c:catch var="e"><spring:message code="${title}" var="title"/></c:catch>

<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
  <security:csrfMetaTags/>
  <link rel="icon" href="<spring:url value="/static/common/images/favicon.ico"/>" type="image/x-icon">
  <link rel="shortcut icon" href="<spring:url value="/static/common/images/favicon.ico"/>" type="image/x-icon">
  <title><spring:message code="common.application.title"/> - ${title}</title>
  <%-- jQuery (https://jquery.com/) --%>
  <script type="text/javascript" src="<spring:url value="/webjarslocator/jquery/jquery.min.js"/>"></script>
  <%-- Bootstrap (http://getbootstrap.com/) --%>
  <script type="text/javascript" src="<spring:url value="/webjarslocator/bootstrap/js/bootstrap.min.js"/>"></script>
  <link rel="stylesheet" type="text/css" href="<spring:url value="/static/common/css/bootstrap.min.css"/>"/>
  <%-- DataTables (https://www.datatables.net/) --%>
  <script type="text/javascript"
          src="<spring:url value="/webjarslocator/datatables/js/jquery.dataTables.min.js"/>"></script>
  <script type="text/javascript"
          src="<spring:url value="/webjarslocator/datatables/js/dataTables.bootstrap.min.js"/>"></script>
  <%-- CSS pro datatable v bootstrap není součástí org.webjars.org.webjars 1.10.10, proto staženo a importováno lokálně --%>
  <link rel="stylesheet" type="text/css"
        href="<spring:url value="/static/datatables/css/dataTables.bootstrap.min.css"/>"/>
  <%-- Moment.js (http://momentjs.com/) --%>
  <script type="text/javascript"
          src="<spring:url value="/webjarslocator/momentjs/min/moment-with-locales.min.js"/>"></script>
  <%-- Bootstrap 3 Date/Time Picker (http://eonasdan.github.io/bootstrap-datetimepicker/) --%>
  <script type="text/javascript"
          src="<spring:url value="/webjarslocator/Eonasdan-bootstrap-datetimepicker/js/bootstrap-datetimepicker.min.js"/>"></script>
  <link rel="stylesheet" type="text/css"
        href="<spring:url value="/webjarslocator/Eonasdan-bootstrap-datetimepicker/css/bootstrap-datetimepicker.min.css"/>"/>
  <%-- Bootstrap Multiselect (http://davidstutz.github.io/bootstrap-multiselect/) --%>
  <script type="text/javascript" src="<spring:url value="/static/common/js/bootstrap-multiselect.js"/>"></script>
  <%-- SVIPO2 JS --%>
  <script type="text/javascript">
    var resourceBundle = new Map();
    resourceBundle.set('dataTables', {
      processing: '<spring:message code="common.dataTables.message.processing"/>',
      info: '<spring:message code="common.dataTables.message.info"/>',
      lengthMenu: '<spring:message code="common.dataTables.message.lengthMenu"/>',
      infoEmpty: '<spring:message code="common.dataTables.message.infoEmpty"/>',
      emptyTable: '<spring:message code="common.dataTables.message.zeroRecords"/>',
      paginate: {
        first: '<spring:message code="common.dataTables.nav.first"/>',
        previous: '<spring:message code="common.dataTables.nav.previous"/>',
        next: '<spring:message code="common.dataTables.nav.next"/>',
        last: '<spring:message code="common.dataTables.nav.last"/>'
      }
    });
    resourceBundle.set('multiselect', {
      nonSelectedText: '<spring:message code="common.multiselect.nonSelectedText"/>',
      allSelectedText: '<spring:message code="common.multiselect.allSelectedText"/>',
      nSelectedText: '<spring:message code="common.multiselect.nSelectedText"/>',
      selectAllText: '<spring:message code="common.multiselect.selectAllText"/>',
      filterPlaceholder: '<spring:message code="common.multiselect.filterPlaceholder"/>'
    });
  </script>
  <script type="text/javascript" src="<spring:url value="/static/common/js/main.js"/>"></script>
</head>
<body>
  <tiles:insertAttribute name="header"/>
  <%-- Obsah stránky --%>
  <div class="container-fluid">
    <section class="container-fluid override-bootstrap-padding">
      <%-- Drobečková navigace --%>
      <section class="row">
        <c:if test="${!empty breadcrumbs.breadcruCrumbs}">
          <ol class="breadcrumb">
            <c:forEach items="${breadcrumbs.breadcruCrumbs}" var="breadcrumb" varStatus="breadcrumbStatus">
              <li class="<c:if test='${breadcrumbStatus.last}'>active</c:if>">
                <c:if test="${not breadcrumbStatus.last && not empty breadcrumb.baseURL}">
                <spring:url value="${breadcrumb.baseURL}" var="crumbURL" htmlEscape="true"/>
                <a href="${crumbURL}">
                  </c:if>
                  <c:if test="${not empty breadcrumb.icon}"><i class="<spring:message code='${breadcrumb.icon}'/>"></i></c:if>
                  <spring:message code="${breadcrumb.messageProperty}" arguments="${breadcrumb.messageParams}"/>
                  <c:if test="${not breadcrumbStatus.last && not empty breadcrumb.baseURL}">
                </a>
                </c:if>
              </li>
            </c:forEach>
          </ol>
        </c:if>
      </section>
      <%-- Informační zprávy --%>
      <%-- TODO - messages mají být také v <section></section> --%>
      <sefira:messages messages="${messages}"/>
      <c:if test="${not empty content}">
        <section class="row">
          <c:forEach var="item" items="${content}">
            <tiles:insertTemplate template="${item}"/>
          </c:forEach>
        </section>
      </c:if>
    </section>
  </div>
  <tiles:insertAttribute name="footer"/>
</body>
</html>
