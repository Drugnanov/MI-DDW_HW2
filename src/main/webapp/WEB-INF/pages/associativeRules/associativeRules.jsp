<%--
  Created by IntelliJ IDEA.
  User: Drugnanov
  Date: 18.5.2016
  Time: 20:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

  <div>Ahoj světe</div>
  <%--<spring:url value="/coreCiselniky/list/data/ajax" var="dataURL" htmlEscape="true"/>--%>

  <%--<div class="panel panel-default">--%>
    <%--<div class="panel-heading clearfix">--%>
      <%--<h3 class="panel-title pull-left"><spring:message code="coreCiselniky.list.panel.title"/></h3>--%>
        <%--&lt;%&ndash; Akční tlačítka &ndash;%&gt;--%>
      <%--<div class="btn-group pull-right">--%>
          <%--&lt;%&ndash; Obnovit &ndash;%&gt;--%>
        <%--<a href="#" class="sef-dt-reload" data-table-id="coreCiselnikyResultSet">--%>
          <%--<i class="<spring:message code="common.glyph.refresh"/>"></i>--%>
          <%--<spring:message code="common.action.rs.refresh"/>--%>
        <%--</a>--%>
      <%--</div>--%>
    <%--</div>--%>
    <%--<div class="panel-body">--%>
        <%--&lt;%&ndash; Vyhledávání &ndash;%&gt;--%>
      <%--<form:form modelAttribute="coreCiselnikFilterForm" cssClass="form-inline sef-form-filter">--%>
        <%--<div class="form-group">--%>
          <%--<sefira:formElementEdit bindPath="filter" label="coreCiselniky.filter.label.search"--%>
                                  <%--emptyDefaultWidthClass="true"--%>
                                  <%--isAutofocus="true"/>--%>
        <%--</div>--%>
        <%--<div class="form-group">--%>
          <%--<button type="button" class="btn btn-primary sef-dt-reload" data-table-id="coreCiselnikyResultSet">--%>
            <%--<i class="<spring:message code="common.glyph.search"/>"></i>--%>
            <%--<spring:message code="common.action.search"/>--%>
          <%--</button>--%>
        <%--</div>--%>
      <%--</form:form>--%>
      <%--<hr>--%>
        <%--&lt;%&ndash; Výsledková sada &ndash;%&gt;--%>
      <%--<table id="coreCiselnikyResultSet" class="table table-striped" style="width: 100%">--%>
        <%--<thead>--%>
        <%--<tr>--%>
          <%--<th></th> &lt;%&ndash; idCoreCiselnik &ndash;%&gt;--%>
          <%--<th><spring:message code="coreCiselnikForm.kodCiselniku"/></th>--%>
          <%--<th><spring:message code="coreCiselnikForm.nazev"/></th>--%>
          <%--<th><spring:message code="coreCiselnikForm.popis"/></th>--%>
          <%--<th><spring:message code="coreCiselnikForm.verze"/></th>--%>
          <%--<th><spring:message code="coreCiselnikForm.datumCasZmeny"/></th>--%>
          <%--<th><spring:message code="coreCiselnikForm.interni"/></th>--%>
        <%--</tr>--%>
        <%--</thead>--%>
      <%--</table>--%>
    <%--</div>--%>
  <%--</div>--%>

  <%--<script>--%>
    <%--/** Document ready */--%>
    <%--var eraseLocalStorage = [--%>
      <%--[${eraseLocalStorage}]--%>
    <%--];--%>

    <%--var eraseSpecial = ['coreCiselnikHodnotyResultSet'];--%>

    <%--$(function () {--%>
      <%--var tableOptions = {--%>
        <%--pageLength: 25,--%>
        <%--ajax: {--%>
          <%--url: '${dataURL}',--%>
          <%--data: function (data) {--%>
            <%--prepareDataTablesData(data);--%>
            <%--$.each($('#coreCiselnikFilterForm').serializeArray(), function (index, element) {--%>
              <%--data[element.name] = element.value;--%>
            <%--});--%>
          <%--}--%>
        <%--},--%>
        <%--/* Vlastnosti sloupců */--%>
        <%--columns: [--%>
          <%--{--%>
            <%--data: 'idCoreCiselnik',--%>
            <%--visible: true,--%>
            <%--orderable: false,--%>
            <%--render: function (data, type, row, meta) { // vlastní vypsání obsahu sloupce--%>
              <%--var result = '<div class="btn-group btn-group-xs">';--%>
              <%--result += '<a href="<spring:url value="/coreCiselniky/edit?idCoreCiselnik=" htmlEscape="true"/>' + data + '"';--%>
              <%--result += ' title="<spring:message code="common.title.detail"/>">';--%>
              <%--result += '<i class="<spring:message code="common.glyph.edit"/>"></i>';--%>
              <%--result += '</a>';--%>
              <%--return result + '</div>';--%>
            <%--},--%>
            <%--className: 'dt-body-nowrap dt-body-width-min'--%>
          <%--},--%>
          <%--{--%>
            <%--data: 'kodCiselniku',--%>
            <%--visible: true,--%>
            <%--orderable: true--%>
          <%--},--%>
          <%--{--%>
            <%--data: 'nazev',--%>
            <%--visible: true,--%>
            <%--orderable: true--%>
          <%--},--%>
          <%--{--%>
            <%--data: 'popis',--%>
            <%--visible: true,--%>
            <%--orderable: false,--%>
            <%--render: function (data, type, row, meta) { // vlastní vypsání obsahu sloupce--%>
              <%--return $.sefTruncateNicely(data, 100);--%>
            <%--}--%>
          <%--},--%>
          <%--{--%>
            <%--data: 'verze',--%>
            <%--visible: true,--%>
            <%--orderable: false--%>
          <%--},--%>
          <%--{--%>
            <%--data: 'datumCasZmeny',--%>
            <%--visible: true,--%>
            <%--orderable: false,--%>
            <%--render: function (data, type, row, meta) {--%>
              <%--return $.sefFormatDate(data, '${dateFormats.momentjsDatetimeM}');--%>
            <%--},--%>
            <%--className: 'dt-nowrap dt-width-min'--%>
          <%--},--%>
          <%--{--%>
            <%--data: 'interni',--%>
            <%--visible: true,--%>
            <%--orderable: true,--%>
            <%--render: function (data, type, row, meta) {--%>
              <%--var text = '<spring:message code="coreCiselniky.state.externi"/>';--%>
              <%--if (data)--%>
                <%--text = '<spring:message code="coreCiselniky.state.interni"/>';--%>
              <%--return text;--%>
            <%--}--%>
          <%--}--%>
        <%--]--%>
      <%--};--%>
      <%--$('#coreCiselnikyResultSet').dataTable(tableOptions);--%>
    <%--});--%>

    <%--ensureNumber = function (n) {--%>
      <%--n = parseInt(n, 10);--%>
      <%--if (isNaN(n) || n <= 0) {--%>
        <%--n = 0;--%>
      <%--}--%>
      <%--return n;--%>
    <%--};--%>
  <%--</script>--%>



