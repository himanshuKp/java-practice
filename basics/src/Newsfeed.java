import java.util.Arrays;

public class Newsfeed {
  
//  instance array fields
  String[] topics = {"Opinion", "Tech", "Science", "Health"};
  int[] views = {0, 0, 0, 0};
  
//  default constructor
  public Newsfeed(){

  }
    
// return topics array of string type
  public String[] getTopics(){
    return topics;
  }
  
//  return values at positions in topics array
  public String getTopTopic(){
    return topics[0];
  }
  
//  increment values at views array while incrementing its value by + 1 each time it is called
  public void viewTopic(int topicIndex){
    views[topicIndex] = views[topicIndex]+1;
  }

  public static void main(String[] args){
//	  created object of class NewsFeed
    Newsfeed sampleFeed = new Newsfeed();
    
    
    System.out.println("The top topic is "+ sampleFeed.getTopTopic());
    
    sampleFeed.viewTopic(1);
    System.out.println("The " + sampleFeed.topics[1] + " topic has been viewed " + sampleFeed.views[1] + " times!"); 
    sampleFeed.viewTopic(1);
    System.out.println("The " + sampleFeed.topics[1] + " topic has been viewed " + sampleFeed.views[1] + " times!"); 
    sampleFeed.viewTopic(3);
    System.out.println("The " + sampleFeed.topics[1] + " topic has been viewed " + sampleFeed.views[1] + " times!"); 
    sampleFeed.viewTopic(2);
    System.out.println("The " + sampleFeed.topics[1] + " topic has been viewed " + sampleFeed.views[1] + " times!"); 
    sampleFeed.viewTopic(2);
    System.out.println("The " + sampleFeed.topics[1] + " topic has been viewed " + sampleFeed.views[1] + " times!"); 
    sampleFeed.viewTopic(1);
    
    System.out.println("The " + sampleFeed.topics[1] + " topic has been viewed " + sampleFeed.views[1] + " times!"); 
  }
}
