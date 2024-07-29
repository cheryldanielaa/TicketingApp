
package serveruasdisprog;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reservasiAcara complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reservasiAcara"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://services.testlogin.com/}myModel"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idAkun" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idAkunn" type="{http://services.testlogin.com/}akun" minOccurs="0"/&gt;
 *         &lt;element name="idDaftarAcara" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idDaftarAcaraa" type="{http://services.testlogin.com/}daftarAcara" minOccurs="0"/&gt;
 *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reservasiAcara", propOrder = {
    "id",
    "idAkun",
    "idAkunn",
    "idDaftarAcara",
    "idDaftarAcaraa",
    "total"
})
public class ReservasiAcara
    extends MyModel
{

    protected int id;
    protected int idAkun;
    protected Akun idAkunn;
    protected int idDaftarAcara;
    protected DaftarAcara idDaftarAcaraa;
    protected int total;

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
     * Gets the value of the idAkunn property.
     * 
     * @return
     *     possible object is
     *     {@link Akun }
     *     
     */
    public Akun getIdAkunn() {
        return idAkunn;
    }

    /**
     * Sets the value of the idAkunn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Akun }
     *     
     */
    public void setIdAkunn(Akun value) {
        this.idAkunn = value;
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

    /**
     * Gets the value of the idDaftarAcaraa property.
     * 
     * @return
     *     possible object is
     *     {@link DaftarAcara }
     *     
     */
    public DaftarAcara getIdDaftarAcaraa() {
        return idDaftarAcaraa;
    }

    /**
     * Sets the value of the idDaftarAcaraa property.
     * 
     * @param value
     *     allowed object is
     *     {@link DaftarAcara }
     *     
     */
    public void setIdDaftarAcaraa(DaftarAcara value) {
        this.idDaftarAcaraa = value;
    }

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

}
