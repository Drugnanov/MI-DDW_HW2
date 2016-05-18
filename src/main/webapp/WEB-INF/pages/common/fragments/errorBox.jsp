<%
  /*
   * Copyright 2016 by SEFIRA, spol. s r. o.
   * http://www.sefira.cz
   *
   * Created: 6.2.2016
   * Author:  slama
   */

/**
 * Stránka pro zobrazení vzniklé výjimky v systému.
 */
%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<%--@elvariable id="statusCode" type="java.lang.String"--%>
<%--@elvariable id="errResourcePart" type="java.lang.String"--%>

<div class="jumbotron container">
  <h1>${statusCode}
    <small>
      <i class="<spring:message code="common.glyph.error"/> warning"></i>
      <spring:message code="common.error.${errResourcePart}.message"/>
    </small>
  </h1>
  <p>
    <spring:message code="common.error.${errResourcePart}.text"/>
    <spring:message code="common.error.text.back.start"/>
    <a href="#" onclick="window.history.back();">
      <spring:message code="common.error.text.back.link"/>
    </a>
    <spring:message code="common.error.text.back.end"/>
  </p>
</div>

