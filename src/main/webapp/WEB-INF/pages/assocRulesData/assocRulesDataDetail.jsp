<%--
  Created by IntelliJ IDEA.
  User: Drugnanov
  Date: 18.5.2016
  Time: 20:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%--Zobrazeni odpovedi--%>
<div class="panel panel-default">
  <div class="panel-heading clearfix">
    <a href="#assocRulesDataPanel" class="" data-toggle="collapse">
    <h3 class="panel-title pull-left"><spring:message code="assocRulesData.list.panel.rules.title"/></h3>
    </a>
  </div>
  <div class="panel-body collapse" id="assocRulesDataPanel">
    <pre><c:out value="${assocRulesData}"/></pre>
  </div>
</div>

<%--Zobrazeni odpovedi--%>
<div class="panel panel-default">
  <div class="panel-heading clearfix">
    <a href="#assocRulesSourcePanel" class="" data-toggle="collapse">
      <h3 class="panel-title pull-left"><spring:message code="assocRulesData.list.panel.source.title"/></h3>
    </a>
  </div>
  <div class="panel-body collapse" id="assocRulesSourcePanel">
    <pre><c:out value="${assocRulesSource}"/></pre>
  </div>
</div>



