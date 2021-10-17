package com.serialization;

import java.io.Serializable;

public class Item implements Serializable
{
	  
	private int itemId ;
	private   String  itemDescription ;
	private int  itemQuantityAvailable ;
	private  double itemUnitPrice ;
	private int itemDiscountPercentage ;
	  
	public Item() {
			super();
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public int getItemQuantityAvailable() {
		return itemQuantityAvailable;
	}

	public void setItemQuantityAvailable(int itemQuantityAvailable) {
		this.itemQuantityAvailable = itemQuantityAvailable;
	}

	public double getItemUnitPrice() {
		return itemUnitPrice;
	}

	public void setItemUnitPrice(double itemUnitPrice) {
		this.itemUnitPrice = itemUnitPrice;
	}

	public int getItemDiscountPercentage() {
		return itemDiscountPercentage;
	}

	public void setItemDiscountPercentage(int itemDiscountPercentage) {
		this.itemDiscountPercentage = itemDiscountPercentage;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemDescription=" + itemDescription + ", itemQuantityAvailable="
				+ itemQuantityAvailable + ", itemUnitPrice=" + itemUnitPrice + ", itemDiscountPercentage="
				+ itemDiscountPercentage + "]";
	}
	  
	  
}

package com.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ItemSerialize 
{
	
	public static void main(String[] args) throws Exception
	{
		 ArrayList<Item> list = new ArrayList<Item>();
		  
		  Item item1 = new Item();
		  item1.setItemId(101);
		  item1.setItemDescription("Good - Better - Best");
		  item1.setItemQuantityAvailable(10);
		  item1.setItemUnitPrice(25000);
		  item1.setItemDiscountPercentage(8);
		  
		  Item item2 = new Item();
		  item2.setItemId(102);
		  item2.setItemDescription("Good - Better - Best");
		  item2.setItemQuantityAvailable(20);
		  item2.setItemUnitPrice(35000);
		  item2.setItemDiscountPercentage(8);
		  
		  Item item3 = new Item();
		  item3.setItemId(103);
		  item3.setItemDescription("Good - Better - Best");
		  item3.setItemQuantityAvailable(30);
		  item3.setItemUnitPrice(45000);
		  item3.setItemDiscountPercentage(8);
		  
		  Item item4 = new Item();
		  item4.setItemId(104);
		  item4.setItemDescription("Good - Better - Best");
		  item4.setItemQuantityAvailable(10);
		  item4.setItemUnitPrice(45000);
		  item4.setItemDiscountPercentage(8);
		  
		  Item item5 = new Item();
		  item5.setItemId(105);
		  item5.setItemDescription("Good - Better - Best");
		  item5.setItemQuantityAvailable(5);
		  item5.setItemUnitPrice(70000);
		  item5.setItemDiscountPercentage(8);
		  
		  list.add(item1);
		  list.add(item2);
		  list.add(item3);
		  list.add(item4);
		  list.add(item5);
  
	   FileOutputStream FOS = new FileOutputStream("D:\\FileIO\\Item.ser");
	   ObjectOutputStream OOS = new ObjectOutputStream(FOS);
	   OOS.writeObject(list);
	   
	   FileInputStream FIS = new FileInputStream("D:\\FileIO\\Item.ser");
	   ObjectInputStream OIS = new ObjectInputStream(FIS);
	   
	   ArrayList list1 = (ArrayList)OIS.readObject();
	   
	   System.out.println("Item ID :"+"ItemDecs : "+"ItemQuantity : "+"ItemPrice : "+"ItemDiscount " );
	   for(Object obj : list1)
	   {
		  if(obj instanceof Item)
		  {
			  System.out.println(((Item) obj).getItemId()+" : "+((Item) obj).getItemDescription()+" : "+((Item) obj).getItemQuantityAvailable()+" : "+((Item) obj).getItemUnitPrice()+" : "+((Item) obj).getItemDiscountPercentage()+"%");
		  }
	   }
	   

	}

}
