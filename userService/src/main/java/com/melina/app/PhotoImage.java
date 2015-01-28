package com.melina.app;

import java.awt.image.BufferedImage;

public class PhotoImage {
	private String id;
	private int LikesQuantity;
	private BufferedImage photo;
	
	public PhotoImage(String id, BufferedImage photo){
		this.id=id;
		this.photo=photo;
		LikesQuantity=0;
	}
	
	public void likeImageInc(){
		LikesQuantity++;
	}
	
	public int getLikesImages(){
		return LikesQuantity;
	}
}
