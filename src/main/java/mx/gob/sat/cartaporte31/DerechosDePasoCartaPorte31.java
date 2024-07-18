
package mx.gob.sat.cartaporte31;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DerechosDePasoCartaPorte31 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DerechosDePasoCartaPorte31"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="TipoDerechoDePaso" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="KilometrajePagado" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DerechosDePasoCartaPorte31")
public class DerechosDePasoCartaPorte31 {

    @XmlAttribute(name = "TipoDerechoDePaso")
    protected String tipoDerechoDePaso;
    @XmlAttribute(name = "KilometrajePagado")
    protected String kilometrajePagado;

    /**
     * Obtiene el valor de la propiedad tipoDerechoDePaso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDerechoDePaso() {
        return tipoDerechoDePaso;
    }

    /**
     * Define el valor de la propiedad tipoDerechoDePaso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDerechoDePaso(String value) {
        this.tipoDerechoDePaso = value;
    }

    /**
     * Obtiene el valor de la propiedad kilometrajePagado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKilometrajePagado() {
        return kilometrajePagado;
    }

    /**
     * Define el valor de la propiedad kilometrajePagado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKilometrajePagado(String value) {
        this.kilometrajePagado = value;
    }

}
