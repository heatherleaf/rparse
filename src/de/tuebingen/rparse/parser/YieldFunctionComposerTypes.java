/*******************************************************************************
 * File YieldFunctionComposerTypes.java
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
package de.tuebingen.rparse.parser;

/**
 * Constants for yield function composers
 * 
 * @author wmaier
 */
public class YieldFunctionComposerTypes {

    /**
     * First implementation of yield function composition, takes linear time in the length of the vectors
     */
    public final static String CLASSIC = "old";

    /**
     * More efficient implementation, uses BitSet capabilities
     */
    public final static String FAST    = "fast";

    /**
     * Filtering of gaps, i.e., longer gaps get excluded
     */
    public final static String GAPS    = "gaps";

    /**
     * Filtering of ill-nested constructions
     */
    public final static String WELL    = "wellnested";

}
