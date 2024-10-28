package Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) 
@Retention(RetentionPolicy.RUNTIME)
//Retention policy is runtime it means this will be processed at runtime.
public @interface MyCumstomAnnotation { //This annotation can only be applied to methods because the target element type is a method.
	int value();

}
..................incomplete
