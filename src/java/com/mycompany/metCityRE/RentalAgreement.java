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
@Table(name = "rentalAgreement")
@XmlRootElement
@NamedQueries(
{
    @NamedQuery(name = "RentalAgreement.findAll", query = "SELECT r FROM RentalAgreement r")
    , @NamedQuery(name = "RentalAgreement.findByIdRentalAgreement", query = "SELECT r FROM RentalAgreement r WHERE r.idRentalAgreement = :idRentalAgreement")
    , @NamedQuery(name = "RentalAgreement.findByValidFrom", query = "SELECT r FROM RentalAgreement r WHERE r.validFrom = :validFrom")
    , @NamedQuery(name = "RentalAgreement.findByValidUntil", query = "SELECT r FROM RentalAgreement r WHERE r.validUntil = :validUntil")
    , @NamedQuery(name = "RentalAgreement.findByMonthlyPrice", query = "SELECT r FROM RentalAgreement r WHERE r.monthlyPrice = :monthlyPrice")
    , @NamedQuery(name = "RentalAgreement.findByDeposit", query = "SELECT r FROM RentalAgreement r WHERE r.deposit = :deposit")
})
public class RentalAgreement implements Serializable
{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idRentalAgreement")
    private Integer idRentalAgreement;
    @Basic(optional = false)
    @NotNull
    @Column(name = "validFrom")
    @Temporal(TemporalType.DATE)
    private Date validFrom;
    @Basic(optional = false)
    @NotNull
    @Column(name = "validUntil")
    @Temporal(TemporalType.DATE)
    private Date validUntil;
    @Basic(optional = false)
    @NotNull
    @Column(name = "monthlyPrice")
    private double monthlyPrice;
    @Basic(optional = false)
    @NotNull
    @Column(name = "deposit")
    private double deposit;
    @JoinColumn(name = "tenant", referencedColumnName = "idUser")
    @ManyToOne(optional = false)
    private User tenant;
    @JoinColumn(name = "idRealEstate", referencedColumnName = "idRealEstate")
    @ManyToOne(optional = false)
    private RealEstate idRealEstate;

    public RentalAgreement()
    {
    }

    public RentalAgreement(Integer idRentalAgreement)
    {
        this.idRentalAgreement = idRentalAgreement;
    }

    public RentalAgreement(Integer idRentalAgreement, Date validFrom, Date validUntil, double monthlyPrice, double deposit)
    {
        this.idRentalAgreement = idRentalAgreement;
        this.validFrom = validFrom;
        this.validUntil = validUntil;
        this.monthlyPrice = monthlyPrice;
        this.deposit = deposit;
    }

    public Integer getIdRentalAgreement()
    {
        return idRentalAgreement;
    }

    public void setIdRentalAgreement(Integer idRentalAgreement)
    {
        this.idRentalAgreement = idRentalAgreement;
    }

    public Date getValidFrom()
    {
        return validFrom;
    }

    public void setValidFrom(Date validFrom)
    {
        this.validFrom = validFrom;
    }

    public Date getValidUntil()
    {
        return validUntil;
    }

    public void setValidUntil(Date validUntil)
    {
        this.validUntil = validUntil;
    }

    public double getMonthlyPrice()
    {
        return monthlyPrice;
    }

    public void setMonthlyPrice(double monthlyPrice)
    {
        this.monthlyPrice = monthlyPrice;
    }

    public double getDeposit()
    {
        return deposit;
    }

    public void setDeposit(double deposit)
    {
        this.deposit = deposit;
    }

    public User getTenant()
    {
        return tenant;
    }

    public void setTenant(User tenant)
    {
        this.tenant = tenant;
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
        hash += (idRentalAgreement != null ? idRentalAgreement.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RentalAgreement))
        {
            return false;
        }
        RentalAgreement other = (RentalAgreement) object;
        if ((this.idRentalAgreement == null && other.idRentalAgreement != null) || (this.idRentalAgreement != null && !this.idRentalAgreement.equals(other.idRentalAgreement)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "com.mycompany.metCityRE.RentalAgreement[ idRentalAgreement=" + idRentalAgreement + " ]";
    }
    
}
