
package serveruasdisprog;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for daftarParkir complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="daftarParkir"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://services.testlogin.com/}myModel"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="kapasitas" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="lokasi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "daftarParkir", propOrder = {
    "id",
    "kapasitas",
    "lokasi"
})
public class DaftarParkir
    extends MyModel
{

    protected int id;
    protected int kapasitas;
    protected String lokasi;

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
     * Gets the value of the kapasitas property.
     * 
     */
    public int getKapasitas() {
        return kapasitas;
    }

    /**
     * Sets the value of the kapasitas property.
     * 
     */
    public void setKapasitas(int value) {
        this.kapasitas = value;
    }

    /**
     * Gets the value of the lokasi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLokasi() {
        return lokasi;
    }

    /**
     * Sets the value of the lokasi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLokasi(String value) {
        this.lokasi = value;
    }

}
