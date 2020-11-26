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

import java.util.LinkedList;

import logic.Abstract.Product;
import logic.subclass.DrinkProduct;
import logic.subclass.LiquidProduct;
import logic.subclass.SolidProduct;

/**
 * @author FacuFalcone - CaidevOficial
 */
public class MainPNT {

    // LL for store the products
    public static LinkedList<Product> productList = new LinkedList<Product>();

    /**
     * Harcodes the products in the LinkedList
     * @param productList
     */
    public static void Harcode(LinkedList<Product> productList) {

	   String name[] = { "Coca-Cola Zero", "Coca-Cola", "Shampoo Sedal", "Frutillas" };
	   int price[] = { 20, 18, 19, 64 };
	   double size[] = { 1.5, 1.5, 0.9 };
	   if (productList != null) {
		  for (int i = 0; i < 4; i++) {
			 if (i < 2) {
				productList.add(new DrinkProduct(name[i], price[i], size[i]));
			 } else if (i < 3) {
				productList.add(new LiquidProduct(name[i], price[i], size[i]));
			 } else {
				productList.add(new SolidProduct(name[i], price[i], "kilo"));
			 }
		  }
	   }
    }

    /**
     * Shows in console the info of the products.
     * @param productList
     */
    public static void ShowProducts(LinkedList<Product> productList) {

	   if (productList != null) {
		  for (Product product : productList) {
			 System.out.println(product.toString());
		  }
		  System.out.println("=============================");
	   }
    }

    /**
     * Prints in console the expensive or cheaper product.
     * @param productList LinkedList ff products.
     * @param order Order to print. 1 for expensive, 0 for cheapper.
     * @return Return true if can show at least 1 product, False for error.
     */
    public static boolean SortByPrice(LinkedList<Product> productList, int order) {
	   String name;
	   boolean sortOne = false;
	   Product product1 = null;
	   Product product2 = null;

	   if (productList != null) {
		  for (int i = 0; i < (productList.size() - 1); i++) {
			 for (int j = i + 1; j < productList.size(); j++) {
				product1 = productList.get(i);
				product2 = productList.get(j);
				if ((order == 1 && product1.compareTo(product2) < 0) || 
				    (order == 0 && product1.compareTo(product2) > 0)) {
				    productList.set(i, product2);
				    productList.set(j, product1);
				    sortOne = true;
				}
			 }
		  }
		  name = productList.getFirst().getName();
		  if (order == 1) {
			 System.out.printf("Producto más caro: %s\n", name);
		  } else {
			 System.out.printf("Producto más barato: %s\n", name);
		  }
	   }
	   
	   return sortOne;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
	   Harcode(productList);
	   ShowProducts(productList);
	   SortByPrice(productList, 1);
	   SortByPrice(productList, 0);
    }
}
