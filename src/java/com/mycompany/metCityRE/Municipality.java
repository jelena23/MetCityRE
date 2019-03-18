/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.metCityRE;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author jelena
 */
@Entity
@Table(name = "municipality")
@XmlRootElement
@NamedQueries(
{
    @NamedQuery(name = "Municipality.findAll", query = "SELECT m FROM Municipality m")
    , @NamedQuery(name = "Municipality.findByIdMunicipality", query = "SELECT m FROM Municipality m WHERE m.idMunicipality = :idMunicipality")
    , @NamedQuery(name = "Municipality.findByMunicipalityName", query = "SELECT m FROM Municipality m WHERE m.municipalityName = :municipalityName")
})
public class Municipality implements Serializable
{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idMunicipality")
    private Integer idMunicipality;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "municipalityName")
    private String municipalityName;
    @JoinColumn(name = "idCity", referencedColumnName = "idCity")
    @ManyToOne(optional = false)
    private City idCity;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMunicipality")
    private Collection<RealEstate> realEstateCollection;

    public Municipality()
    {
    }

    public Municipality(Integer idMunicipality)
    {
        this.idMunicipality = idMunicipality;
    }

    public Municipality(Integer idMunicipality, String municipalityName)
    {
        this.idMunicipality = idMunicipality;
        this.municipalityName = municipalityName;
    }

    public Integer getIdMunicipality()
    {
        return idMunicipality;
    }

    public void setIdMunicipality(Integer idMunicipality)
    {
        this.idMunicipality = idMunicipality;
    }

    public String getMunicipalityName()
    {
        return municipalityName;
    }

    public void setMunicipalityName(String municipalityName)
    {
        this.municipalityName = municipalityName;
    }

    public City getIdCity()
    {
        return idCity;
    }

    public void setIdCity(City idCity)
    {
        this.idCity = idCity;
    }

    @XmlTransient
    public Collection<RealEstate> getRealEstateCollection()
    {
        return realEstateCollection;
    }

    public void setRealEstateCollection(Collection<RealEstate> realEstateCollection)
    {
        this.realEstateCollection = realEstateCollection;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (idMunicipality != null ? idMunicipality.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Municipality))
        {
            return false;
        }
        Municipality other = (Municipality) object;
        if ((this.idMunicipality == null && other.idMunicipality != null) || (this.idMunicipality != null && !this.idMunicipality.equals(other.idMunicipality)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "com.mycompany.metCityRE.Municipality[ idMunicipality=" + idMunicipality + " ]";
    }
    
}
