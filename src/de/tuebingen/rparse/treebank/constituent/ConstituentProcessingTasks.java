/*******************************************************************************
 * File ConstituentProcessingTasks.java
 * 
 * Authors:
 *    Wolfgang Maier
 *    
 * Copyright:
 *    Wolfgang Maier, 2011
 * 
 * This file is part of rparse, see <www.wolfgang-maier.net/rparse>.
 * 
 * rparse is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free 
 * Software Foundation; either version 2 of the License, or (at your option) 
 * any later version.
 * 
 * rparse is distributed in the hope that it will be useful, but WITHOUT ANY 
 * WARRANTY; without even the implied warranty of MERCHANTABILITY 
 * or FITNESS FOR A PARTICULAR PURPOSE.  See the  GNU General Public 
 * License for more details.
 * 
 * You should have received a copy of the GNU General Public License along 
 * with this program.  If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/
package de.tuebingen.rparse.treebank.constituent;

public interface ConstituentProcessingTasks {

	public static final String TREEBANK_GETTER = "treebank";

	public static final String HEAD_FINDER = "headfinder";
	
	public static final String HEAD_LABELER = "headlabel";

	public static final String PUNCTUATION_LOWERER = "punctlower";
	
	public static final String NEGRA_S_SPLIT = "negrassplit";

	public static final String NEGRA_VP_SPLIT = "negravpsplit";

}
