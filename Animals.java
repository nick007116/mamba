interface Animals
{
public abstract void moves();
}
interface Birds
{
void fly();
}
public class Interface Demo implements Animals,Birds;
}
public void moves()
{
System.out.println("Animals moves on Land");
}
public void fly()
{
System.out.println("Birds fly in Air");
}
public Static void main(String args[])
{
Interface Demo id=new Interface Demo();
id moves();
 id fly();
}
}