package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//annotationa can be used for anything in java
//class
//interface
//method
//fields
//constructors
//parameters
//enums
//everything in java

//we can have userdefined annotation alsooo

@Target(ElementType.TYPE)//it is mandatory to specify target
@Retention(RetentionPolicy.RUNTIME)//it is also mandtory to specify retention while creating user defined annotations
@interface Cricket{
	String name() default "kohli";//this is one waay of assigning the value 
	int score() default 20000;//in annotations
	
	int id();
	String Bat();
}

@Cricket(id=17,Bat="MRF")//this is another way of assiginin the values to annotations
class virat{
	
}


@FunctionalInterface
interface function{
	void delete();
	
}

public class LaunchAnnotation1 {

}
