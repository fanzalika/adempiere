/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2006 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
package org.compiere.util;

import org.compiere.model.MPaySelectionCheck;

import java.io.File;
import java.util.Arrays;
import java.util.List;

/**
 * 	Abstract class implementation for old compatibility
 * 	@author  victor.perez , victor.perez@e-evolution.com http://www.e-evolution.com
 * 		<li> FR [ 468 ] Bug with old compatibility
 *		@see https://github.com/adempiere/adempiere/issues/468
 */
public abstract class PaymentExportList implements PaymentExport {
	/**************************************************************************
	 *  Export to File
	 *  @param checks array of checks
	 *  @param file file to export checks
	 *  @return number of lines
	 */
	@Deprecated
	public int exportToFile(MPaySelectionCheck[] checks, File file, StringBuffer error) {
		return exportToFile( Arrays.asList(checks) , file , error);
	}

	/**************************************************************************
	 *  Export to File
	 *  @param checks list of checks
	 *  @param file file to export checks
	 *  @return number of lines
	 */
	public abstract int exportToFile(List<MPaySelectionCheck> checks, File file, StringBuffer error);

}	//	PaymentExport