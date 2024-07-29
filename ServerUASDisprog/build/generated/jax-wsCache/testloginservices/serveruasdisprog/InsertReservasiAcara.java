
package serveruasdisprog;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for insertReservasiAcara complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="insertReservasiAcara"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idAkun" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idDaftarAcara" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertReservasiAcara", propOrder = {
    "total",
    "idAkun",
    "idDaftarAcara"
})
public class InsertReservasiAcara {

    protected int total;
    protected int idAkun;
    protected int idDaftarAcara;

    /**
     * Gets the value of the total property.
     * 
     */
    public int getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     */
    public void setTotal(int value) {
        this.total = value;
    }

    /**
     * Gets the value of the idAkun property.
     * 
     */
    public int getIdAkun() {
        return idAkun;
    }

    /**
     * Sets the value of the idAkun property.
     * 
     */
    public void setIdAkun(int value) {
        this.idAkun = value;
    }

    /**
     * Gets the value of the idDaftarAcara property.
     * 
     */
    public int getIdDaftarAcara() {
        return idDaftarAcara;
    }

    /**
     * Sets the value of the idDaftarAcara property.
     * 
     */
    public void setIdDaftarAcara(int value) {
        this.idDaftarAcara = value;
    }

}
