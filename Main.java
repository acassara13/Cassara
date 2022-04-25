import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    /*

You are given the results of a survey. The data is presented in numerous arrays.

Use your knowledge of arrays and objects to answer questions around the collected data.

*/



// These are the arrays you'll interact with! 

String [] names = {"Daniel","Yaika","Luke","William","Kathryn","Taylor","Makenzie","Brenton","Max","Mike","Olivia","Rebecca","Daley","Tim","Ahmad","Chelsey","Faedra","Terrace","Kate","Zaire"};

String [] nickname = {"Danny","Yikes","Loki","Wild Bill","Kath","Tay","Kenzy","Smelly","Smallman","","Liv","Becca","","Tim","Ahms","","Mattox","T-Dawg","KMoMo",""};

int [] age = {31,30,28,29,51,25,27,30,100,19,26,29,25,27,29,29,43,31,27,29};

String [] favoriteBand = {"Booker T and the MGs","OAR","Miike Snow","Pentatonix","Imagine Dragons","Joseph","Something Corporate","Guster","adele","Led Zeppelin","","The Beatles","Leon Bridges","Kishi Bashi","Saves The Day","Eli young band","OAR","Chicago","Adele","MCR"};

String [] favoriteShow = {"Mad Men","Penny Dreadful","Game of Thrones","Steven Universe","Game of Thrones","The West Wing","Bob's Burgers","Rick and Morty","Game of Thrones","Welcome to the NHK","Parks and Rec","Hunter x Hunter","Stranger Things","The Wire","The West Wing","WOD","The Office","The Office","Game of Thrones","Rick and morty"};

boolean [] isProgrammer  = {true,false,false,false,false,true,false,false,true,false,true,false,false,true,false,false,false,false,false,false};

String [] state = {"NY","TX","N/A - UK","TX","NC","NY","TX","ON","CA","AZ","AZ","TX","TN","CA","MI","ID","WI","AZ","AZ","TX"};

String [] hairColor = {"Brown","Black","Dark Blonde","Brown","Brown","Brown","Brown","Blonde","Brown","Blonde","Blonde","Brown","Brown","Black","Black","Blonde","Brown","Brown","Amber ","Black"};

String [] motto = {"Don't overthink it.","I guess we'll find out. ","People have catchphrases in America?","Being kind is always a good idea.","You can practice being right or you can practice being kind. ","The work always gets done.","Meh","Ohmydog","Get along little doggy","I never die.","The best is yet to come!","The thing is","You can lock your heart up","Swing Away","That's Dope!","Don't tell me","She is clothed in strength and dignity and she laughs without fear of the future","Beep beep beep. ","Do not pity the dead. Pity the living; most of all","I totally got this Motto/0","Don't overthink it.","I guess we'll find out. ","People have catchphrases in America?","Being kind is always a good idea.","You can practice being right or you can practice being kind. ","The work always gets done.","Meh","Ohmydog","Get along little doggy","I never die.","The best is yet to come!","The thing is","You can lock your heart up","Swing Away","That's Dope!","Don't tell me","She is clothed in strength and dignity and she laughs without fear of the future","Beep beep beep. ","Do not pity the dead. Pity the living; most of all","I totally got this "};

// 1. Print out the name of every person who responded to the survey 
System.out.println(">>>Task 1:");

for(int a=0; a<names.length; a++){
  System.out.print(names[a] + " | ");
}
System.out.println("\n\n");


// 2. Print out "Hi, my name is _____, and I live in ____." for every person who responded to the survey 

System.out.println(">>>Task 2:");

for(int a=0; a<names.length; a++){
  System.out.print("Hi, my name is " + names[a] + " and I live in " + state[a] + ". ");
}
System.out.println("\n\n");


// 3. Create an array or arraylist and name it shortBios. Inside of shortBios, create an object that store each respondents name, nickname, and age. Then, print out  shortBios. Hint: You have to create a class that defines the structure of the object.

//See Solution for Task 4

// 4. Add the favorite show and favorite band to each person object inside of the shortBios array. Then, print out shortBios. 

System.out.println(">>>Task 4: (includes Solution for Task 3)");

ArrayList<Person> shortBios = new ArrayList<Person>();
 

for (int a = 0; a<names.length; a++){
  shortBios.add(new Person(names[a], nickname[a], age[a], favoriteShow[a], favoriteBand[a]));
}

for (int c = 0; c < shortBios.size(); c++){
  System.out.print(shortBios.get(c).name + ", " + shortBios.get(c).nickname + ", " + shortBios.get(c).age + ", " + shortBios.get(c).favoriteShow + ", " + shortBios.get(c).favoriteBand + "\n");
}

System.out.println("\n\n");

// 5. Create a new array or arraylist called longBios. Inside of longBios, create objects that store each respondents name, nickname, age, favorite show, favorite band, if they are a programmer, the state they live in, their hair color, and their personal motto. Then, print out longBios. 

