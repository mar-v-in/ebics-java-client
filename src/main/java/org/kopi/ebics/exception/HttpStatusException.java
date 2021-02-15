/*
 * Copyright (c) 1990-2012 kopiLeft Development SARL, Bizerte, Tunisia
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License version 2.1 as published by the Free Software Foundation.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 *
 * $Id$
 */

package org.kopi.ebics.exception;

import org.kopi.ebics.messages.Messages;
import org.kopi.ebics.utils.Constants;

public class HttpStatusException extends EbicsException {
    private final int statusCode;

    public HttpStatusException(int statusCode) {
        super(Messages.getString("http.code.error", Constants.APPLICATION_BUNDLE_NAME, statusCode));
        this.statusCode = statusCode;
    }

    public int getStatusCode() {
        return statusCode;
    }

    private static final long serialVersionUID = -5156261061322817326L;
}
