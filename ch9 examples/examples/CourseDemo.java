/**
 * This program demonstrates the Course class.
*/

public class CourseDemo
{
   public static void main(String[] args)
   {
      // Create an Instructor object.
      Instructor myInstructor =
          new Instructor("Kramer", "Shawn", "RH3010");
      
      // Create a TextBook object.
      TextBook myTextBook =
          new TextBook("Starting Out with Java",
                       "Gaddis", "Scott/Jones");
      // we have built the components first, now we are ready for complex object                 
      // Create a Course object.
      Course myCourse1 = 
         new Course("Intro to Java", myInstructor,
                    myTextBook);
 
      myInstructor.set("Jey", "Veerasamy", "ES3.231");
      myTextBook.set("Starting with C++", "Neil", "Pearson");
      Course myCourse2 = 
         new Course("Intro to C++", myInstructor,
                    myTextBook);      
      
      // Display the course information.
      System.out.println(myCourse1);
      System.out.println(myCourse2);
		     
   } 
	

	
}