<%
  /*
   * Copyright 2016 by SEFIRA, spol. s r. o.
   * http://www.sefira.cz
   * 
   * Created: 14.1.2016
   * Author:  dyntar
   */

/**
 * Zápatí stránky.
 */
%>

<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<footer class="footer">
  <div class="container-fluid">
    <p class="pull-left text-muted"><spring:message code="common.application.footer.copyright" htmlEscape="false"/></p>
    <p class="pull-right text-muted"><spring:message code="common.application.footer.version"/></p>
  </div>
</footer>
