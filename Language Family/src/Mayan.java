

class Mayan extends Language {
	  private static final String region = "Central America";
	  private static final String wordOrder = "verb-object-subject";
	  
	  Mayan(String languageName,int speakers ){
	    super(languageName,speakers,region,wordOrder);
	  }
	  
	  @Override
	  public void getInfo() {
	    super.getInfo();
	    System.out.println("Fun fact: "+name+" is an ergative language.");
	  }
	}
