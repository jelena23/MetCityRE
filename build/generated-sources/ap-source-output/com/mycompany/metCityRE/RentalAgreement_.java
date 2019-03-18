package com.mycompany.metCityRE;

import com.mycompany.metCityRE.RealEstate;
import com.mycompany.metCityRE.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-17T15:37:04")
@StaticMetamodel(RentalAgreement.class)
public class RentalAgreement_ { 

    public static volatile SingularAttribute<RentalAgreement, RealEstate> idRealEstate;
    public static volatile SingularAttribute<RentalAgreement, Integer> idRentalAgreement;
    public static volatile SingularAttribute<RentalAgreement, Date> validUntil;
    public static volatile SingularAttribute<RentalAgreement, Double> deposit;
    public static volatile SingularAttribute<RentalAgreement, Date> validFrom;
    public static volatile SingularAttribute<RentalAgreement, Double> monthlyPrice;
    public static volatile SingularAttribute<RentalAgreement, User> tenant;

}