
package serveruasdisprog;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tiket complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tiket"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://services.testlogin.com/}myModel"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idReservasi" type="{http://services.testlogin.com/}reservasiAcara" minOccurs="0"/&gt;
 *         &lt;element name="kode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tiket", propOrder = {
    "id",
    "idReservasi",
    "kode",
    "status"
})
public class Tiket
    extends MyModel
{

    protected int id;
    protected ReservasiAcara idReservasi;
    protected String kode;
    protected String status;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the idReservasi property.
     * 
     * @return
     *     possible object is
     *     {@link ReservasiAcara }
     *     
     */
    public ReservasiAcara getIdReservasi() {
        return idReservasi;
    }

    /**
     * Sets the value of the idReservasi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservasiAcara }
     *     
     */
    public void setIdReservasi(ReservasiAcara value) {
        this.idReservasi = value;
    }

    /**
     * Gets the value of the kode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKode() {
        return kode;
    }

    /**
     * Sets the value of the kode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKode(String value) {
        this.kode = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
