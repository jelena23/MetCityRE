/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.metCityRE;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jelena
 */
@Entity
@Table(name = "salesAgreement")
@XmlRootElement
@NamedQueries(
{
    @NamedQuery(name = "SalesAgreement.findAll", query = "SELECT s FROM SalesAgreement s")
    , @NamedQuery(name = "SalesAgreement.findByIdSalesAgreement", query = "SELECT s FROM SalesAgreement s WHERE s.idSalesAgreement = :idSalesAgreement")
    , @NamedQuery(name = "SalesAgreement.findByDateOfConclusion", query = "SELECT s FROM SalesAgreement s WHERE s.dateOfConclusion = :dateOfConclusion")
    , @NamedQuery(name = "SalesAgreement.findByCommission", query = "SELECT s FROM SalesAgreement s WHERE s.commission = :commission")
    , @NamedQuery(name = "SalesAgreement.findByPurchasePrice", query = "SELECT s FROM SalesAgreement s WHERE s.purchasePrice = :purchasePrice")
})
public class SalesAgreement implements Serializable
{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idSalesAgreement")
    private Integer idSalesAgreement;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dateOfConclusion")
    @Temporal(TemporalType.DATE)
    private Date dateOfConclusion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "commission")
    private double commission;
    @Basic(optional = false)
    @NotNull
    @Column(name = "purchasePrice")
    private double purchasePrice;
    @JoinColumn(name = "buyer", referencedColumnName = "idUser")
    @ManyToOne(optional = false)
    private User buyer;
    @JoinColumn(name = "idRealEstate", referencedColumnName = "idRealEstate")
    @ManyToOne(optional = false)
    private RealEstate idRealEstate;

    public SalesAgreement()
    {
    }

    public SalesAgreement(Integer idSalesAgreement)
    {
        this.idSalesAgreement = idSalesAgreement;
    }

    public SalesAgreement(Integer idSalesAgreement, Date dateOfConclusion, double commission, double purchasePrice)
    {
        this.idSalesAgreement = idSalesAgreement;
        this.dateOfConclusion = dateOfConclusion;
        this.commission = commission;
        this.purchasePrice = purchasePrice;
    }

    public Integer getIdSalesAgreement()
    {
        return idSalesAgreement;
    }

    public void setIdSalesAgreement(Integer idSalesAgreement)
    {
        this.idSalesAgreement = idSalesAgreement;
    }

    public Date getDateOfConclusion()
    {
        return dateOfConclusion;
    }

    public void setDateOfConclusion(Date dateOfConclusion)
    {
        this.dateOfConclusion = dateOfConclusion;
    }

    public double getCommission()
    {
        return commission;
    }

    public void setCommission(double commission)
    {
        this.commission = commission;
    }

    public double getPurchasePrice()
    {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice)
    {
        this.purchasePrice = purchasePrice;
    }

    public User getBuyer()
    {
        return buyer;
    }

    public void setBuyer(User buyer)
    {
        this.buyer = buyer;
    }

    public RealEstate getIdRealEstate()
    {
        return idRealEstate;
    }

    public void setIdRealEstate(RealEstate idRealEstate)
    {
        this.idRealEstate = idRealEstate;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (idSalesAgreement != null ? idSalesAgreement.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SalesAgreement))
        {
            return false;
        }
        SalesAgreement other = (SalesAgreement) object;
        if ((this.idSalesAgreement == null && other.idSalesAgreement != null) || (this.idSalesAgreement != null && !this.idSalesAgreement.equals(other.idSalesAgreement)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "com.mycompany.metCityRE.SalesAgreement[ idSalesAgreement=" + idSalesAgreement + " ]";
    }
    
}
