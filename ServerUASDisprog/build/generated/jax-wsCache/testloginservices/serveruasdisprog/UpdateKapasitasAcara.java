
package serveruasdisprog;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateKapasitasAcara complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateKapasitasAcara"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="namaAcara" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateKapasitasAcara", propOrder = {
    "namaAcara"
})
public class UpdateKapasitasAcara {

    protected String namaAcara;

    /**
     * Gets the value of the namaAcara property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamaAcara() {
        return namaAcara;
    }

    /**
     * Sets the value of the namaAcara property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamaAcara(String value) {
        this.namaAcara = value;
    }

}