System.out.println(">>>Task 5:");

ArrayList<PersonLong> longBios = new ArrayList<PersonLong>();
 

for (int a = 0; a<names.length; a++){
  longBios.add(new PersonLong(names[a], nickname[a], age[a], favoriteShow[a], favoriteBand[a], isProgrammer[a], state[a], hairColor[a], motto[a]));
}

for (int c = 0; c < longBios.size(); c++){
  System.out.print(longBios.get(c).name + ", " + longBios.get(c).nickname + ", " + longBios.get(c).age + ", " + longBios.get(c).favoriteShow + ", " + longBios.get(c).favoriteBand +", " + longBios.get(c).isProgrammer + ", " + longBios.get(c).state +", "+ longBios.get(c).hairColor +", " + longBios.get(c).motto + "\n");
}

System.out.println("\n\n");


// 6. For each person in longBios, print out a descriptor of where they live.
// It will look something like this: "____ lives in _____." 


System.out.println(">>>Task 6:");

for (int c = 0; c < longBios.size(); c++){
  System.out.print(longBios.get(c).name + " lives in  " + longBios.get(c).state + "\n");
}

System.out.println("\n\n");



// 7. Print out each person's nickname. 


System.out.println(">>>Task 7:");

for (int c = 0; c < longBios.size(); c++){
  System.out.print(longBios.get(c).name + "\'s nickname is " + longBios.get(c).nickname + "\n");
}

System.out.println("\n\n");


// 8. Find the average of the respondents' ages. Output this average (Note: Please use a loop, don't hard code the answer). 


System.out.println(">>>Task 8:");

int totalAge = 0;
int averageAge = 0;

for (int c = 0; c < longBios.size(); c++){
     totalAge = totalAge + longBios.get(c).age;
}
 
averageAge = totalAge/longBios.size();
System.out.println("The average age is " + averageAge);
System.out.println("\n\n");


// 9. Print out the percentage of respondents who have brown hair. (Note: Please use a loop, don't hard code the answer). 

System.out.println(">>>Task 9:");

int brownHair = 0;
int percentage = 0;

for (int c = 0; c < longBios.size(); c++){
     if (longBios.get(c).hairColor.equals("Brown")){
        brownHair++;
     }
}
 
percentage = brownHair*100/longBios.size();
System.out.println(percentage + "% of respondents have brown hair. ");
System.out.println("\n\n");



// 10. Create two new ArrayLists - one for programmers, and one for non programmers.
//    Sort all the people in the longBios arrayList into these two more specific arraysLists. (Note: Please use a loop, don't hard code the answer)

System.out.println(">>>Task 10:");


ArrayList<PersonLong> programmer = new ArrayList<PersonLong>();

ArrayList<PersonLong> nonProgrammer = new ArrayList<PersonLong>();

for (int c = 0; c < longBios.size(); c++){
     if (longBios.get(c).isProgrammer == true){
        programmer.add(longBios.get(c));
     } else {
        nonProgrammer.add(longBios.get(c));
     }
}

System.out.println("Respondents who code:");
for (int c=0; c<programmer.size(); c++){
  System.out.print(programmer.get(c).name + " | ");
}

System.out.println("\nRespondents who do not code:");
for (int c=0; c<nonProgrammer.size(); c++){
  System.out.print(nonProgrammer.get(c).name + " | ");
}


System.out.println("\n\n");


// 11. Create a new ArrayList only for people who listed "Game of Thrones" as one of their favorite shows. (Note: Please use a loop, don't hard code the answer) 
System.out.println(">>>Task 11:");

ArrayList<PersonLong> gotFan = new ArrayList<PersonLong>();

for (int c = 0; c < longBios.size(); c++){
     if (longBios.get(c).favoriteShow.equals("Game of Thrones") == true){
        gotFan.add(longBios.get(c));
     } 
}

System.out.println("Respondents who watch Game of Thrones:");
for (int c=0; c<gotFan.size(); c++){
  System.out.print(gotFan.get(c).name + " | ");
}

System.out.println("\n\n");


// 12. Print out a list of all the bands that are liked by at least two people. (Note: Please use a loop, don't hard code the answer) 

System.out.println(">>>Task 12:");

ArrayList<String> twoFanBands = new ArrayList<String>();

int fanCounter = 0;
 
 for(int outer=0;outer<favoriteBand.length; outer++){

   fanCounter =0;
   
   for(int inner=0; inner<favoriteBand.length; inner++){
     if(favoriteBand[outer].toUpperCase().equals(favoriteBand[inner].toUpperCase())){
       fanCounter++;
     }
   }

   if(fanCounter > 1){
     twoFanBands.add(favoriteBand[outer]);
   }
 }

 for(int c=0; c<twoFanBands.size(); c++){
   System.out.println(twoFanBands.get(c));
 }

System.out.println("\n\n");




  }
}