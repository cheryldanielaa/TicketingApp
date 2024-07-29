
package serveruasdisprog;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for daftarAcara complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="daftarAcara"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://services.testlogin.com/}myModel"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="harga" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="jenis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="kapasitas" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="lokasi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nama" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tanggal_pelaksanaan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "daftarAcara", propOrder = {
    "harga",
    "id",
    "jenis",
    "kapasitas",
    "lokasi",
    "nama",
    "tanggalPelaksanaan"
})
public class DaftarAcara
    extends MyModel
{

    protected int harga;
    protected int id;
    protected String jenis;
    protected int kapasitas;
    protected String lokasi;
    protected String nama;
    @XmlElement(name = "tanggal_pelaksanaan")
    protected String tanggalPelaksanaan;

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
     * Gets the value of the jenis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJenis() {
        return jenis;
    }

    /**
     * Sets the value of the jenis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJenis(String value) {
        this.jenis = value;
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

    /**
     * Gets the value of the nama property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNama() {
        return nama;
    }

    /**
     * Sets the value of the nama property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNama(String value) {
        this.nama = value;
    }

    /**
     * Gets the value of the tanggalPelaksanaan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTanggalPelaksanaan() {
        return tanggalPelaksanaan;
    }

    /**
     * Sets the value of the tanggalPelaksanaan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTanggalPelaksanaan(String value) {
        this.tanggalPelaksanaan = value;
    }

}
