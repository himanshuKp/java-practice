

class Mayan extends Language {
	  protected String name;
	  protected int numSpeakers;
	  protected String region = "Central America";
	  protected String wordOrder = "verb-object-subject";
	  
	  Mayan(String languageName,int speakers, String region, String wordOrder ){
	    super(languageName,speakers,region,wordOrder);
	  }
	  
	  @Override
	  public void getInfo() {
	    System.out.println(this.name+" is spoken by "+this.numSpeakers+" people mainly in Central America.");
	    System.out.println("The language follows the word order: verb-object-subject");
	    System.out.println("Fun fact: "+this.name+" is an ergative language.");
	  }
	}
