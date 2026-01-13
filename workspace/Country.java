public class Country
{
  // add private instance variables for the name, capital, language, and image file.
private String name;
private String capital;
private String lang;
private String imageFile;

  // add constructors
public Country(){
  name = "";
  capital = "";
  lang = "";
  imageFile = "";
}

public Country(String name, String capital, String language, String imageFile){
  this.name = name;
  this.capital = capital;
  lang = language;
  this.imageFile = imageFile;
}

  // Write accessor/get methods for each instance variable that returns it.
//getters
public String getName(){
  return name;
}

public String getCapital(){
  return capital;
}

public String getLang(){
  return lang;
}

public String getimageFile(){
  return imageFile;
}


//setters
public void setName(String name){
  this.name = name;
}

public void setCapital(String capital){
  this.capital = capital;
}

public void setLang(String lang){
  this.lang = lang;
}

public void setimageFile(String imageFile){
  this.imageFile = imageFile;
}

  // Write a toString() method that returns a concatenated String of 3 of the instance variables in a sentence like "..'s capital is .. and its primary language is ..."
public String toString(){
  return "" + name + "'s capital is + capital + and its primary language is " + lang;
}


  
}