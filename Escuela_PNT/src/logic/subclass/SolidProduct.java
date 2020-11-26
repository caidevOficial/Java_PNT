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
public class SolidProduct extends Product {

    // Atributes
    String size;

    /**
     * Builds the entity with default params.
     */
    public SolidProduct() {
	   super();
	   this.size = "";
    }

    /**
     * Builds the entity with 1 param.
     * 
     * @param name Name of the entity.
     */
    public SolidProduct(String name) {
	   this();
	   this.name = name;
    }

    /**
     * Builds the entity with 2 params.
     * 
     * @param name  Name of the entity.
     * @param price Price of the entity.
     */
    public SolidProduct(String name, int price) {
	   this(name);
	   this.price = price;
    }

    /**
     * Builds the entity with 3 params.
     * 
     * @param name  Name of the entity.
     * @param price Price of the entity.
     * @param size  Size of the entity.
     */
    public SolidProduct(String name, int price, String size) {
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

    /**
     * @return the size
     */
    public String getSize() {
	   return size;
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
     * @param size the size to set
     */
    public void setSize(String size) {
	   if (size != null) {
		  this.size = size;
	   }
    }

    @Override
    public String toString() {
	   String name = getName();
	   String size = getSize();
	   int price = getPrice();
	   String message = "Nombre: " + name + " /// Precio: $" + price + " /// Unidad de venta: " + size;

	   return message;
    }

    @Override
    public int compareTo(Product arg0) {
	   int result = this.getPrice() - arg0.getPrice();
	   return result;
    }
}
