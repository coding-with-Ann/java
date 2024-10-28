package Serialization;
//When we build enterprise apps we often have a need to send an object from one from one application to another application which is deployed on some other machine.
//We might have producer app and consumer app and producer app sends object to consumer app through network lines.
//Object travels through the network in the form of bytes.
//The process of conversion of objects into bytes so that it can travel through the network is called SERIALIZATION.
//The process of converting the byte from network to java object is called DESERIALIZATION.
//To do this in java we use the serializable interface. We have to extend objects from serializable interface.
//We need to tell java that the object can serialize and deserialize on itself.
//The way you tell this to java is letting that object implementing serializable interface.

public class SerializationDemo {

}
