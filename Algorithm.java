
public class Alg {
	static int startVal;
	static int peak;
	public static void main(String[] args) {
		double TInicio, TFin, tiempo;
		TInicio = System.nanoTime();
		int[] nums={3, 2, 1, 0, 5, 4};
		startVal=nums.length/2;
		findAPeak(nums,startVal);
		TFin = System.nanoTime();
		tiempo = TFin - TInicio; 
		System.out.println("Tiempo de ejecución en milisegundos: " + Math.round(tiempo/1000)+" microsegundos"); 
	}
	private static void findAPeak(int[] nums,int start){
		startVal=start;
		if(startVal>0 && nums[startVal]<nums[startVal-1]){
			findAPeak(nums,startVal-1);
		}else if(startVal<nums.length && nums[startVal]<nums[startVal+1]){
			findAPeak(nums,startVal+1);
		}else{
			peak=startVal;
			System.out.println(peak+ " "+nums[peak]);
		}
	}
}
