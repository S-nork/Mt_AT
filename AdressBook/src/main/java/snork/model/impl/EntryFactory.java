/*
 *
 * =======================================================================
 *
 * Copyright (c) 2009-2016 Sony Network Entertainment, Inc. All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Sony Network Entertainment, Inc.
 * You shall not disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into with
 * Sony Network Entertainment, Inc.
 *
 * =======================================================================
 *
 * For more information, please see http://www.sony.com/SCA/outline/corporation.shtml
 *
 */
package snork.model.impl;

import snork.model.Address;
import snork.model.Entry;
import snork.model.Phone;
import snork.model.impl.SimpleEntry;

public class EntryFactory {

    public static Entry getEntry ( String name, Address addres, Phone phone){

        return new SimpleEntry(name, addres,phone);
    }

}
