/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creating.www.resource.bundle;

import java.util.ListResourceBundle;

/**
 *
 * @author Administrator
 */
public class Msg_en_US extends ListResourceBundle{

    @Override
    protected Object[][] getContents() {
   return new String[][]{{"hello","hi"},{"world","world"}};
    }
    
}
