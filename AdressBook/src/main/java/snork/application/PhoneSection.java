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
package snork.application;

import snork.model.Phone;

public interface PhoneSection {

    Phone collectPhoneInfo();
    void showPhone(Phone phone);

}
