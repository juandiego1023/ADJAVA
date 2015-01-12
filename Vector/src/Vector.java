
public class Vector {

	public static void main(String[] args) {
		
	}
	
	public static int minVector(int[]v){
				
		int minValue=v[0];
		for(int i=1;i<v.length;i++){
			if(v[i]<minValue){
				minValue=v[i];
			}
		}
		return minValue;
		}
}
