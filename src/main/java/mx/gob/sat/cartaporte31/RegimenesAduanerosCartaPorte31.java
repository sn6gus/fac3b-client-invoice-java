
package mx.gob.sat.cartaporte31;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RegimenesAduanerosCartaPorte31 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RegimenesAduanerosCartaPorte31"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RegimenAduaneroCCP" type="{http://www.sat.gob.mx/CartaPorte31}RegimenAduaneroCartaPorte31" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegimenesAduanerosCartaPorte31", propOrder = {
    "regimenAduaneroCCP"
})
public class RegimenesAduanerosCartaPorte31 {

    @XmlElement(name = "RegimenAduaneroCCP")
    protected List<RegimenAduaneroCartaPorte31> regimenAduaneroCCP;

    /**
     * Gets the value of the regimenAduaneroCCP property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regimenAduaneroCCP property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegimenAduaneroCCP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegimenAduaneroCartaPorte31 }
     * 
     * 
     */
    public List<RegimenAduaneroCartaPorte31> getRegimenAduaneroCCP() {
        if (regimenAduaneroCCP == null) {
            regimenAduaneroCCP = new ArrayList<RegimenAduaneroCartaPorte31>();
        }
        return this.regimenAduaneroCCP;
    }

}
