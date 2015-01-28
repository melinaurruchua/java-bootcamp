package com.melina.app;

/**
 * User service
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println( "User service " );
        IUserService userservice= new UserServiceProxy(new UserService());
        userservice.createUser("User1","XXXX");
        userservice.createUser("User2","ZZZZ");
        userservice.readUser("User1");
        userservice.updateUser("User2", "email", "user2@email.com");
        userservice.readUser("User2");
        
    }
}
