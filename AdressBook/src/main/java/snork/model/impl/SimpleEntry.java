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

public class SimpleEntry implements Entry{

    private String name;
    private Address address;
    private Phone phone;

    SimpleEntry (String name, Address address, Phone phone){
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public Phone getPhone() {
        return phone;
    }
}
