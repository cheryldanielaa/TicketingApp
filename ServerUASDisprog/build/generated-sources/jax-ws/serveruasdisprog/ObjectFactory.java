
package serveruasdisprog;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the serveruasdisprog package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BacaKapasitas_QNAME = new QName("http://services.testlogin.com/", "BacaKapasitas");
    private final static QName _BacaKapasitasResponse_QNAME = new QName("http://services.testlogin.com/", "BacaKapasitasResponse");
    private final static QName _BacaLotTerisi_QNAME = new QName("http://services.testlogin.com/", "BacaLotTerisi");
    private final static QName _BacaLotTerisiResponse_QNAME = new QName("http://services.testlogin.com/", "BacaLotTerisiResponse");
    private final static QName _BacaParkiran_QNAME = new QName("http://services.testlogin.com/", "BacaParkiran");
    private final static QName _BacaParkiranResponse_QNAME = new QName("http://services.testlogin.com/", "BacaParkiranResponse");
    private final static QName _CariIDUser_QNAME = new QName("http://services.testlogin.com/", "CariIDUser");
    private final static QName _CariIDUserResponse_QNAME = new QName("http://services.testlogin.com/", "CariIDUserResponse");
    private final static QName _CheckRegister_QNAME = new QName("http://services.testlogin.com/", "CheckRegister");
    private final static QName _CheckRegisterResponse_QNAME = new QName("http://services.testlogin.com/", "CheckRegisterResponse");
    private final static QName _UpdateKapasitasAcara_QNAME = new QName("http://services.testlogin.com/", "UpdateKapasitasAcara");
    private final static QName _UpdateKapasitasAcaraResponse_QNAME = new QName("http://services.testlogin.com/", "UpdateKapasitasAcaraResponse");
    private final static QName _UpdateStatusToClaim_QNAME = new QName("http://services.testlogin.com/", "UpdateStatusToClaim");
    private final static QName _UpdateStatusToClaimResponse_QNAME = new QName("http://services.testlogin.com/", "UpdateStatusToClaimResponse");
    private final static QName _BacaIdLokasi_QNAME = new QName("http://services.testlogin.com/", "bacaIdLokasi");
    private final static QName _BacaIdLokasiResponse_QNAME = new QName("http://services.testlogin.com/", "bacaIdLokasiResponse");
    private final static QName _BacaJumTiket_QNAME = new QName("http://services.testlogin.com/", "bacaJumTiket");
    private final static QName _BacaJumTiketResponse_QNAME = new QName("http://services.testlogin.com/", "bacaJumTiketResponse");
    private final static QName _CariIdAcara_QNAME = new QName("http://services.testlogin.com/", "cariIdAcara");
    private final static QName _CariIdAcaraResponse_QNAME = new QName("http://services.testlogin.com/", "cariIdAcaraResponse");
    private final static QName _CheckLogin_QNAME = new QName("http://services.testlogin.com/", "checkLogin");
    private final static QName _CheckLoginResponse_QNAME = new QName("http://services.testlogin.com/", "checkLoginResponse");
    private final static QName _GetDaftarAcara_QNAME = new QName("http://services.testlogin.com/", "getDaftarAcara");
    private final static QName _GetDaftarAcaraResponse_QNAME = new QName("http://services.testlogin.com/", "getDaftarAcaraResponse");
    private final static QName _GetTickets_QNAME = new QName("http://services.testlogin.com/", "getTickets");
    private final static QName _GetTicketsResponse_QNAME = new QName("http://services.testlogin.com/", "getTicketsResponse");
    private final static QName _Hello_QNAME = new QName("http://services.testlogin.com/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://services.testlogin.com/", "helloResponse");
    private final static QName _InsertData_QNAME = new QName("http://services.testlogin.com/", "insertData");
    private final static QName _InsertDataResponse_QNAME = new QName("http://services.testlogin.com/", "insertDataResponse");
    private final static QName _InsertReservasiAcara_QNAME = new QName("http://services.testlogin.com/", "insertReservasiAcara");
    private final static QName _InsertReservasiAcaraResponse_QNAME = new QName("http://services.testlogin.com/", "insertReservasiAcaraResponse");
    private final static QName _InsertReservasiTiket_QNAME = new QName("http://services.testlogin.com/", "insertReservasiTiket");
    private final static QName _InsertReservasiTiketResponse_QNAME = new QName("http://services.testlogin.com/", "insertReservasiTiketResponse");
    private final static QName _InsertReservationParkir_QNAME = new QName("http://services.testlogin.com/", "insertReservationParkir");
    private final static QName _InsertReservationParkirResponse_QNAME = new QName("http://services.testlogin.com/", "insertReservationParkirResponse");
    private final static QName _ReservasiBaru_QNAME = new QName("http://services.testlogin.com/", "reservasiBaru");
    private final static QName _ReservasiBaruResponse_QNAME = new QName("http://services.testlogin.com/", "reservasiBaruResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: serveruasdisprog
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BacaKapasitas }
     * 
     */
    public BacaKapasitas createBacaKapasitas() {
        return new BacaKapasitas();
    }

    /**
     * Create an instance of {@link BacaKapasitasResponse }
     * 
     */
    public BacaKapasitasResponse createBacaKapasitasResponse() {
        return new BacaKapasitasResponse();
    }

    /**
     * Create an instance of {@link BacaLotTerisi }
     * 
     */
    public BacaLotTerisi createBacaLotTerisi() {
        return new BacaLotTerisi();
    }

    /**
     * Create an instance of {@link BacaLotTerisiResponse }
     * 
     */
    public BacaLotTerisiResponse createBacaLotTerisiResponse() {
        return new BacaLotTerisiResponse();
    }

    /**
     * Create an instance of {@link BacaParkiran }
     * 
     */
    public BacaParkiran createBacaParkiran() {
        return new BacaParkiran();
    }

    /**
     * Create an instance of {@link BacaParkiranResponse }
     * 
     */
    public BacaParkiranResponse createBacaParkiranResponse() {
        return new BacaParkiranResponse();
    }

    /**
     * Create an instance of {@link CariIDUser }
     * 
     */
    public CariIDUser createCariIDUser() {
        return new CariIDUser();
    }

    /**
     * Create an instance of {@link CariIDUserResponse }
     * 
     */
    public CariIDUserResponse createCariIDUserResponse() {
        return new CariIDUserResponse();
    }

    /**
     * Create an instance of {@link CheckRegister }
     * 
     */
    public CheckRegister createCheckRegister() {
        return new CheckRegister();
    }

    /**
     * Create an instance of {@link CheckRegisterResponse }
     * 
     */
    public CheckRegisterResponse createCheckRegisterResponse() {
        return new CheckRegisterResponse();
    }

    /**
     * Create an instance of {@link UpdateKapasitasAcara }
     * 
     */
    public UpdateKapasitasAcara createUpdateKapasitasAcara() {
        return new UpdateKapasitasAcara();
    }

    /**
     * Create an instance of {@link UpdateKapasitasAcaraResponse }
     * 
     */
    public UpdateKapasitasAcaraResponse createUpdateKapasitasAcaraResponse() {
        return new UpdateKapasitasAcaraResponse();
    }

    /**
     * Create an instance of {@link UpdateStatusToClaim }
     * 
     */
    public UpdateStatusToClaim createUpdateStatusToClaim() {
        return new UpdateStatusToClaim();
    }

    /**
     * Create an instance of {@link UpdateStatusToClaimResponse }
     * 
     */
    public UpdateStatusToClaimResponse createUpdateStatusToClaimResponse() {
        return new UpdateStatusToClaimResponse();
    }

    /**
     * Create an instance of {@link BacaIdLokasi }
     * 
     */
    public BacaIdLokasi createBacaIdLokasi() {
        return new BacaIdLokasi();
    }

    /**
     * Create an instance of {@link BacaIdLokasiResponse }
     * 
     */
    public BacaIdLokasiResponse createBacaIdLokasiResponse() {
        return new BacaIdLokasiResponse();
    }

    /**
     * Create an instance of {@link BacaJumTiket }
     * 
     */
    public BacaJumTiket createBacaJumTiket() {
        return new BacaJumTiket();
    }

    /**
     * Create an instance of {@link BacaJumTiketResponse }
     * 
     */
    public BacaJumTiketResponse createBacaJumTiketResponse() {
        return new BacaJumTiketResponse();
    }

    /**
     * Create an instance of {@link CariIdAcara }
     * 
     */
    public CariIdAcara createCariIdAcara() {
        return new CariIdAcara();
    }

    /**
     * Create an instance of {@link CariIdAcaraResponse }
     * 
     */
    public CariIdAcaraResponse createCariIdAcaraResponse() {
        return new CariIdAcaraResponse();
    }

    /**
     * Create an instance of {@link CheckLogin }
     * 
     */
    public CheckLogin createCheckLogin() {
        return new CheckLogin();
    }

    /**
     * Create an instance of {@link CheckLoginResponse }
     * 
     */
    public CheckLoginResponse createCheckLoginResponse() {
        return new CheckLoginResponse();
    }

    /**
     * Create an instance of {@link GetDaftarAcara }
     * 
     */
    public GetDaftarAcara createGetDaftarAcara() {
        return new GetDaftarAcara();
    }

    /**
     * Create an instance of {@link GetDaftarAcaraResponse }
     * 
     */
    public GetDaftarAcaraResponse createGetDaftarAcaraResponse() {
        return new GetDaftarAcaraResponse();
    }

    /**
     * Create an instance of {@link GetTickets }
     * 
     */
    public GetTickets createGetTickets() {
        return new GetTickets();
    }

    /**
     * Create an instance of {@link GetTicketsResponse }
     * 
     */
    public GetTicketsResponse createGetTicketsResponse() {
        return new GetTicketsResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link InsertData }
     * 
     */
    public InsertData createInsertData() {
        return new InsertData();
    }

    /**
     * Create an instance of {@link InsertDataResponse }
     * 
     */
    public InsertDataResponse createInsertDataResponse() {
        return new InsertDataResponse();
    }

    /**
     * Create an instance of {@link InsertReservasiAcara }
     * 
     */
    public InsertReservasiAcara createInsertReservasiAcara() {
        return new InsertReservasiAcara();
    }

    /**
     * Create an instance of {@link InsertReservasiAcaraResponse }
     * 
     */
    public InsertReservasiAcaraResponse createInsertReservasiAcaraResponse() {
        return new InsertReservasiAcaraResponse();
    }

    /**
     * Create an instance of {@link InsertReservasiTiket }
     * 
     */
    public InsertReservasiTiket createInsertReservasiTiket() {
        return new InsertReservasiTiket();
    }

    /**
     * Create an instance of {@link InsertReservasiTiketResponse }
     * 
     */
    public InsertReservasiTiketResponse createInsertReservasiTiketResponse() {
        return new InsertReservasiTiketResponse();
    }

    /**
     * Create an instance of {@link InsertReservationParkir }
     * 
     */
    public InsertReservationParkir createInsertReservationParkir() {
        return new InsertReservationParkir();
    }

    /**
     * Create an instance of {@link InsertReservationParkirResponse }
     * 
     */
    public InsertReservationParkirResponse createInsertReservationParkirResponse() {
        return new InsertReservationParkirResponse();
    }

    /**
     * Create an instance of {@link ReservasiBaru }
     * 
     */
    public ReservasiBaru createReservasiBaru() {
        return new ReservasiBaru();
    }

    /**
     * Create an instance of {@link ReservasiBaruResponse }
     * 
     */
    public ReservasiBaruResponse createReservasiBaruResponse() {
        return new ReservasiBaruResponse();
    }

    /**
     * Create an instance of {@link DaftarAcara }
     * 
     */
    public DaftarAcara createDaftarAcara() {
        return new DaftarAcara();
    }

    /**
     * Create an instance of {@link Tiket }
     * 
     */
    public Tiket createTiket() {
        return new Tiket();
    }

    /**
     * Create an instance of {@link ReservasiAcara }
     * 
     */
    public ReservasiAcara createReservasiAcara() {
        return new ReservasiAcara();
    }

    /**
     * Create an instance of {@link Akun }
     * 
     */
    public Akun createAkun() {
        return new Akun();
    }

    /**
     * Create an instance of {@link Timestamp }
     * 
     */
    public Timestamp createTimestamp() {
        return new Timestamp();
    }

    /**
     * Create an instance of {@link DaftarParkir }
     * 
     */
    public DaftarParkir createDaftarParkir() {
        return new DaftarParkir();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BacaKapasitas }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BacaKapasitas }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.testlogin.com/", name = "BacaKapasitas")
    public JAXBElement<BacaKapasitas> createBacaKapasitas(BacaKapasitas value) {
        return new JAXBElement<BacaKapasitas>(_BacaKapasitas_QNAME, BacaKapasitas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BacaKapasitasResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BacaKapasitasResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.testlogin.com/", name = "BacaKapasitasResponse")
    public JAXBElement<BacaKapasitasResponse> createBacaKapasitasResponse(BacaKapasitasResponse value) {
        return new JAXBElement<BacaKapasitasResponse>(_BacaKapasitasResponse_QNAME, BacaKapasitasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BacaLotTerisi }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BacaLotTerisi }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.testlogin.com/", name = "BacaLotTerisi")
    public JAXBElement<BacaLotTerisi> createBacaLotTerisi(BacaLotTerisi value) {
        return new JAXBElement<BacaLotTerisi>(_BacaLotTerisi_QNAME, BacaLotTerisi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BacaLotTerisiResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BacaLotTerisiResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.testlogin.com/", name = "BacaLotTerisiResponse")
    public JAXBElement<BacaLotTerisiResponse> createBacaLotTerisiResponse(BacaLotTerisiResponse value) {
        return new JAXBElement<BacaLotTerisiResponse>(_BacaLotTerisiResponse_QNAME, BacaLotTerisiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BacaParkiran }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BacaParkiran }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.testlogin.com/", name = "BacaParkiran")
    public JAXBElement<BacaParkiran> createBacaParkiran(BacaParkiran value) {
        return new JAXBElement<BacaParkiran>(_BacaParkiran_QNAME, BacaParkiran.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BacaParkiranResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BacaParkiranResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.testlogin.com/", name = "BacaParkiranResponse")
    public JAXBElement<BacaParkiranResponse> createBacaParkiranResponse(BacaParkiranResponse value) {
        return new JAXBElement<BacaParkiranResponse>(_BacaParkiranResponse_QNAME, BacaParkiranResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CariIDUser }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CariIDUser }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.testlogin.com/", name = "CariIDUser")
    public JAXBElement<CariIDUser> createCariIDUser(CariIDUser value) {
        return new JAXBElement<CariIDUser>(_CariIDUser_QNAME, CariIDUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CariIDUserResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CariIDUserResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.testlogin.com/", name = "CariIDUserResponse")
    public JAXBElement<CariIDUserResponse> createCariIDUserResponse(CariIDUserResponse value) {
        return new JAXBElement<CariIDUserResponse>(_CariIDUserResponse_QNAME, CariIDUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckRegister }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CheckRegister }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.testlogin.com/", name = "CheckRegister")
    public JAXBElement<CheckRegister> createCheckRegister(CheckRegister value) {
        return new JAXBElement<CheckRegister>(_CheckRegister_QNAME, CheckRegister.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckRegisterResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CheckRegisterResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.testlogin.com/", name = "CheckRegisterResponse")
    public JAXBElement<CheckRegisterResponse> createCheckRegisterResponse(CheckRegisterResponse value) {
        return new JAXBElement<CheckRegisterResponse>(_CheckRegisterResponse_QNAME, CheckRegisterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateKapasitasAcara }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateKapasitasAcara }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.testlogin.com/", name = "UpdateKapasitasAcara")
    public JAXBElement<UpdateKapasitasAcara> createUpdateKapasitasAcara(UpdateKapasitasAcara value) {
        return new JAXBElement<UpdateKapasitasAcara>(_UpdateKapasitasAcara_QNAME, UpdateKapasitasAcara.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateKapasitasAcaraResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateKapasitasAcaraResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.testlogin.com/", name = "UpdateKapasitasAcaraResponse")
    public JAXBElement<UpdateKapasitasAcaraResponse> createUpdateKapasitasAcaraResponse(UpdateKapasitasAcaraResponse value) {
        return new JAXBElement<UpdateKapasitasAcaraResponse>(_UpdateKapasitasAcaraResponse_QNAME, UpdateKapasitasAcaraResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStatusToClaim }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateStatusToClaim }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.testlogin.com/", name = "UpdateStatusToClaim")
    public JAXBElement<UpdateStatusToClaim> createUpdateStatusToClaim(UpdateStatusToClaim value) {
        return new JAXBElement<UpdateStatusToClaim>(_UpdateStatusToClaim_QNAME, UpdateStatusToClaim.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStatusToClaimResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateStatusToClaimResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.testlogin.com/", name = "UpdateStatusToClaimResponse")
    public JAXBElement<UpdateStatusToClaimResponse> createUpdateStatusToClaimResponse(UpdateStatusToClaimResponse value) {
        return new JAXBElement<UpdateStatusToClaimResponse>(_UpdateStatusToClaimResponse_QNAME, UpdateStatusToClaimResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BacaIdLokasi }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BacaIdLokasi }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.testlogin.com/", name = "bacaIdLokasi")
    public JAXBElement<BacaIdLokasi> createBacaIdLokasi(BacaIdLokasi value) {
        return new JAXBElement<BacaIdLokasi>(_BacaIdLokasi_QNAME, BacaIdLokasi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BacaIdLokasiResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BacaIdLokasiResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.testlogin.com/", name = "bacaIdLokasiResponse")
    public JAXBElement<BacaIdLokasiResponse> createBacaIdLokasiResponse(BacaIdLokasiResponse value) {
        return new JAXBElement<BacaIdLokasiResponse>(_BacaIdLokasiResponse_QNAME, BacaIdLokasiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BacaJumTiket }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BacaJumTiket }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.testlogin.com/", name = "bacaJumTiket")
    public JAXBElement<BacaJumTiket> createBacaJumTiket(BacaJumTiket value) {
        return new JAXBElement<BacaJumTiket>(_BacaJumTiket_QNAME, BacaJumTiket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BacaJumTiketResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BacaJumTiketResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.testlogin.com/", name = "bacaJumTiketResponse")
    public JAXBElement<BacaJumTiketResponse> createBacaJumTiketResponse(BacaJumTiketResponse value) {
        return new JAXBElement<BacaJumTiketResponse>(_BacaJumTiketResponse_QNAME, BacaJumTiketResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CariIdAcara }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CariIdAcara }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.testlogin.com/", name = "cariIdAcara")
    public JAXBElement<CariIdAcara> createCariIdAcara(CariIdAcara value) {
        return new JAXBElement<CariIdAcara>(_CariIdAcara_QNAME, CariIdAcara.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CariIdAcaraResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CariIdAcaraResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.testlogin.com/", name = "cariIdAcaraResponse")
    public JAXBElement<CariIdAcaraResponse> createCariIdAcaraResponse(CariIdAcaraResponse value) {
        return new JAXBElement<CariIdAcaraResponse>(_CariIdAcaraResponse_QNAME, CariIdAcaraResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckLogin }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CheckLogin }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.testlogin.com/", name = "checkLogin")
    public JAXBElement<CheckLogin> createCheckLogin(CheckLogin value) {
        return new JAXBElement<CheckLogin>(_CheckLogin_QNAME, CheckLogin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckLoginResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CheckLoginResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.testlogin.com/", name = "checkLoginResponse")
    public JAXBElement<CheckLoginResponse> createCheckLoginResponse(CheckLoginResponse value) {
        return new JAXBElement<CheckLoginResponse>(_CheckLoginResponse_QNAME, CheckLoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDaftarAcara }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDaftarAcara }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.testlogin.com/", name = "getDaftarAcara")
    public JAXBElement<GetDaftarAcara> createGetDaftarAcara(GetDaftarAcara value) {
        return new JAXBElement<GetDaftarAcara>(_GetDaftarAcara_QNAME, GetDaftarAcara.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDaftarAcaraResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDaftarAcaraResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.testlogin.com/", name = "getDaftarAcaraResponse")
    public JAXBElement<GetDaftarAcaraResponse> createGetDaftarAcaraResponse(GetDaftarAcaraResponse value) {
        return new JAXBElement<GetDaftarAcaraResponse>(_GetDaftarAcaraResponse_QNAME, GetDaftarAcaraResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTickets }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTickets }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.testlogin.com/", name = "getTickets")
    public JAXBElement<GetTickets> createGetTickets(GetTickets value) {
        return new JAXBElement<GetTickets>(_GetTickets_QNAME, GetTickets.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTicketsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTicketsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.testlogin.com/", name = "getTicketsResponse")
    public JAXBElement<GetTicketsResponse> createGetTicketsResponse(GetTicketsResponse value) {
        return new JAXBElement<GetTicketsResponse>(_GetTicketsResponse_QNAME, GetTicketsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.testlogin.com/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.testlogin.com/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InsertData }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.testlogin.com/", name = "insertData")
    public JAXBElement<InsertData> createInsertData(InsertData value) {
        return new JAXBElement<InsertData>(_InsertData_QNAME, InsertData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertDataResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InsertDataResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.testlogin.com/", name = "insertDataResponse")
    public JAXBElement<InsertDataResponse> createInsertDataResponse(InsertDataResponse value) {
        return new JAXBElement<InsertDataResponse>(_InsertDataResponse_QNAME, InsertDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertReservasiAcara }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InsertReservasiAcara }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.testlogin.com/", name = "insertReservasiAcara")
    public JAXBElement<InsertReservasiAcara> createInsertReservasiAcara(InsertReservasiAcara value) {
        return new JAXBElement<InsertReservasiAcara>(_InsertReservasiAcara_QNAME, InsertReservasiAcara.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertReservasiAcaraResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InsertReservasiAcaraResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.testlogin.com/", name = "insertReservasiAcaraResponse")
    public JAXBElement<InsertReservasiAcaraResponse> createInsertReservasiAcaraResponse(InsertReservasiAcaraResponse value) {
        return new JAXBElement<InsertReservasiAcaraResponse>(_InsertReservasiAcaraResponse_QNAME, InsertReservasiAcaraResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertReservasiTiket }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InsertReservasiTiket }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.testlogin.com/", name = "insertReservasiTiket")
    public JAXBElement<InsertReservasiTiket> createInsertReservasiTiket(InsertReservasiTiket value) {
        return new JAXBElement<InsertReservasiTiket>(_InsertReservasiTiket_QNAME, InsertReservasiTiket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertReservasiTiketResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InsertReservasiTiketResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.testlogin.com/", name = "insertReservasiTiketResponse")
    public JAXBElement<InsertReservasiTiketResponse> createInsertReservasiTiketResponse(InsertReservasiTiketResponse value) {
        return new JAXBElement<InsertReservasiTiketResponse>(_InsertReservasiTiketResponse_QNAME, InsertReservasiTiketResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertReservationParkir }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InsertReservationParkir }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.testlogin.com/", name = "insertReservationParkir")
    public JAXBElement<InsertReservationParkir> createInsertReservationParkir(InsertReservationParkir value) {
        return new JAXBElement<InsertReservationParkir>(_InsertReservationParkir_QNAME, InsertReservationParkir.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertReservationParkirResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InsertReservationParkirResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.testlogin.com/", name = "insertReservationParkirResponse")
    public JAXBElement<InsertReservationParkirResponse> createInsertReservationParkirResponse(InsertReservationParkirResponse value) {
        return new JAXBElement<InsertReservationParkirResponse>(_InsertReservationParkirResponse_QNAME, InsertReservationParkirResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReservasiBaru }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReservasiBaru }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.testlogin.com/", name = "reservasiBaru")
    public JAXBElement<ReservasiBaru> createReservasiBaru(ReservasiBaru value) {
        return new JAXBElement<ReservasiBaru>(_ReservasiBaru_QNAME, ReservasiBaru.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReservasiBaruResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReservasiBaruResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.testlogin.com/", name = "reservasiBaruResponse")
    public JAXBElement<ReservasiBaruResponse> createReservasiBaruResponse(ReservasiBaruResponse value) {
        return new JAXBElement<ReservasiBaruResponse>(_ReservasiBaruResponse_QNAME, ReservasiBaruResponse.class, null, value);
    }

}
