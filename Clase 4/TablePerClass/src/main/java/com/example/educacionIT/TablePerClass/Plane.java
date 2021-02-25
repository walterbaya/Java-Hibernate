package com.example.educacionIT.TablePerClass;

import javax.persistence.*;

@Entity
@Table(name = "planes")
public class Plane extends Vehicle{
    private int size;
    private boolean fliying;
    public Plane() {

    }

    public Plane(Integer id,String engine, int size, boolean fliying) {
        super(id,engine);
        this.size = size;
        this.fliying = fliying;
    }


    public int getSize() {
        return size;
    }


    public void setSize(int size) {
        this.size = size;
    }

	public boolean isFliying() {
		return fliying;
	}

	public void setFliying(boolean fliying) {
		this.fliying = fliying;
	}
    
}
