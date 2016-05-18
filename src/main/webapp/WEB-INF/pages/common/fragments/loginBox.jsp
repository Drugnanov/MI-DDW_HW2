<%
  /*
   * Copyright 2016 by SEFIRA, spol. s r. o.
   * http://www.sefira.cz
   *
   * Created: 20.1.2016
   * Author:  dyntar
   */

/**
 * Přihlašovací stránka.
 */
%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="sefira" tagdir="/WEB-INF/tags" %>

<%--@elvariable id="messages" type="java.util.List"--%>
<%--@elvariable id="commonLdapDomainList" type="java.util.List"--%>

<div class="col-md-6 col-md-offset-3">
  <form action="<spring:url value="/login"/>" method="POST" id="loginForm" role="form">
    <security:csrfInput/>
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title text-center"><spring:message code="common.login.title"/></h3>
      </div>
      <div class="panel-body">
        <div class="container-fluid">
          <sefira:messages messages="${messages}"/>
        </div>
        <div class="form-group <c:if test="${param['error'] != null}">has-error</c:if>">
          <div class="input-group">
            <span class="input-group-addon"><i class="<spring:message code="common.glyph.user"/>"></i></span>
            <input type="text" name="username" class="form-control"
                   placeholder="<spring:message code="common.login.username"/>" tabindex="1" autofocus>
            <span class="input-group-addon">@</span>
            <select name="domain" class="form-control" tabindex="2">
              <c:forEach items="${commonLdapDomainList}" var="domain" varStatus="rowStatus">
                <option value="${domain}">${domain}</option>
              </c:forEach>
            </select>
          </div>
        </div>
        <div class="form-group <c:if test="${param['error'] != null}">has-error</c:if>">
          <div class="input-group">
            <span class="input-group-addon"><i class="<spring:message code="common.glyph.lock"/>"></i></span>
            <input type="password" name="password" class="form-control"
                   placeholder="<spring:message code="common.login.password"/>" tabindex="3">
          </div>
        </div>
        <button type="submit" class="btn btn-primary pull-right">
          <i class="<spring:message code="common.glyph.login"/>"></i>
          <spring:message code="common.action.login"/>
        </button>
      </div>
    </div>
  </form>
</div>

<script>
  /** Document ready */
  $(function () {
    // Odešle username jako spojení polí username + doména
    $('#loginForm').submit(function() {
      var usernameField = $('input[name="username"]');
      var domainField = $('select[name="domain"]');
      var username = usernameField.val();
      if (domainField.val()) {
        username += "@" + domainField.val();
      }
      usernameField.val(username);
      return true;
    });
  });
</script>
