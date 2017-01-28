package com.datalex.technical;

public class WordGame {
  public boolean validate(String initial, String target) {
    if(initial.length() > target.length()){
      return false;
    }
    if(initial.equals(target)){
      return true;
    }
    String A = initial + "A";
    String B = new StringBuilder(initial + "B").reverse().toString(); 
    return validate(A,target) | validate(B,target);  
  }
}
