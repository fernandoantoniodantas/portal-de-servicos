
package br.gov.servicos.v3.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TempoTotalEstimado complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TempoTotalEstimado"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="entre" type="{http://servicos.gov.br/v3/schema}Entre"/&gt;
 *           &lt;element name="ate" type="{http://servicos.gov.br/v3/schema}Ate"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="descricao" type="{http://servicos.gov.br/v3/schema}DescricaoDoTempoTotalEstimado"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TempoTotalEstimado", propOrder = {
    "entre",
    "ate",
    "descricao"
})
public class TempoTotalEstimado {

    protected Entre entre;
    protected Ate ate;
    @XmlElement(required = true)
    protected String descricao;

    /**
     * Gets the value of the entre property.
     * 
     * @return
     *     possible object is
     *     {@link Entre }
     *     
     */
    public Entre getEntre() {
        return entre;
    }

    /**
     * Sets the value of the entre property.
     * 
     * @param value
     *     allowed object is
     *     {@link Entre }
     *     
     */
    public void setEntre(Entre value) {
        this.entre = value;
    }

    /**
     * Gets the value of the ate property.
     * 
     * @return
     *     possible object is
     *     {@link Ate }
     *     
     */
    public Ate getAte() {
        return ate;
    }

    /**
     * Sets the value of the ate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ate }
     *     
     */
    public void setAte(Ate value) {
        this.ate = value;
    }

    /**
     * Gets the value of the descricao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Sets the value of the descricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricao(String value) {
        this.descricao = value;
    }

}