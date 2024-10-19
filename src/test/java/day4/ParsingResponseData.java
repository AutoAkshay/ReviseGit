package day4;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import groovy.util.logging.Log;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ParsingResponseData {
	
	public static void main(String[] args) {

        
        String str="akshay anil kalam";
        
        char[] str2=str.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:str2){
          map.put(ch,map.getOrDefault(ch,0)+1);
//          System.out.println("Pass");
        }
        
       for (Map.Entry<Character,Integer> entry : map.entrySet()) {
    	   if(entry.getValue()>=2){
               System.out.print(entry.getKey()+"::"+entry.getValue());
           }
		System.out.println();
	}
	}
}
