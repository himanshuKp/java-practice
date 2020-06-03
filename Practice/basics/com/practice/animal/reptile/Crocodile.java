package com.practice.animal.reptile;

public class Crocodile extends Reptile{
	
	public Crocodile() {
		super();
	}

	public Crocodile(int height, int weight, String animalType, String bloodType) {
		super(height, weight, animalType, bloodType);
	}

	@Override
	public String getSkinType() {
		// TODO Auto-generated method stub
		return super.getSkinType();
	}

	@Override
	public void setSkinType(String skinType) {
		// TODO Auto-generated method stub
		super.setSkinType(skinType);
	}

	@Override
	public boolean isBackbone() {
		// TODO Auto-generated method stub
		return super.isBackbone();
	}

	@Override
	public void setBackbone(boolean backbone) {
		// TODO Auto-generated method stub
		super.setBackbone(backbone);
	}

	@Override
	public boolean isSoftShellEggs() {
		// TODO Auto-generated method stub
		return super.isSoftShellEggs();
	}

	@Override
	public void setSoftShellEggs(boolean softShellEggs) {
		// TODO Auto-generated method stub
		super.setSoftShellEggs(softShellEggs);
	}
	
	public void showInfo() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Crocodile [getSkinType()=" + getSkinType() + ", isBackbone()=" + isBackbone() + ", isSoftShellEggs()="
				+ isSoftShellEggs() + ", getHeight()=" + getHeight() + ", getWeight()=" + getWeight()
				+ ", getAnimalType()=" + getAnimalType() + ", getBloodType()=" + getBloodType() + "]";
	}

	

}
