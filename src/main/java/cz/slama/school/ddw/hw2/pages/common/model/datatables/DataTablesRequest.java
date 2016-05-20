package cz.slama.school.ddw.hw2.pages.common.model.datatables;

import java.util.List;
import java.util.Map;

/**
 * DataTables request.
 */
public class DataTablesRequest {

  private Long draw; // čítač vykreslení tabulky
  private Long start; // index prvního záznamu tabulky
  private Long length; // počet zobrazených záznamů tabulky

  private Map<DataTablesSearchEnum, String> search; // globálně vyhledávaná hodnota
  private List<Map<DataTablesOrderEnum, String>> order; // třídění - sloupec, na který je třídění aplikováno
  private List<Map<DataTablesColumnEnum, String>> columns; // data sloupce

  public enum DataTablesSearchEnum {
    value, regex
  }

  public enum DataTablesOrderEnum {
    column, dir
  }

  public enum DataTablesColumnEnum {
    data, name, searchable, orderable, searchValue, searchRegex
  }

  public Long getDraw() {
    return draw;
  }

  public void setDraw(Long draw) {
    this.draw = draw;
  }

  public Long getStart() {
    return start;
  }

  public void setStart(Long start) {
    this.start = start;
  }

  public Long getLength() {
    return length;
  }

  public void setLength(Long length) {
    this.length = length;
  }

  public Map<DataTablesSearchEnum, String> getSearch() {
    return search;
  }

  public void setSearch(
      Map<DataTablesSearchEnum, String> search) {
    this.search = search;
  }

  public List<Map<DataTablesOrderEnum, String>> getOrder() {
    return order;
  }

  public void setOrder(
      List<Map<DataTablesOrderEnum, String>> order) {
    this.order = order;
  }

  public List<Map<DataTablesColumnEnum, String>> getColumns() {
    return columns;
  }

  public void setColumns(
      List<Map<DataTablesColumnEnum, String>> columns) {
    this.columns = columns;
  }

  @Override
  public String toString() {
    return "DataTablesRequest{" +
        "draw=" + draw +
        ", start=" + start +
        ", length=" + length +
        ", search=" + search +
        ", order=" + order +
        ", columns=" + columns +
        '}';
  }
}
