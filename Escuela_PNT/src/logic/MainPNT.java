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

package logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import logic.Abstract.Product;
import logic.subclass.DrinkProduct;
import logic.subclass.LiquidProduct;
import logic.subclass.SolidProduct;

/**
 * @author FacuFalcone - CaidevOficial
 */
public class MainPNT {

    // LL for store the products
    public static List<Product> productList = new ArrayList<Product>();

    /**
     * Harcodes the products in the List
     * 
     * @param productList
     */
    public static void Harcode(List<Product> productList) {

	   productList.add(new DrinkProduct("Coca-Cola Zero", 20, 1.5));
	   productList.add(new DrinkProduct("Coca-Cola", 18, 1.5));
	   productList.add(new LiquidProduct("Shampoo Sedal", 19, 0.9));
	   productList.add(new SolidProduct("Frutillas", 64, "kilo"));
    }

    /**
     * Shows in console the info of the products.
     * 
     * @param productList
     */
    public static void ShowProducts(List<Product> productList) {

	   if (productList != null) {
		  for (Product product : productList) {
			 System.out.println(product.toString());
		  }
		  System.out.println("=============================");
	   }
    }

    /**
     * Prints in console the expensive or cheaper product.
     * 
     * @param productList List ff products.
     * @return Return true if can show at least 1 product, False for error.
     */
    public static boolean SortByPrice(List<Product> productList) {
	   boolean sortOne = false;
	   
	   if (productList != null) {

		  Collections.sort(productList);
		  System.out.printf("Producto más barato: %s\n", productList.get(0).getName());
		  System.out.printf("Producto más caro: %s\n", productList.get(3).getName());
		  sortOne = true;
	   }

	   return sortOne;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
	   Harcode(productList);
	   ShowProducts(productList);
	   SortByPrice(productList);
    }
}
