
package mypackage;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Convert complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>{@code
 * <complexType name="Convert">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="mantant" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Convert", propOrder = {
    "mantant"
})
public class Convert {

    protected double mantant;

    /**
     * Obtient la valeur de la propri�t� mantant.
     * 
     */
    public double getMantant() {
        return mantant;
    }

    /**
     * D�finit la valeur de la propri�t� mantant.
     * 
     */
    public void setMantant(double value) {
        this.mantant = value;
    }

}
