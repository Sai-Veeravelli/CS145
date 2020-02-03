// this is the main class
public class HelloWorld {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
    	HelloWorld obj = new HelloWorld();
    	System.out.println(obj.getGreeting());
    }
}
