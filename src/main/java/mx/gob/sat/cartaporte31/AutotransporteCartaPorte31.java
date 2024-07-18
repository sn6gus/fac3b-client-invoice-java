
package mx.gob.sat.cartaporte31;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import mx.gob.sat.cartaporte20.Seguros;


/**
 * <p>Clase Java para AutotransporteCartaPorte31 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AutotransporteCartaPorte31"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IdentificacionVehicular" type="{http://www.sat.gob.mx/CartaPorte31}IdentificacionVehicularCartaPorte31" minOccurs="0"/&gt;
 *         &lt;element name="Seguros" type="{http://www.sat.gob.mx/CartaPorte20}Seguros" minOccurs="0"/&gt;
 *         &lt;element name="Remolques" type="{http://www.sat.gob.mx/CartaPorte31}RemolquesCartaPorte31" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="PermSCT" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NumPermisoSCT" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AutotransporteCartaPorte31", propOrder = {
    "identificacionVehicular",
    "seguros",
    "remolques"
})
public class AutotransporteCartaPorte31 {

    @XmlElement(name = "IdentificacionVehicular")
    protected IdentificacionVehicularCartaPorte31 identificacionVehicular;
    @XmlElement(name = "Seguros")
    protected Seguros seguros;
    @XmlElement(name = "Remolques")
    protected RemolquesCartaPorte31 remolques;
    @XmlAttribute(name = "PermSCT")
    protected String permSCT;
    @XmlAttribute(name = "NumPermisoSCT")
    protected String numPermisoSCT;

    /**
     * Obtiene el valor de la propiedad identificacionVehicular.
     * 
     * @return
     *     possible object is
     *     {@link IdentificacionVehicularCartaPorte31 }
     *     
     */
    public IdentificacionVehicularCartaPorte31 getIdentificacionVehicular() {
        return identificacionVehicular;
    }

    /**
     * Define el valor de la propiedad identificacionVehicular.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificacionVehicularCartaPorte31 }
     *     
     */
    public void setIdentificacionVehicular(IdentificacionVehicularCartaPorte31 value) {
        this.identificacionVehicular = value;
    }

    /**
     * Obtiene el valor de la propiedad seguros.
     * 
     * @return
     *     possible object is
     *     {@link Seguros }
     *     
     */
    public Seguros getSeguros() {
        return seguros;
    }

    /**
     * Define el valor de la propiedad seguros.
     * 
     * @param value
     *     allowed object is
     *     {@link Seguros }
     *     
     */
    public void setSeguros(Seguros value) {
        this.seguros = value;
    }

    /**
     * Obtiene el valor de la propiedad remolques.
     * 
     * @return
     *     possible object is
     *     {@link RemolquesCartaPorte31 }
     *     
     */
    public RemolquesCartaPorte31 getRemolques() {
        return remolques;
    }

    /**
     * Define el valor de la propiedad remolques.
     * 
     * @param value
     *     allowed object is
     *     {@link RemolquesCartaPorte31 }
     *     
     */
    public void setRemolques(RemolquesCartaPorte31 value) {
        this.remolques = value;
    }

    /**
     * Obtiene el valor de la propiedad permSCT.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermSCT() {
        return permSCT;
    }

    /**
     * Define el valor de la propiedad permSCT.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermSCT(String value) {
        this.permSCT = value;
    }

    /**
     * Obtiene el valor de la propiedad numPermisoSCT.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumPermisoSCT() {
        return numPermisoSCT;
    }

    /**
     * Define el valor de la propiedad numPermisoSCT.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumPermisoSCT(String value) {
        this.numPermisoSCT = value;
    }

}
