package test.entity.JavaBean;


public class Drug {

  private int id;
  private String name;
  private java.sql.Date expiryDate;
  private String other;


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public java.sql.Date getExpiryDate() {
    return expiryDate;
  }

  public void setExpiryDate(java.sql.Date expiryDate) {
    this.expiryDate = expiryDate;
  }


  public String getOther() {
    return other;
  }

  public void setOther(String other) {
    this.other = other;
  }

}
