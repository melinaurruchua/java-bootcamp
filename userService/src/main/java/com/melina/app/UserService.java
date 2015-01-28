package com.melina.app;

import java.util.HashMap;
import java.util.Map;

public class UserService implements IUserService{

	private Map<String,User> users;
	/**
	 * Constructor
	 */
	public UserService(){
		users= new HashMap<String,User>();
	}
	/**
	 * create and add new user
	 */
	public void createUser(String id, String pass) {
		User user= new User(id, pass);
		users.put(id,user);
	}
	/**
	 * show properties from user 
	 */
	public void readUser(String id) {
		users.get(id).getUserProperties();
	}
	/**
	 * delete a user
	 */
	public void deleteUser(String id) {
		users.remove(id);
	}
	/**
	 * update a new property for user id
	 */
	public void updateUser(String id, String property, String value) {
		User u=users.get(id);
		u.update(property, value);
	}
	
	/**
	 * upload photo for user id
	 */
	public void uploadPhoto(String id, PhotoImage photo) {
		users.get(id).insertPhoto(photo);
	}
	/**
	 * increase like var for photo from user
	 */
	public void likePhoto(String id, PhotoImage photo) {
		users.get(id).addLikes(photo);
	}
	/**
	 * add new friend
	 */
	public void addFriends(String idUser, String idFriend) {
		users.get(idUser).addFriend(idFriend);
	}
	

}
