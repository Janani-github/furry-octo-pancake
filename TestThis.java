class A{  
A(){System.out.println("hello a");}  
A(int x){  
this();
System.out.println(x);  
}  
}  
class TestThis{  
public static void main(String args[]){  
A a=new A(10);  
}}  