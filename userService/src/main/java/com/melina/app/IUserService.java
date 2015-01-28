package com.melina.app;

public interface IUserService {
	public void createUser(String id,String pass);
	
	public void readUser(String id);
	
	public void deleteUser(String id);
	
	public void updateUser(String id, String property, String value);
	
	public void uploadPhoto(String id, PhotoImage photo);
	
	public void likePhoto(String id, PhotoImage photo);
	
	public void addFriends(String idUser, String idFriend);
	
	
}
