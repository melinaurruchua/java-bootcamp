package com.melina.app;

public class UserServiceProxy implements IUserService{
	private IUserService userservice;
	
	protected UserServiceProxy(IUserService userservice){
		this.userservice=userservice;
	}
	
	public void createUser(String id,String pass) {
		userservice.createUser(id, pass);
	}

	public void readUser(String name) {
		userservice.readUser(name);
	}

	public void deleteUser(String name) {
		userservice.deleteUser(name);
	}

	public void updateUser(String name, String property, String value) {
		userservice.updateUser(name, property, value);
	}

	public void uploadPhoto(String id, PhotoImage photo) {
		userservice.uploadPhoto(id, photo);
	}

	public void likePhoto(String id, PhotoImage photo) {
		userservice.likePhoto(id, photo);
	}

	public void addFriends(String idUser, String isFriend) {
		userservice.addFriends(idUser, isFriend);
	}

}
