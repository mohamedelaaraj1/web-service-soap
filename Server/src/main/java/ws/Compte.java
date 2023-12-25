package ws;

import java.util.Date;

public class Compte {
    private int code;
    private double sold;
    private Date dateCreation;

    public Compte() {
    }

    public Compte(int code, double sold, Date dateCreation) {
        this.code = code;
        this.sold = sold;
        this.dateCreation = dateCreation;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSold() {
        return sold;
    }

    public void setSold(double sold) {
        this.sold = sold;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}
