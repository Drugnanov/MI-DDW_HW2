/**
 * Created by slama on 6.2.2016.
 */

$(function () {
  /**
   * Reload DataTables tabulky.
   */
  $('.sef-dt-reload').on('click', function (event) {
    reloadDataTable($(this).data('table-id'));
    event.preventDefault();
  });
});

/**
 * Defaultní nastavení DataTables.
 */
var dataTablesDefaults = {
  dom: '<"row"<"col-sm-5 pull-bottom"l><"col-sm-7 pull-bottom"p>><"row"<"col-sm-12"tr>><"row"<"col-sm-5"i><"col-sm-7"pf>>',
  pageLength: 10, // počet záznamů na stránku
  lengthChange: true, // možnost změny počtu záznamů na stránce, je-li definován výčet
  lengthMenu: [10, 25, 50, 75, 100], // definování seznamu počtu záznamů na stránku
  searching: false, // vyhledávání
  order: [], // žádné výchozí třídění
  processing: true,
  serverSide: true, // zpracování na straně serveru
  /* Definice vlastností sloupců */
  columnDefs: [
    {
      targets: '_all',
      defaultContent: ''
    }
  ]
};
$.extend(true, $.fn.dataTable.defaults, dataTablesDefaults);

/**
 * Reload DataTables tabulky. Vytvoří nový request, který se odešle na server.
 */
function reloadDataTable(tableId) {
  $('#' + tableId).DataTable().ajax.reload();
}
