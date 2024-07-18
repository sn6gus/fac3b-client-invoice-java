
package mx.gob.sat.cartaporte31;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MercanciasCartaPorte31 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MercanciasCartaPorte31"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Mercancia" type="{http://www.sat.gob.mx/CartaPorte31}MercanciaCartaPorte31" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Autotransporte" type="{http://www.sat.gob.mx/CartaPorte31}AutotransporteCartaPorte31" minOccurs="0"/&gt;
 *         &lt;element name="TransporteMaritimo" type="{http://www.sat.gob.mx/CartaPorte31}TransporteMaritimoCartaPorte31" minOccurs="0"/&gt;
 *         &lt;element name="TransporteAereo" type="{http://www.sat.gob.mx/CartaPorte31}TransporteAereoCartaPorte31" minOccurs="0"/&gt;
 *         &lt;element name="TransporteFerroviario" type="{http://www.sat.gob.mx/CartaPorte31}TransporteFerroviarioCartaPorte31" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="PesoBrutoTotal" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="UnidadPeso" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PesoNetoTotal" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NumTotalMercancias" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CargoPorTasacion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="LogisticaInversaRecoleccionDevolucion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MercanciasCartaPorte31", propOrder = {
    "mercancia",
    "autotransporte",
    "transporteMaritimo",
    "transporteAereo",
    "transporteFerroviario"
})
public class MercanciasCartaPorte31 {

    @XmlElement(name = "Mercancia")
    protected List<MercanciaCartaPorte31> mercancia;
    @XmlElement(name = "Autotransporte")
    protected AutotransporteCartaPorte31 autotransporte;
    @XmlElement(name = "TransporteMaritimo")
    protected TransporteMaritimoCartaPorte31 transporteMaritimo;
    @XmlElement(name = "TransporteAereo")
    protected TransporteAereoCartaPorte31 transporteAereo;
    @XmlElement(name = "TransporteFerroviario")
    protected TransporteFerroviarioCartaPorte31 transporteFerroviario;
    @XmlAttribute(name = "PesoBrutoTotal")
    protected String pesoBrutoTotal;
    @XmlAttribute(name = "UnidadPeso")
    protected String unidadPeso;
    @XmlAttribute(name = "PesoNetoTotal")
    protected String pesoNetoTotal;
    @XmlAttribute(name = "NumTotalMercancias")
    protected String numTotalMercancias;
    @XmlAttribute(name = "CargoPorTasacion")
    protected String cargoPorTasacion;
    @XmlAttribute(name = "LogisticaInversaRecoleccionDevolucion")
    protected String logisticaInversaRecoleccionDevolucion;

    /**
     * Gets the value of the mercancia property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mercancia property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMercancia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MercanciaCartaPorte31 }
     * 
     * 
     */
    public List<MercanciaCartaPorte31> getMercancia() {
        if (mercancia == null) {
            mercancia = new ArrayList<MercanciaCartaPorte31>();
        }
        return this.mercancia;
    }

    /**
     * Obtiene el valor de la propiedad autotransporte.
     * 
     * @return
     *     possible object is
     *     {@link AutotransporteCartaPorte31 }
     *     
     */
    public AutotransporteCartaPorte31 getAutotransporte() {
        return autotransporte;
    }

    /**
     * Define el valor de la propiedad autotransporte.
     * 
     * @param value
     *     allowed object is
     *     {@link AutotransporteCartaPorte31 }
     *     
     */
    public void setAutotransporte(AutotransporteCartaPorte31 value) {
        this.autotransporte = value;
    }

    /**
     * Obtiene el valor de la propiedad transporteMaritimo.
     * 
     * @return
     *     possible object is
     *     {@link TransporteMaritimoCartaPorte31 }
     *     
     */
    public TransporteMaritimoCartaPorte31 getTransporteMaritimo() {
        return transporteMaritimo;
    }

    /**
     * Define el valor de la propiedad transporteMaritimo.
     * 
     * @param value
     *     allowed object is
     *     {@link TransporteMaritimoCartaPorte31 }
     *     
     */
    public void setTransporteMaritimo(TransporteMaritimoCartaPorte31 value) {
        this.transporteMaritimo = value;
    }

    /**
     * Obtiene el valor de la propiedad transporteAereo.
     * 
     * @return
     *     possible object is
     *     {@link TransporteAereoCartaPorte31 }
     *     
     */
    public TransporteAereoCartaPorte31 getTransporteAereo() {
        return transporteAereo;
    }

    /**
     * Define el valor de la propiedad transporteAereo.
     * 
     * @param value
     *     allowed object is
     *     {@link TransporteAereoCartaPorte31 }
     *     
     */
    public void setTransporteAereo(TransporteAereoCartaPorte31 value) {
        this.transporteAereo = value;
    }

    /**
     * Obtiene el valor de la propiedad transporteFerroviario.
     * 
     * @return
     *     possible object is
     *     {@link TransporteFerroviarioCartaPorte31 }
     *     
     */
    public TransporteFerroviarioCartaPorte31 getTransporteFerroviario() {
        return transporteFerroviario;
    }

    /**
     * Define el valor de la propiedad transporteFerroviario.
     * 
     * @param value
     *     allowed object is
     *     {@link TransporteFerroviarioCartaPorte31 }
     *     
     */
    public void setTransporteFerroviario(TransporteFerroviarioCartaPorte31 value) {
        this.transporteFerroviario = value;
    }

    /**
     * Obtiene el valor de la propiedad pesoBrutoTotal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPesoBrutoTotal() {
        return pesoBrutoTotal;
    }

    /**
     * Define el valor de la propiedad pesoBrutoTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPesoBrutoTotal(String value) {
        this.pesoBrutoTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad unidadPeso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidadPeso() {
        return unidadPeso;
    }

    /**
     * Define el valor de la propiedad unidadPeso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidadPeso(String value) {
        this.unidadPeso = value;
    }

    /**
     * Obtiene el valor de la propiedad pesoNetoTotal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPesoNetoTotal() {
        return pesoNetoTotal;
    }

    /**
     * Define el valor de la propiedad pesoNetoTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPesoNetoTotal(String value) {
        this.pesoNetoTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad numTotalMercancias.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumTotalMercancias() {
        return numTotalMercancias;
    }

    /**
     * Define el valor de la propiedad numTotalMercancias.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumTotalMercancias(String value) {
        this.numTotalMercancias = value;
    }

    /**
     * Obtiene el valor de la propiedad cargoPorTasacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCargoPorTasacion() {
        return cargoPorTasacion;
    }

    /**
     * Define el valor de la propiedad cargoPorTasacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCargoPorTasacion(String value) {
        this.cargoPorTasacion = value;
    }

    /**
     * Obtiene el valor de la propiedad logisticaInversaRecoleccionDevolucion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogisticaInversaRecoleccionDevolucion() {
        return logisticaInversaRecoleccionDevolucion;
    }

    /**
     * Define el valor de la propiedad logisticaInversaRecoleccionDevolucion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogisticaInversaRecoleccionDevolucion(String value) {
        this.logisticaInversaRecoleccionDevolucion = value;
    }

}
