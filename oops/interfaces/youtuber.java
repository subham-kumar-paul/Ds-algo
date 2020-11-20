package oops.interfaces;

public abstract interface youtuber extends videoeditor {
	
	void makevideo() ;
	
	default void uploadvideo() {
		System.out.println("uploading the video");
	}
 
}
