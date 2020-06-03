package com.practice.animal.reptile;

import com.practice.animal.Animal;

public class Reptile extends Animal {

	private String skinType;
	private boolean backbone;
	private boolean softShellEggs;
	
	public Reptile() {
		super();
	}

	public Reptile(int height, int weight, String animalType, String bloodType) {
		super(height, weight, animalType, bloodType);
		this.skinType = "soft";
		this.backbone = false;
		this.softShellEggs = true;
	}

	public String getSkinType() {
		return skinType;
	}

	public void setSkinType(String skinType) {
		this.skinType = skinType;
	}

	public boolean isBackbone() {
		return backbone;
	}

	public void setBackbone(boolean backbone) {
		this.backbone = backbone;
	}

	public boolean isSoftShellEggs() {
		return softShellEggs;
	}

	public void setSoftShellEggs(boolean softShellEggs) {
		this.softShellEggs = softShellEggs;
	}
	
	
}
