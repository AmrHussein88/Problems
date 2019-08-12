package problems;

public class Clouds {

	static int jumpingOnClouds(int[] c) {
        int jumps = 0;
    for(int i = 0; i<c.length-1;i++){
    
    if(i<c.length-2 && c[i] == 0 && c[i+2] == 0){
    jumps++;
    i++;
    }
    else if(c[i] == 0){
        jumps++;
    }
    
}
    return jumps;
    }
	public static void main(String[] args) {
int [] c = {0,0,1,0,0,0,0,1,0,0,0,0,1,0,0,0,0,0,1,0,1,0,0,0,1,0,0,1,0,0,0,1,0,1,0,0,0,0,0,0,0,0,1,0,0,1,0,1,0,0};
System.out.print(jumpingOnClouds(c));
	}

}
