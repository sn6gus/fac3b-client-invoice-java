
package mx.gob.sat.cartaporte31;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CartaPorte31 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CartaPorte31"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RegimenesAduaneros" type="{http://www.sat.gob.mx/CartaPorte31}RegimenesAduanerosCartaPorte31" minOccurs="0"/&gt;
 *         &lt;element name="Ubicaciones" type="{http://www.sat.gob.mx/CartaPorte31}UbicacionesCartaPorte31" minOccurs="0"/&gt;
 *         &lt;element name="Mercancias" type="{http://www.sat.gob.mx/CartaPorte31}MercanciasCartaPorte31" minOccurs="0"/&gt;
 *         &lt;element name="FiguraTransporte" type="{http://www.sat.gob.mx/CartaPorte31}FiguraTransporteCartaPorte31" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TranspInternac" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="EntradaSalidaMerc" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PaisOrigenDestino" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ViaEntradaSalida" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TotalDistRec" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="IdCCP" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RegistroISTMO" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="UbicacionPoloOrigen" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="UbicacionPoloDestino" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CartaPorte31", propOrder = {
    "regimenesAduaneros",
    "ubicaciones",
    "mercancias",
    "figuraTransporte"
})
public class CartaPorte31 {

    @XmlElement(name = "RegimenesAduaneros")
    protected RegimenesAduanerosCartaPorte31 regimenesAduaneros;
    @XmlElement(name = "Ubicaciones")
    protected UbicacionesCartaPorte31 ubicaciones;
    @XmlElement(name = "Mercancias")
    protected MercanciasCartaPorte31 mercancias;
    @XmlElement(name = "FiguraTransporte")
    protected FiguraTransporteCartaPorte31 figuraTransporte;
    @XmlAttribute(name = "Version")
    protected String version;
    @XmlAttribute(name = "TranspInternac")
    protected String transpInternac;
    @XmlAttribute(name = "EntradaSalidaMerc")
    protected String entradaSalidaMerc;
    @XmlAttribute(name = "PaisOrigenDestino")
    protected String paisOrigenDestino;
    @XmlAttribute(name = "ViaEntradaSalida")
    protected String viaEntradaSalida;
    @XmlAttribute(name = "TotalDistRec")
    protected String totalDistRec;
    @XmlAttribute(name = "IdCCP")
    protected String idCCP;
    @XmlAttribute(name = "RegistroISTMO")
    protected String registroISTMO;
    @XmlAttribute(name = "UbicacionPoloOrigen")
    protected String ubicacionPoloOrigen;
    @XmlAttribute(name = "UbicacionPoloDestino")
    protected String ubicacionPoloDestino;

    /**
     * Obtiene el valor de la propiedad regimenesAduaneros.
     * 
     * @return
     *     possible object is
     *     {@link RegimenesAduanerosCartaPorte31 }
     *     
     */
    public RegimenesAduanerosCartaPorte31 getRegimenesAduaneros() {
        return regimenesAduaneros;
    }

    /**
     * Define el valor de la propiedad regimenesAduaneros.
     * 
     * @param value
     *     allowed object is
     *     {@link RegimenesAduanerosCartaPorte31 }
     *     
     */
    public void setRegimenesAduaneros(RegimenesAduanerosCartaPorte31 value) {
        this.regimenesAduaneros = value;
    }

    /**
     * Obtiene el valor de la propiedad ubicaciones.
     * 
     * @return
     *     possible object is
     *     {@link UbicacionesCartaPorte31 }
     *     
     */
    public UbicacionesCartaPorte31 getUbicaciones() {
        return ubicaciones;
    }

    /**
     * Define el valor de la propiedad ubicaciones.
     * 
     * @param value
     *     allowed object is
     *     {@link UbicacionesCartaPorte31 }
     *     
     */
    public void setUbicaciones(UbicacionesCartaPorte31 value) {
        this.ubicaciones = value;
    }

    /**
     * Obtiene el valor de la propiedad mercancias.
     * 
     * @return
     *     possible object is
     *     {@link MercanciasCartaPorte31 }
     *     
     */
    public MercanciasCartaPorte31 getMercancias() {
        return mercancias;
    }

    /**
     * Define el valor de la propiedad mercancias.
     * 
     * @param value
     *     allowed object is
     *     {@link MercanciasCartaPorte31 }
     *     
     */
    public void setMercancias(MercanciasCartaPorte31 value) {
        this.mercancias = value;
    }

    /**
     * Obtiene el valor de la propiedad figuraTransporte.
     * 
     * @return
     *     possible object is
     *     {@link FiguraTransporteCartaPorte31 }
     *     
     */
    public FiguraTransporteCartaPorte31 getFiguraTransporte() {
        return figuraTransporte;
    }

    /**
     * Define el valor de la propiedad figuraTransporte.
     * 
     * @param value
     *     allowed object is
     *     {@link FiguraTransporteCartaPorte31 }
     *     
     */
    public void setFiguraTransporte(FiguraTransporteCartaPorte31 value) {
        this.figuraTransporte = value;
    }

    /**
     * Obtiene el valor de la propiedad version.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Define el valor de la propiedad version.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Obtiene el valor de la propiedad transpInternac.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranspInternac() {
        return transpInternac;
    }

    /**
     * Define el valor de la propiedad transpInternac.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranspInternac(String value) {
        this.transpInternac = value;
    }

    /**
     * Obtiene el valor de la propiedad entradaSalidaMerc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntradaSalidaMerc() {
        return entradaSalidaMerc;
    }

    /**
     * Define el valor de la propiedad entradaSalidaMerc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntradaSalidaMerc(String value) {
        this.entradaSalidaMerc = value;
    }

    /**
     * Obtiene el valor de la propiedad paisOrigenDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisOrigenDestino() {
        return paisOrigenDestino;
    }

    /**
     * Define el valor de la propiedad paisOrigenDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisOrigenDestino(String value) {
        this.paisOrigenDestino = value;
    }

    /**
     * Obtiene el valor de la propiedad viaEntradaSalida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViaEntradaSalida() {
        return viaEntradaSalida;
    }

    /**
     * Define el valor de la propiedad viaEntradaSalida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViaEntradaSalida(String value) {
        this.viaEntradaSalida = value;
    }

    /**
     * Obtiene el valor de la propiedad totalDistRec.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalDistRec() {
        return totalDistRec;
    }

    /**
     * Define el valor de la propiedad totalDistRec.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalDistRec(String value) {
        this.totalDistRec = value;
    }

    /**
     * Obtiene el valor de la propiedad idCCP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCCP() {
        return idCCP;
    }

    /**
     * Define el valor de la propiedad idCCP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCCP(String value) {
        this.idCCP = value;
    }

    /**
     * Obtiene el valor de la propiedad registroISTMO.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistroISTMO() {
        return registroISTMO;
    }

    /**
     * Define el valor de la propiedad registroISTMO.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistroISTMO(String value) {
        this.registroISTMO = value;
    }

    /**
     * Obtiene el valor de la propiedad ubicacionPoloOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUbicacionPoloOrigen() {
        return ubicacionPoloOrigen;
    }

    /**
     * Define el valor de la propiedad ubicacionPoloOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUbicacionPoloOrigen(String value) {
        this.ubicacionPoloOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad ubicacionPoloDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUbicacionPoloDestino() {
        return ubicacionPoloDestino;
    }

    /**
     * Define el valor de la propiedad ubicacionPoloDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUbicacionPoloDestino(String value) {
        this.ubicacionPoloDestino = value;
    }

}
