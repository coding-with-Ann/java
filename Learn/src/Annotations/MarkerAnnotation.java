package Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//The syntax of custom annotation is access modifier @interface annotationName 
//@interface is used to create custom annotation.
//We have to tell the compiler when to execute these annotations
//RetentionPlicy.Runtime is applied at runtime and if it is source then it will be applied at compile time.
//The second thing we need to provide is where the annotation is going to be applied.
//For this we use @Target(ElementType.TYPE)
//Type denotes weather we want to apply this annotation to a class, constructor or a member variable etc.
//These marker annotations doesn't have any logic. we wont get much value out of it until you have very special cases.
//
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface MarkerAnnotation {

}
