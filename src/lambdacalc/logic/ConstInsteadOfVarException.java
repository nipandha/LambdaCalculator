/*
 * Copyright (C) 2007-2014 Dylan Bumford, Lucas Champollion, Maribel Romero
 * and Joshua Tauberer
 * 
 * This file is part of The Lambda Calculator.
 * 
 * The Lambda Calculator is free software: you can redistribute it and/or
 * modify it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 * 
 * The Lambda Calculator is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General
 * Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along
 * with The Lambda Calculator.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

/*
 * ConstantInsteadOfVarException.java
 *
 * Created on June 6, 2006, 10:59 AM
 */

package lambdacalc.logic;

/**
 * Thrown by Expr.getType() when a constant is found where a variable
 * needs to be, such as as the variable of a binder.
 */
public class ConstInsteadOfVarException extends TypeEvaluationException {
    
    /** Creates a new instance of ConstantInsteadOfVarException */
    public ConstInsteadOfVarException(String message) {
        super(message);
    }
    
}
