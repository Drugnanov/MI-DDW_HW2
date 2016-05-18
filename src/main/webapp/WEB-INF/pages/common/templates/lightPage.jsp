<%
  /*
   * Copyright 2016 by SEFIRA, spol. s r. o.
   * http://www.sefira.cz
   * 
   * Created: 2.3.2016
   * Author:  dyntar
   */

/**
 * Definice šablony přihlašovací stránky.
 */
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>

<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="tilesx" uri="http://tiles.apache.org/tags-tiles-extras" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<tilesx:useAttribute name="title" classname="java.lang.String"/>

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
</head>
<body>
  <%-- Obsah stránky --%>
  <section class="container">
    <section class="row" style="padding-top: 60px;">
      <tiles:insertAttribute name="content"/>
    </section>
  </section>
  <tiles:insertAttribute name="footer"/>
</body>
</html>
