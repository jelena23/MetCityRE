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
@Table(name = "city")
@XmlRootElement
@NamedQueries(
{
    @NamedQuery(name = "City.findAll", query = "SELECT c FROM City c")
    , @NamedQuery(name = "City.findByIdCity", query = "SELECT c FROM City c WHERE c.idCity = :idCity")
    , @NamedQuery(name = "City.findByCityName", query = "SELECT c FROM City c WHERE c.cityName = :cityName")
})
public class City implements Serializable
{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idCity")
    private Integer idCity;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "cityName")
    private String cityName;
    @JoinColumn(name = "idCountry", referencedColumnName = "idCountry")
    @ManyToOne(optional = false)
    private Country idCountry;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCity")
    private Collection<Municipality> municipalityCollection;

    public City()
    {
    }

    public City(Integer idCity)
    {
        this.idCity = idCity;
    }

    public City(Integer idCity, String cityName)
    {
        this.idCity = idCity;
        this.cityName = cityName;
    }

    public Integer getIdCity()
    {
        return idCity;
    }

    public void setIdCity(Integer idCity)
    {
        this.idCity = idCity;
    }

    public String getCityName()
    {
        return cityName;
    }

    public void setCityName(String cityName)
    {
        this.cityName = cityName;
    }

    public Country getIdCountry()
    {
        return idCountry;
    }

    public void setIdCountry(Country idCountry)
    {
        this.idCountry = idCountry;
    }

    @XmlTransient
    public Collection<Municipality> getMunicipalityCollection()
    {
        return municipalityCollection;
    }

    public void setMunicipalityCollection(Collection<Municipality> municipalityCollection)
    {
        this.municipalityCollection = municipalityCollection;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (idCity != null ? idCity.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof City))
        {
            return false;
        }
        City other = (City) object;
        if ((this.idCity == null && other.idCity != null) || (this.idCity != null && !this.idCity.equals(other.idCity)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "com.mycompany.metCityRE.City[ idCity=" + idCity + " ]";
    }
    
}
