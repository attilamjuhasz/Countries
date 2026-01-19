//
//  Class author:  Attila M Juhasz
//  Date created:  1/9/26
//  General description: Creates a country which can be geussed in game
//


public class Country
{
  // add private instance variables for the name, capital, language, and image file.
private String name;
private String capital;
private String lang;
private String imageFile;

  // add constructors


//
//  Pre-condition: N/A
//  Post-condition: Sets the name, capital, language, and image file as empty strings
//
public Country(){
  name = "";
  capital = "";
  lang = "";
  imageFile = "";
}


//
//  Pre-condition: N/A
//  Post-condition: Sets the name, capital, language, and image file as the given strings
//
public Country(String name, String capital, String language, String imageFile){
  this.name = name;
  this.capital = capital;
  lang = language;
  this.imageFile = imageFile;
}

  // Write accessor/get methods for each instance variable that returns it.
//getters

//
//  Pre-condition: Country Object must be created and name must be defined
//  Post-condition: Returns the name string
//
public String getName(){
  return name;
}


//
//  Pre-condition: Country Object must be created and capital must be defined
//  Post-condition: Returns the capital string
//
public String getCapital(){
  return capital;
}


//
//  Pre-condition: Country Object must be created and lang must be defined
//  Post-condition: Returns the lang string
//
public String getLang(){
  return lang;
}


//
//  Pre-condition: Country Object must be created and imageFile must be defined
//  Post-condition: Returns the image file string
//
public String getimageFile(){
  return imageFile;
}


//setters

//
//  Pre-condition: Country Object must be created
//  Post-condition: Set the given string as the name
//
public void setName(String name){
  this.name = name;
}


//
//  Pre-condition: Country Object must be created
//  Post-condition: Set the given string as the capital
//
public void setCapital(String capital){
  this.capital = capital;
}

//
//  Pre-condition: Country Object must be created
//  Post-condition: Set the given string as the language
//
public void setLang(String lang){
  this.lang = lang;
}

//
//  Pre-condition: Country Object must be created
//  Post-condition: Set the given string as the image file
//
public void setimageFile(String imageFile){
  this.imageFile = imageFile;
}

  // Write a toString() method that returns a concatenated String of 3 of the instance variables in a sentence like "..'s capital is .. and its primary language is ..."


//
//  Pre-condition: The object must be created and not instance variable can be null
//  Post-condition: It will print out the what the country is, its capital, and language
//
  public String toString(){
  return "" + name + "'s capital is + capital + and its primary language is " + lang;
}


  
}