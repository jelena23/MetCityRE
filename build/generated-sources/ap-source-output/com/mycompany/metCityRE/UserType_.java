package com.mycompany.metCityRE;

import com.mycompany.metCityRE.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-17T15:37:04")
@StaticMetamodel(UserType.class)
public class UserType_ { 

    public static volatile SingularAttribute<UserType, Integer> idUserType;
    public static volatile SingularAttribute<UserType, String> userTypeName;
    public static volatile CollectionAttribute<UserType, User> userCollection;
    public static volatile SingularAttribute<UserType, String> userTypeDescription;

}