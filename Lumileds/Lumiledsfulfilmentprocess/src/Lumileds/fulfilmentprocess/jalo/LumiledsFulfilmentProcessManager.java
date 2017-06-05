/*
 * [y] hybris Platform
 *
 * Copyright (c) 2017 SAP SE or an SAP affiliate company.  All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package Lumileds.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import Lumileds.fulfilmentprocess.constants.LumiledsFulfilmentProcessConstants;

@SuppressWarnings("PMD")
public class LumiledsFulfilmentProcessManager extends GeneratedLumiledsFulfilmentProcessManager
{
	public static final LumiledsFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (LumiledsFulfilmentProcessManager) em.getExtension(LumiledsFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
