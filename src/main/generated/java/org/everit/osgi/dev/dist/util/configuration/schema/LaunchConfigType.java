/*
 * Copyright (C) 2011 Everit Kft. (http://www.everit.biz)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.02 at 10:57:33 AM CEST 
//


package org.everit.osgi.dev.dist.util.configuration.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LaunchConfigType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LaunchConfigType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://everit.org/eosgi/dist/definition/4.0.0}AbstractLaunchConfigType">
 *       &lt;sequence>
 *         &lt;element name="overrides" type="{http://everit.org/eosgi/dist/definition/4.0.0}LaunchConfigOverridesType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="mainClass" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="classPath" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LaunchConfigType", propOrder = {
    "overrides"
})
public class LaunchConfigType
    extends AbstractLaunchConfigType
{

    protected LaunchConfigOverridesType overrides;
    @XmlAttribute(name = "mainClass", required = true)
    protected String mainClass;
    @XmlAttribute(name = "classPath")
    protected String classPath;

    /**
     * Gets the value of the overrides property.
     * 
     * @return
     *     possible object is
     *     {@link LaunchConfigOverridesType }
     *     
     */
    public LaunchConfigOverridesType getOverrides() {
        return overrides;
    }

    /**
     * Sets the value of the overrides property.
     * 
     * @param value
     *     allowed object is
     *     {@link LaunchConfigOverridesType }
     *     
     */
    public void setOverrides(LaunchConfigOverridesType value) {
        this.overrides = value;
    }

    /**
     * Gets the value of the mainClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainClass() {
        return mainClass;
    }

    /**
     * Sets the value of the mainClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainClass(String value) {
        this.mainClass = value;
    }

    /**
     * Gets the value of the classPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassPath() {
        return classPath;
    }

    /**
     * Sets the value of the classPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassPath(String value) {
        this.classPath = value;
    }

}
