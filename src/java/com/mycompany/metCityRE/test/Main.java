/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.metCityRE.test;

import com.mycompany.metCityRE.jaxrs.UserClient;

/**
 *
 * @author jelena
 */
public class Main
{
    public static void main(String[] args)
    {
        UserClient userClient = new UserClient();
        String response = userClient.find_XML(
                String.class, "0");
        System.out.println("Odgovor je: " + response);
        userClient.close();
    }
}
