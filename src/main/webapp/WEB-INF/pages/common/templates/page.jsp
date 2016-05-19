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
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<tilesx:useAttribute name="title" classname="java.lang.String"/>
<tilesx:useAttribute name="content" ignore="true"/>

<c:catch var="e"><spring:message code="${title}" var="title"/></c:catch>

<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
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
  <script type="text/javascript" src="<spring:url value="/static/common/js/main.js"/>"></script>
</head>
<body>
  <tiles:insertAttribute name="header"/>
  <%-- Obsah stránky --%>
  <div class="container-fluid">
    <section class="container-fluid override-bootstrap-padding">
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
