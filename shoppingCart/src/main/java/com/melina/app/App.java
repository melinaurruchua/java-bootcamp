package com.melina.app;

/**
 * Shopping Cart
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Shopping Cart " );
        IShoppingCart cart= new ShoppingCartProxy(new Cart());
        cart.addProduct("Mochila", "300");
        cart.addProduct("Zapatillas", "450");
        System.out.println(cart.showProducts());
        System.out.println(cart.getTotalCost());
    }
}
