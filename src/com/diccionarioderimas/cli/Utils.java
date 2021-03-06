/***************************************************************************
 *   Copyright (C) 2009 by Eduardo Rodriguez Lorenzo                       *
 *   edu.tabula@gmail.com                                                  *
 *   http://www.cronopista.com                                             *
 *                                                                         *
 *   This program is free software; you can redistribute it and/or modify  *
 *   it under the terms of the GNU General Public License as published by  *
 *   the Free Software Foundation; either version 2 of the License, or     *
 *   (at your option) any later version.                                   *
 *                                                                         *
 *   This program is distributed in the hope that it will be useful,       *
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of        *
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the         *
 *   GNU General Public License for more details.                          *
 *                                                                         *
 *   You should have received a copy of the GNU General Public License     *
 *   along with this program; if not, write to the                         *
 *   Free Software Foundation, Inc.,                                       *
 *   59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.             *
 ***************************************************************************/
package com.diccionarioderimas.cli;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class Utils {

	public static String getApplicationPath() {

		 try {
		    	URL url = Utils.class.getProtectionDomain()
		        .getCodeSource().getLocation();
				
				String szUrl = url.toString();
			
			    szUrl = szUrl.substring(0, szUrl.lastIndexOf("/"));
			    URI uri = new URI(szUrl);
			    return new File(uri).getAbsolutePath()+File.separator;
				 
				
			} catch (URISyntaxException e) {
				
			}
		    
			return new File("").getAbsolutePath()+File.separator;
	}
	
	public static void main(String[] args) {
		System.out.println(getApplicationPath());
	}
}
