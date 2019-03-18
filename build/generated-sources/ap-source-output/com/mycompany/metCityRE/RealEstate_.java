package com.mycompany.metCityRE;

import com.mycompany.metCityRE.Municipality;
import com.mycompany.metCityRE.RealEstateType;
import com.mycompany.metCityRE.RentalAgreement;
import com.mycompany.metCityRE.SalesAgreement;
import com.mycompany.metCityRE.Type;
import com.mycompany.metCityRE.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-17T15:37:04")
@StaticMetamodel(RealEstate.class)
public class RealEstate_ { 

    public static volatile SingularAttribute<RealEstate, String> address;
    public static volatile SingularAttribute<RealEstate, Type> idType;
    public static volatile SingularAttribute<RealEstate, Integer> numOfBathrooms;
    public static volatile SingularAttribute<RealEstate, User> idUser;
    public static volatile SingularAttribute<RealEstate, Integer> idRealEstate;
    public static volatile SingularAttribute<RealEstate, Municipality> idMunicipality;
    public static volatile SingularAttribute<RealEstate, Double> size;
    public static volatile SingularAttribute<RealEstate, Double> price;
    public static volatile CollectionAttribute<RealEstate, SalesAgreement> salesAgreementCollection;
    public static volatile SingularAttribute<RealEstate, RealEstateType> idRealEstateType;
    public static volatile SingularAttribute<RealEstate, Double> ceilingHeight;
    public static volatile SingularAttribute<RealEstate, Integer> numOfRooms;
    public static volatile SingularAttribute<RealEstate, Integer> floor;
    public static volatile SingularAttribute<RealEstate, String> heating;
    public static volatile CollectionAttribute<RealEstate, RentalAgreement> rentalAgreementCollection;

}