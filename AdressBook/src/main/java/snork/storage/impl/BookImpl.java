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
package snork.storage.impl;

import snork.model.Entry;
import snork.model.impl.EmptyEntry;
import snork.storage.Book;

import java.util.Collection;
import java.util.Comparator;
import java.util.TreeSet;

public enum BookImpl implements Book {

    BOOK_STORAGE;

    private TreeSet<Entry> storage;

    private BookImpl() {
        this.storage = new TreeSet<>(
                ( first, second ) -> first.getName().compareTo( second.getName() ) );
    }

    @Override
    public void addEntry( Entry entry ) {
        this.storage.add( entry );
    }

    @Override
    public Entry getEntryByName( String name ) {
        for ( Entry entry : storage ) {
            if ( name.equals( entry.getName() ) ) {
                return entry;
            }
        }
        return new EmptyEntry();
    }

    @Override
    public Collection<Entry> getAllEnties() {
        return null;
    }
}
