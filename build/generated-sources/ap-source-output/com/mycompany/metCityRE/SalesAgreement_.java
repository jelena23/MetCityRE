package com.mycompany.metCityRE;

import com.mycompany.metCityRE.RealEstate;
import com.mycompany.metCityRE.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-17T15:37:04")
@StaticMetamodel(SalesAgreement.class)
public class SalesAgreement_ { 

    public static volatile SingularAttribute<SalesAgreement, RealEstate> idRealEstate;
    public static volatile SingularAttribute<SalesAgreement, Integer> idSalesAgreement;
    public static volatile SingularAttribute<SalesAgreement, Date> dateOfConclusion;
    public static volatile SingularAttribute<SalesAgreement, Double> commission;
    public static volatile SingularAttribute<SalesAgreement, Double> purchasePrice;
    public static volatile SingularAttribute<SalesAgreement, User> buyer;

}