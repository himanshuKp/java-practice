package Language;

class Mayan extends Language {
	  protected String name;
	  protected int numSpeakers;
	  
	  Mayan(String languageName,int speakers){
	    super(languageName,speakers,"Central America","verb-object-subject");
	  }
	  
	  @Override
	  public void getInfo() {
	    System.out.println(this.name+" is spoken by "+this.numSpeakers+" people mainly in Central America.");
	    System.out.println("The language follows the word order: verb-object-subject");
	    System.out.println("Fun fact: "+this.name+" is an ergative language.");
	  }
	}
