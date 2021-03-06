/**
 * GetSchemaDataSet_Output.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.FDIWebServices;

public class GetSchemaDataSet_Output  implements java.io.Serializable {
    private java.lang.String codEsito;

    private java.lang.String descEsito;

    private org.datacontract.schemas._2004._07.FDIWebServices.Field[] fields;

    private java.lang.Integer schemaCode;

    public GetSchemaDataSet_Output() {
    }

    public GetSchemaDataSet_Output(
           java.lang.String codEsito,
           java.lang.String descEsito,
           org.datacontract.schemas._2004._07.FDIWebServices.Field[] fields,
           java.lang.Integer schemaCode) {
           this.codEsito = codEsito;
           this.descEsito = descEsito;
           this.fields = fields;
           this.schemaCode = schemaCode;
    }


    /**
     * Gets the codEsito value for this GetSchemaDataSet_Output.
     * 
     * @return codEsito
     */
    public java.lang.String getCodEsito() {
        return codEsito;
    }


    /**
     * Sets the codEsito value for this GetSchemaDataSet_Output.
     * 
     * @param codEsito
     */
    public void setCodEsito(java.lang.String codEsito) {
        this.codEsito = codEsito;
    }


    /**
     * Gets the descEsito value for this GetSchemaDataSet_Output.
     * 
     * @return descEsito
     */
    public java.lang.String getDescEsito() {
        return descEsito;
    }


    /**
     * Sets the descEsito value for this GetSchemaDataSet_Output.
     * 
     * @param descEsito
     */
    public void setDescEsito(java.lang.String descEsito) {
        this.descEsito = descEsito;
    }


    /**
     * Gets the fields value for this GetSchemaDataSet_Output.
     * 
     * @return fields
     */
    public org.datacontract.schemas._2004._07.FDIWebServices.Field[] getFields() {
        return fields;
    }


    /**
     * Sets the fields value for this GetSchemaDataSet_Output.
     * 
     * @param fields
     */
    public void setFields(org.datacontract.schemas._2004._07.FDIWebServices.Field[] fields) {
        this.fields = fields;
    }


    /**
     * Gets the schemaCode value for this GetSchemaDataSet_Output.
     * 
     * @return schemaCode
     */
    public java.lang.Integer getSchemaCode() {
        return schemaCode;
    }


    /**
     * Sets the schemaCode value for this GetSchemaDataSet_Output.
     * 
     * @param schemaCode
     */
    public void setSchemaCode(java.lang.Integer schemaCode) {
        this.schemaCode = schemaCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSchemaDataSet_Output)) return false;
        GetSchemaDataSet_Output other = (GetSchemaDataSet_Output) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codEsito==null && other.getCodEsito()==null) || 
             (this.codEsito!=null &&
              this.codEsito.equals(other.getCodEsito()))) &&
            ((this.descEsito==null && other.getDescEsito()==null) || 
             (this.descEsito!=null &&
              this.descEsito.equals(other.getDescEsito()))) &&
            ((this.fields==null && other.getFields()==null) || 
             (this.fields!=null &&
              java.util.Arrays.equals(this.fields, other.getFields()))) &&
            ((this.schemaCode==null && other.getSchemaCode()==null) || 
             (this.schemaCode!=null &&
              this.schemaCode.equals(other.getSchemaCode())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCodEsito() != null) {
            _hashCode += getCodEsito().hashCode();
        }
        if (getDescEsito() != null) {
            _hashCode += getDescEsito().hashCode();
        }
        if (getFields() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFields());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFields(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSchemaCode() != null) {
            _hashCode += getSchemaCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSchemaDataSet_Output.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/FDIWebServices", "GetSchemaDataSet_Output"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codEsito");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/FDIWebServices", "CodEsito"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descEsito");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/FDIWebServices", "DescEsito"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fields");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/FDIWebServices", "Fields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/FDIWebServices", "Field"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/FDIWebServices", "Field"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schemaCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/FDIWebServices", "SchemaCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
