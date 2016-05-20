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

<%--@elvariable id="associativeRulesFilterForm" type="cz.slama.school.ddw.hw2.pages.associativeRules.AssociativeRulesFilterForm"--%>

  <spring:url value="/asocRules/list/data/ajax" var="dataURL" htmlEscape="true"/>

  <div class="panel panel-default">
    <div class="panel-heading clearfix">
      <h3 class="panel-title pull-left"><spring:message code="associativeRules.title"/></h3>
        <%-- Akční tlačítka --%>
    </div>
    <div class="panel-body">
      <%-- Vyhledávání --%>
      <form:form modelAttribute="associativeRulesFilterForm" cssClass="form-inline sef-form-filter">
        <div class="form-group">
          <form:label path="searchString" cssClass="control-label">
            <spring:message code="associativeRules.filter.label.search"/>
          </form:label>
          <form:input path="searchString"/>
        </div>
        <div class="form-group">
          <button type="button" class="btn btn-primary sef-dt-reload" data-table-id="associativeRulesResultSet">
            <i class="glyphicon glyphicon-search"></i>
            <spring:message code="common.action.search"/>
          </button>
        </div>
      </form:form>
      <hr>
        <%-- Výsledková sada --%>
      <table id="associativeRulesResultSet" class="table table-striped" style="width: 100%">
        <thead>
        <tr>
          <th></th> <%--associativeRuleId--%>
          <th><spring:message code="associativeRules.associativeRuleId"/></th>
          <th><spring:message code="associativeRules.confidence"/></th>
          <th><spring:message code="associativeRules.premises"/></th>
          <th><spring:message code="associativeRules.conclusion"/></th>
        </tr>
        </thead>
      </table>
    </div>
  </div>

  <script>
    /** Document ready */
    $(function () {
      var tableOptions = {
        pageLength: 25,
        ajax: {
          method: "POST",
          url: '${dataURL}',
          data: function (data) {
            prepareDataTablesData(data);
            $.each($('#associativeRulesFilterForm').serializeArray(), function (index, element) {
              data[element.name] = element.value;
            });
          }
        },
        /* Vlastnosti sloupců */
        columns: [
          {
            data: 'associativeRuleId',
            visible: false
          },
          {
            data: 'associativeRuleId',
            visible: true,
            orderable: true,
            className: 'dt-body-nowrap dt-body-width-min'
          },
          {
            data: 'confidence',
            visible: true,
            orderable: false,
            className: 'dt-body-nowrap dt-body-width-min'
          },
          {
            data: 'premisesString',
            visible: true,
            orderable: false
          },
          {
            data: 'conclusionsString',
            visible: true,
            orderable: true
          }
        ]
      };
      $('#associativeRulesResultSet').dataTable(tableOptions);
    });

    /**
     * Úprava dat odesílaných na server. Transformace 3D pole na 2D pole.
     * columns[i][search][value] -> columns[i][searchValue]
     * columns[i][search][regex] -> columns[i][searchRegex]
     *
     * @param data  data odesílaná na server
     */
    function prepareDataTablesData(data) {
      for (var i = 0; i < data.columns.length; i++) {
        var column = data.columns[i];
        column.searchValue = column.search.value;
        column.searchRegex = column.search.regex;
        delete(column.search);
      }
    }
  </script>



