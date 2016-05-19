/**
 * Created by slama on 6.2.2016.
 */

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
  /* Definice vlastností sloupců */
  columnDefs: [
    {
      targets: '_all',
      defaultContent: ''
    }
  ]
};
$.extend(true, $.fn.dataTable.defaults, dataTablesDefaults);