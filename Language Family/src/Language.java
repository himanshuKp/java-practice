

class Language{
	  protected String name;
	  protected int numSpeakers;
	  protected String regionsSpoken;
	  protected String wordOrder;
	  
	  public Language(String getName, int getNumSpeakers, String getRegionsSpoken, String getWordOrder){
	    this.name = getName;
	    this.numSpeakers = getNumSpeakers;
	    this.regionsSpoken = getRegionsSpoken;
	    this.wordOrder = getWordOrder;
	  }
	  
	  public void getInfo(){
	    System.out.println(name+ " is spoken by "+numSpeakers+"  people mainly in "+regionsSpoken);
	    System.out.println("The language follows the word order: "+wordOrder);
	  }
	  
	  public static void main(String[] args){
	    Mayan mayanLanguage = new Mayan("Ki'che'",30000);
	    mayanLanguage.getInfo();
	    
	    SinoTibetan sTibetan1 = new SinoTibetan("Burmese",10000);
	    sTibetan1.getInfo();
	    
	    SinoTibetan sTibetan = new SinoTibetan("Mandarin Chinese",20000);
	  	sTibetan.getInfo();
	    
	  }
	}