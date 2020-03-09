
public class A {
private State s;

A()
{
	s=null;
}
public void setState(State s){
    this.s = s;		
 }

 public State getState(){
    return s;
 }
}
