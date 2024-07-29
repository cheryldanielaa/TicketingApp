
package serveruasdisprog;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for insertReservationParkir complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="insertReservationParkir"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="no_plat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="harga" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="no_parkir" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="tanggal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idAkun" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idDaftarParkir" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertReservationParkir", propOrder = {
    "noPlat",
    "harga",
    "noParkir",
    "tanggal",
    "idAkun",
    "idDaftarParkir"
})
public class InsertReservationParkir {

    @XmlElement(name = "no_plat")
    protected String noPlat;
    protected int harga;
    @XmlElement(name = "no_parkir")
    protected int noParkir;
    protected String tanggal;
    protected int idAkun;
    protected int idDaftarParkir;

    /**
     * Gets the value of the noPlat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoPlat() {
        return noPlat;
    }

    /**
     * Sets the value of the noPlat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoPlat(String value) {
        this.noPlat = value;
    }

    /**
     * Gets the value of the harga property.
     * 
     */
    public int getHarga() {
        return harga;
    }

    /**
     * Sets the value of the harga property.
     * 
     */
    public void setHarga(int value) {
        this.harga = value;
    }

    /**
     * Gets the value of the noParkir property.
     * 
     */
    public int getNoParkir() {
        return noParkir;
    }

    /**
     * Sets the value of the noParkir property.
     * 
     */
    public void setNoParkir(int value) {
        this.noParkir = value;
    }

    /**
     * Gets the value of the tanggal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTanggal() {
        return tanggal;
    }

    /**
     * Sets the value of the tanggal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTanggal(String value) {
        this.tanggal = value;
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
     * Gets the value of the idDaftarParkir property.
     * 
     */
    public int getIdDaftarParkir() {
        return idDaftarParkir;
    }

    /**
     * Sets the value of the idDaftarParkir property.
     * 
     */
    public void setIdDaftarParkir(int value) {
        this.idDaftarParkir = value;
    }

}
