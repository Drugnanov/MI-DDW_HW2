<%
  /*
   * Copyright 2016 by SEFIRA, spol. s r. o.
   * http://www.sefira.cz
   * 
   * Created: 14.1.2016
   * Author:  dyntar
   */

/**
 * Záhlaví stránky.
 */
%>

<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%--@elvariable id="sefEnvSettings" type="cz.sefira.supin.svii.gui.web.EnvSettings"--%>

<header class="main-header">
  <%-- Menu lišta --%>
  <nav class="navbar navbar-default navbar-static-top" style="background-color: #009FE3">
    <div class="container-fluid">
      <div>
        <ul class="nav navbar-nav">
          <%-- Sekce menu Reporty --%>
          <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
               aria-expanded="true">
              <spring:message code="common.menu.dataMining"/> <span class="caret"></span>
            </a>
            <ul class="dropdown-menu">
              <li>
                <a href="<spring:url value="/assocRulesData/detail"/>">
                  <spring:message code="common.menu.dataMining.data"/>
                </a>
              </li>
              <li>
                <a href="<spring:url value="/asocRules/list"/>">
                  <spring:message code="common.menu.dataMining.associativeRules"/>
                </a>
              </li>
            </ul>
          </li>
        </ul>
      </div>
    </div>
  </nav>
</header>
