package cz.slama.school.ddw.hw2.pages.common.model.datatables;

import java.util.List;

/**
 * DataTables response.
 */
public class DataTablesResponse {

  private Long draw; // čítač vykreslení tabulky (musí odpovídat číslu v requestu)
  private Long recordsTotal; // počet všech záznamů
  private Long recordsFiltered; // počet všech záznamů po filtrování
  private List data; // data tabulky

  public DataTablesResponse(Long draw) {
    this.draw = draw;
  }

  public Long getDraw() {
    return draw;
  }

  public void setDraw(Long draw) {
    this.draw = draw;
  }

  public Long getRecordsTotal() {
    return recordsTotal;
  }

  public void setRecordsTotal(Long recordsTotal) {
    this.recordsTotal = recordsTotal;
  }

  public Long getRecordsFiltered() {
    return recordsFiltered;
  }

  public void setRecordsFiltered(Long recordsFiltered) {
    this.recordsFiltered = recordsFiltered;
  }

  public List getData() {
    return data;
  }

  public void setData(List data) {
    this.data = data;
  }

  @Override
  public String toString() {
    return "DataTablesResponse{" +
        "draw=" + draw +
        ", recordsTotal=" + recordsTotal +
        ", recordsFiltered=" + recordsFiltered +
        ", data=" + data +
        '}';
  }
}
