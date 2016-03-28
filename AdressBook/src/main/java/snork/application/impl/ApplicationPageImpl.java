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
package snork.application.impl;

import snork.application.AddressSection;
import snork.application.ApplicationPage;
import snork.application.NameSection;
import snork.application.PhoneSection;
import snork.model.Address;
import snork.model.Entry;
import snork.model.Phone;
import snork.model.impl.EntryFactory;
import snork.storage.impl.BookImpl;

public class ApplicationPageImpl implements ApplicationPage {

    private AddressSection addressSection;
    private PhoneSection   phoneSection;
    private NameSection    nameSection;

    public ApplicationPageImpl( NameSection nameSection, AddressSection addressSection,
                                PhoneSection phoneSection ) {
        this.nameSection = nameSection;
        this.addressSection = addressSection;
        this.phoneSection = phoneSection;
    }

    @Override
    public void collectInfo() {

        String name = nameSection.collectNameInfo();
        Address address = addressSection.collectAdressInfo();
        Phone phone = phoneSection.collectPhoneInfo();

        Entry entry = EntryFactory.getEntry( name, address, phone );
        BookImpl.BOOK_STORAGE.addEntry( entry );
    }

    @Override
    public void show( Entry entry ) {
        this.nameSection.showName( entry.getName() );
        this.addressSection.showAddress( entry.getAddress() );
        this.phoneSection.showPhone( entry.getPhone() );
    }

}
