class SinoTibetan extends Language {
  private static final String region = "Central America";
	
  SinoTibetan(String languageName, int numSpeakers){   
	 super(languageName,numSpeakers,region,"subject-object-verb");
     if(languageName.contains("Chinese")){
    	 this.wordOrder = "subject-verb-object";
     }
  }
  
  @Override
  public void getInfo(){
    super.getInfo();
  } 
}