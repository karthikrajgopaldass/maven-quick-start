package clinic.programming.training;

public class Application {
    
    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
	Application app = new Application();
    }
    
    
    public int countWords(String str){
        if(str == null || str.isEmpty())
            return 0;

        int count = 0;
        for(int e = 0; e < str.length(); e++){
            if(str.charAt(e) != ' '){
                count++;
                while(str.charAt(e) != ' ' && e < str.length()-1){
                    e++;
                }
            }
        }
        return count;
    }
}