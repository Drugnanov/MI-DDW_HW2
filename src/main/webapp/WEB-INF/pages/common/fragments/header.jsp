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
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%--@elvariable id="sefEnvSettings" type="cz.sefira.supin.svii.gui.web.EnvSettings"--%>

<header class="main-header">
  <%-- Menu lišta --%>
  <nav class="navbar navbar-default navbar-static-top" style="background-color: ${sefEnvSettings.colorCode}">
    <div class="container-fluid">
      <%-- Logo --%>
      <div class="navbar-header">
        <a href="<spring:url value="/"/>" class="logo">
          <img src="<spring:url value="/static/common/images/logo_${sefEnvSettings.identifier}.gif"/>">
        </a>
      </div>
      <div>
        <ul class="nav navbar-nav">
          <%-- Sekce menu Reporty --%>
          <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
               aria-expanded="true">
              <spring:message code="common.menu.reports"/> <span class="caret"></span>
            </a>
            <ul class="dropdown-menu">
              <li class="disabled">
                <a href="<spring:url value="#"/>">
                  <spring:message code="common.menu.reports.dataReports"/>
                </a>
              </li>
              <li class="divider" role="separator"></li>
              <li class="disabled">
                <a href="<spring:url value="#"/>">
                  <spring:message code="common.menu.reports.dataReportsPCR"/>
                </a>
              </li>
              <li class="disabled">
                <a href="<spring:url value="#"/>">
                  <spring:message code="common.menu.reports.dataReportsZOOU"/>
                </a>
              </li>
            </ul>
          </li>
          <%-- Sekce menu Monitorování --%>
          <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
               aria-expanded="true">
              <spring:message code="common.menu.monitoring"/> <span class="caret"></span>
            </a>
            <ul class="dropdown-menu">
              <security:authorize access="hasRole('WS_REQUESTS')" var="hasAccess"/>
              <spring:url value="/wsRequests/list" var="wsRequestsURL" htmlEscape="true">
                <spring:param name="eraseLocalStorage" value="true"/>
              </spring:url>
              <li class="<c:if test="${!hasAccess}">disabled</c:if>">
                <a <c:if test="${hasAccess}">href="${wsRequestsURL}"</c:if>>
                  <spring:message code="common.menu.monitoring.wsRequests"/>
                </a>
              </li>
              <security:authorize access="hasRole('CORE_PROCESSES')" var="hasAccess"/>
              <spring:url value="/coreProcesses/list" var="coreProcesses" htmlEscape="true">
                <spring:param name="eraseLocalStorage" value="true"/>
              </spring:url>
              <li class="<c:if test="${!hasAccess}">disabled</c:if>">
                <a <c:if test="${hasAccess}">href="${coreProcesses}"</c:if>>
                  <spring:message code="common.menu.monitoring.coreProcesses"/>
                </a>
              </li>
              <security:authorize access="hasRole('SYS_REST_LOGS')" var="hasAccess"/>
              <spring:url value="/sysRestLogs/list" var="sysRestLogsURL" htmlEscape="true">
                <spring:param name="eraseLocalStorage" value="true"/>
              </spring:url>
              <li class="<c:if test="${!hasAccess}">disabled</c:if>">
                <a <c:if test="${hasAccess}">href="${sysRestLogsURL}"</c:if>>
                  <spring:message code="common.menu.monitoring.sysRestLogs"/>
                </a>
              </li>
              <security:authorize access="hasRole('SYS_ERROR_LOGS')" var="hasAccess"/>
              <spring:url value="/sysErrorLogs/list" var="sysErrorLogsURL" htmlEscape="true">
                <spring:param name="eraseLocalStorage" value="true"/>
              </spring:url>
              <li class="<c:if test="${!hasAccess}">disabled</c:if>">
                <a <c:if test="${hasAccess}">href="${sysErrorLogsURL}"</c:if>>
                  <spring:message code="common.menu.monitoring.sysErrorLogs"/>
                </a>
              </li>
              <li class="divider" role="separator"></li>
              <security:authorize access="hasRole('CORE_AUDIT_LOGS')" var="hasAccess"/>
              <spring:url value="/coreAuditLogs/list" var="coreAuditLogsURL" htmlEscape="true">
                <spring:param name="eraseLocalStorage" value="true"/>
              </spring:url>
              <li class="<c:if test="${!hasAccess}">disabled</c:if>">
                <a <c:if test="${hasAccess}">href="${coreAuditLogsURL}"</c:if>>
                  <spring:message code="common.menu.monitoring.coreAuditLogs"/>
                </a>
              </li>
            </ul>
          </li>
          <%-- Sekce menu Konfigurace --%>
          <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
               aria-expanded="true">
              <spring:message code="common.menu.configuration"/> <span class="caret"></span>
            </a>
            <ul class="dropdown-menu">
              <security:authorize access="hasRole('CORE_INTERAKCE')" var="hasAccess"/>
              <spring:url value="/coreInterakce/list" var="coreInterakceURL" htmlEscape="true">
                <spring:param name="eraseLocalStorage" value="true"/>
              </spring:url>
              <li class="<c:if test="${!hasAccess}">disabled</c:if>">
                <a <c:if test="${hasAccess}">href="${coreInterakceURL}"</c:if>>
                  <spring:message code="common.menu.configuration.coreInterakce"/>
                </a>
              </li>
              <li class="divider" role="separator"></li>
              <security:authorize access="hasRole('CORE_SUBJECTS')" var="hasAccess"/>
              <spring:url value="/coreSubjects/list" var="coreSubjectsURL" htmlEscape="true">
                <spring:param name="eraseLocalStorage" value="true"/>
              </spring:url>
              <li class="<c:if test="${!hasAccess}">disabled</c:if>">
                <a <c:if test="${hasAccess}">href="${coreSubjectsURL}"</c:if>>
                  <spring:message code="common.menu.configuration.coreSubjects"/>
                </a>
              </li>
              <security:authorize access="hasRole('CORE_MIGRACE_KMENE')" var="hasAccess"/>
              <spring:url value="/coreMigraceKmene/list" var="coreMigraceKmeneURL" htmlEscape="true">
                <spring:param name="eraseLocalStorage" value="true"/>
              </spring:url>
              <li class="<c:if test="${!hasAccess}">disabled</c:if>">
                <a <c:if test="${hasAccess}">href="${coreMigraceKmeneURL}"</c:if>>
                  <spring:message code="common.menu.configuration.coreMigraceKmene"/>
                </a>
              </li>
              <li class="divider" role="separator"></li>
              <security:authorize access="hasRole('WS_CONFIG')" var="hasAccess"/>
              <spring:url value="/wsConfig/detail" var="wsConfigURL" htmlEscape="true">
                <spring:param name="eraseLocalStorage" value="true"/>
              </spring:url>
              <li class="<c:if test="${!hasAccess}">disabled</c:if>">
                <a <c:if test="${hasAccess}">href="${wsConfigURL}"</c:if>>
                  <spring:message code="common.menu.configuration.wsConfig"/>
                </a>
              </li>
              <security:authorize access="hasRole('IO_FILTER_CFGS')" var="hasAccess"/>
              <spring:url value="/ioFilterCfgs/input/list" var="ioFilterCfgsInputURL" htmlEscape="true">
                <spring:param name="eraseLocalStorage" value="true"/>
              </spring:url>
              <li class="<c:if test="${!hasAccess}">disabled</c:if>">
                <a <c:if test="${hasAccess}">href="${ioFilterCfgsInputURL}"</c:if>>
                  <spring:message code="common.menu.configuration.ioFilterCfgs.input"/>
                </a>
              </li>
              <security:authorize access="hasRole('IO_VALIDATION_CFGS')" var="hasAccess"/>
              <spring:url value="/ioValidationCfgs/list" var="ioValidationCfgsURL" htmlEscape="true">
                <spring:param name="eraseLocalStorage" value="true"/>
              </spring:url>
              <li class="<c:if test="${!hasAccess}">disabled</c:if>">
                <a <c:if test="${hasAccess}">href="${ioValidationCfgsURL}"</c:if>>
                  <spring:message code="common.menu.configuration.ioValidationCfgs"/>
                </a>
              </li>
              <security:authorize access="hasRole('IO_FILTER_CFGS')" var="hasAccess"/>
              <spring:url value="/ioFilterCfgs/output/list" var="ioFilterCfgsOutputURL" htmlEscape="true">
                <spring:param name="eraseLocalStorage" value="true"/>
              </spring:url>
              <li class="<c:if test="${!hasAccess}">disabled</c:if>">
                <a <c:if test="${hasAccess}">href="${ioFilterCfgsOutputURL}"</c:if>>
                  <spring:message code="common.menu.configuration.ioFilterCfgs.output"/>
                </a>
              </li>
            </ul>
          </li>
          <%-- Sekce menu Systém --%>
          <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
               aria-expanded="true">
              <spring:message code="common.menu.system"/> <span class="caret"></span>
            </a>
            <ul class="dropdown-menu">
              <security:authorize access="hasRole('CORE_CISELNIKY')" var="hasAccess"/>
              <spring:url value="/coreCiselniky/list" var="coreCiselnikyURL" htmlEscape="true">
                <spring:param name="eraseLocalStorage" value="true"/>
              </spring:url>
              <li class="<c:if test="${!hasAccess}">disabled</c:if>">
                <a <c:if test="${hasAccess}">href="${coreCiselnikyURL}"</c:if>>
                  <spring:message code="common.menu.system.coreCiselniky"/>
                </a>
              </li>
              <security:authorize access="hasRole('WS_OPERATIONS')" var="hasAccess"/>
              <spring:url value="/wsOperations/list" var="wsOperationsURL" htmlEscape="true">
                <spring:param name="eraseLocalStorage" value="true"/>
              </spring:url>
              <li class="<c:if test="${!hasAccess}">disabled</c:if>">
                <a <c:if test="${hasAccess}">href="${wsOperationsURL}"</c:if>>
                  <spring:message code="common.menu.system.wsOperations"/>
                </a>
              </li>
              <security:authorize access="hasRole('IO_VALIDATIONS')" var="hasAccess"/>
              <spring:url value="/ioValidations/list" var="ioValidationsURL" htmlEscape="true">
                <spring:param name="eraseLocalStorage" value="true"/>
              </spring:url>
              <li class="<c:if test="${!hasAccess}">disabled</c:if>">
                <a <c:if test="${hasAccess}">href="${ioValidationsURL}"</c:if>>
                  <spring:message code="common.menu.system.ioValidations"/>
                </a>
              </li>
              <security:authorize access="hasRole('IO_ERROR_CODES')" var="hasAccess"/>
              <spring:url value="/ioErrorCodes/list" var="ioErrorCodesURL" htmlEscape="true">
                <spring:param name="eraseLocalStorage" value="true"/>
              </spring:url>
              <li class="<c:if test="${!hasAccess}">disabled</c:if>">
                <a <c:if test="${hasAccess}">href="${ioErrorCodesURL}"</c:if>>
                  <spring:message code="common.menu.system.ioErrorCodes"/>
                </a>
              </li>
              <li class="divider" role="separator"></li>
              <security:authorize access="hasRole('SYS_JOBS')" var="hasAccess"/>
              <spring:url value="/sysJobs/list" var="sysJobsURL" htmlEscape="true">
                <spring:param name="eraseLocalStorage" value="true"/>
              </spring:url>
              <li class="<c:if test="${!hasAccess}">disabled</c:if>">
                <a <c:if test="${hasAccess}">href="${sysJobsURL}"</c:if>>
                  <spring:message code="common.menu.system.sysJobs"/>
                </a>
              </li>
              <security:authorize access="hasRole('SYS_PARAMETERS')" var="hasAccess"/>
              <spring:url value="/sysParameters/list" var="sysParametersURL" htmlEscape="true">
                <spring:param name="eraseLocalStorage" value="true"/>
              </spring:url>
              <li class="<c:if test="${!hasAccess}">disabled</c:if>">
                <a <c:if test="${hasAccess}">href="${sysParametersURL}"</c:if>>
                  <spring:message code="common.menu.system.sysParameters"/>
                </a>
              </li>
              <li class="divider" role="separator"></li>
              <security:authorize access="hasRole('CORE_USERS')" var="hasAccess"/>
              <spring:url value="/coreUsers/list" var="coreUsersURL" htmlEscape="true">
                <spring:param name="eraseLocalStorage" value="true"/>
              </spring:url>
              <li class="<c:if test="${!hasAccess}">disabled</c:if>">
                <a <c:if test="${hasAccess}">href="${coreUsersURL}"</c:if>>
                  <spring:message code="common.menu.system.coreUsers"/>
                </a>
              </li>
            </ul>
          </li>
        </ul>
        <div class="pull-right">
          <%-- Přihlášený uživatel --%>
          <security:authorize access="isAuthenticated()">
            <security:authentication property="principal.username" var="username"/>
            <security:authentication property="principal.displayName" var="displayName"/>
            <span class="navbar-text">
              <span>
                <i class="<spring:message code="common.glyph.user"/>"></i>
                ${displayName} (${username})
              </span>
              <%-- TODO - funkcni fragment pro zobrazeni casu vyrederovani stranky, chybi ho nastylovat a umistit --%>
              <%--<span>--%>
                <%--<jsp:useBean id="now" class="java.util.Date"/>--%>
                <%--<jsp:useBean id="dateTimeGetter" class="cz.sefira.supin.svii.gui.utils.DateFormatConstants"/>--%>
                <%--<fmt:formatDate value="${now}" pattern="${dateTimeGetter.javaDatetimeS}"/>--%>
              <%--</span>--%>
            </span>
          </security:authorize>
          <%-- Odhlášení --%>
          <a href="#"
             class="navbar-text"
             title="<spring:message code="common.action.logout"/>"
             onclick="$('#logoutForm').submit();">
            <i class="<spring:message code="common.glyph.logout"/>"></i>
            <form action="<spring:url value="/logout"/>" id="logoutForm" method="POST">
              <security:csrfInput/>
            </form>
          </a>
        </div>
      </div>
    </div>
  </nav>
</header>
