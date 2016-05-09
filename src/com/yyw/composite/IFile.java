package com.yyw.composite;

public interface IFile {
	IFile getComposite();
	
	void sampleOperation(); 
	
	int getDeep();
	
	void setDeep();
}
