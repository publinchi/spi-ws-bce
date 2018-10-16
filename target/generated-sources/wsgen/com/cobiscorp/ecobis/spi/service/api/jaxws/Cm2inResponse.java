
package com.cobiscorp.ecobis.spi.service.api.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "cm2inResponse", namespace = "http://api.service.spi.ecobis.cobiscorp.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cm2inResponse", namespace = "http://api.service.spi.ecobis.cobiscorp.com/")
public class Cm2inResponse {

    @XmlElement(name = "return", namespace = "")
    private double _return;

    /**
     * 
     * @return
     *     returns double
     */
    public double getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(double _return) {
        this._return = _return;
    }

}
