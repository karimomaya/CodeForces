import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 *
 * @author Kareem
 */
public class CodeForce {

    static String[] input= new String[4];
    static char[][] inputchar = new char[4][4];
    
    public static void main(String[] args) {
        // TODO code application logic here
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        readInput();
        boolean result = happpyScenario();
        if (!result)
            result = testInput();
        
	if (result) {
            out.write("YES");
	}
	else {
            out.write("NO");
	}
        out.close();
    }
    public static void readInput() {
        Scanner sc = new Scanner(System.in);
	for (int i=0; i<4; i++) {
            input[i] = sc.next();
            char[] r2=input[i].toCharArray();
            for (int j=0; j<4; j++){
                inputchar[i][j] = r2[j];
            }
	}
        
        
    }
    
    public static boolean happpyScenario(){
        for(int i=0; i<4; i++) {
            for (int j=0; j<4; j++) {
                int result = 0;
                
		if (i+1 < 4 && j +1 <4 ) {
                    result = (inputchar[i][j]==(inputchar[i][j+1]))? 1:0 ;
                    result += (inputchar[i][j]== inputchar[i+1][j])? 1:0 ;
                    result += (inputchar[i][j]==(inputchar[i+1][j+1]))? 1:0 ;
                                      	
                }
                               
                    
                if (result == 3) 
                    return true;
                                
            }
	}
	return false;
    }
	
    public static boolean testInput() {
        for(int i=0; i<4; i++) {
            for (int j=0; j<4; j++) {
                
                char checker = inputchar[i][j];
                if (checker == '#'){
                    checker = '.';
                }
                else {
                    checker = '#';
                }
		if (i+1 < 4 && j +1 <4 ) {
                    
                    
                    if ((checker==(inputchar[i][j+1]))
                            && (checker== inputchar[i+1][j]) 
                            && (checker==(inputchar[i+1][j+1]))){
                        return true;
                    }
                                      	
		}
                if ( j -1 >=0 && i+1 <4){
                    if ((checker==(inputchar[i+1][j])) && (checker== inputchar[i+1][j-1]) && (checker==(inputchar[i][j-1]))){
                        return true;
                    }
                }
                               
               
                                
            }
	}
	return false;
    
    }
    
}



