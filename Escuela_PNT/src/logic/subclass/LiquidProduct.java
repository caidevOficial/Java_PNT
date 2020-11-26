/*
 * Copyright (C) 2020 FacuFalcone - CaidevOficial
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package logic.subclass;

import logic.Abstract.Product;

/**
 * @author FacuFalcone - CaidevOficial
 */
public class LiquidProduct extends Product {

    // Atributes
    protected double size;

    /**
     * Builds the entity with default params.
     */
    public LiquidProduct() {
	   super();
    }

    /**
     * Builds the entity with 1 param.
     * 
     * @param name Name of the entity.
     */
    public LiquidProduct(String name) {
	   super(name);
    }

    /**
     * Builds the entity with 2 params.
     * 
     * @param name  Name of the entity.
     * @param price Price of the entity.
     */
    public LiquidProduct(String name, int price) {
	   super(name, price);
    }

    /**
     * Builds the entity with 3 params.
     * 
     * @param name  Name of the entity.
     * @param price Price of the entity.
     * @param size  Size of the entity.
     */
    public LiquidProduct(String name, int price, double size) {
	   this(name, price);
	   this.size = size;
    }

    @Override
    public String getName() {
	   return super.getName();
    }

    @Override
    public int getPrice() {
	   return super.getPrice();
    }

    @Override
    public void setName(String name) {
	   super.setName(name);
    }

    @Override
    public void setPrice(int price) {
	   super.setPrice(price);
    }

    /**
     * @return the size
     */
    public double getSize() {
	   return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(double size) {
	   if (size > 0) {
		  this.size = size;
	   }
    }

    @Override
    public int compareTo(Product arg0) {
	   int result = this.getPrice() - arg0.getPrice();
	   return result;
    }

    @Override
    public String toString() {
	   String name = getName();
	   double size = getSize();
	   int price = getPrice();
	   String patron = "%.0f";
	   String doubleFormat;
	   String message = "lt";
	   String finalMessage;

	   if (size < 1) {
		  size = size * 1000;
		  message = "ml";
	   }
	   doubleFormat = String.format(patron, size);
	   finalMessage = "Nombre: " + name + " /// Contenido: " + doubleFormat + message + " /// Precio: $" + price;
	   return finalMessage;
    }
}
