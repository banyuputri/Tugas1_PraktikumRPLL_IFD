import java.util.Scanner;
import java.util.Stack;

class konversi{
	public static void main(String[]args){
		int x,top,data,sisa;
		String lagi;
		
		Scanner scan = new Scanner(System.in);
		Stack biner = new Stack();

		
		boolean konvert = true;
		do{
			System.out.print("\nINPUT BILANGAN DESIMAL POSITIF: ");
			x = scan.nextInt();
			
			if(x>0){					
				data = x;
				top = -1;		
				while(data>0){
					sisa = data % 2;
					data = data/2;
					top++;
					biner.push(sisa);
					}
		
				System.out.print("\nBILANGAN BINNER = ");
				for(top=top; top>=0; top--)
					System.out.print(biner.pop());
					
				
				data = x;
				top = -1;		
				while(data>0){
					sisa = data % 8;
					data = data/8;
					top++;
					
					}
		
				
				boolean ulang = true;
				while(ulang == true){
					System.out.print("\nKONVERSI LAGI?(Y/N): ");
					lagi = scan.next();
			
					if(lagi.equals("y") || lagi.equals("Y"))
						ulang = false;
			
					else if(lagi.equals("n") || lagi.equals("N"))
						return;
		
					else{
						System.out.println("\n=> KESALAHAN DALAM INPUT");
						ulang = true;
						}
					}
					
				}
				
			else
				System.out.println("\n=> KESALAHAN DALAM INPUT");				
			
		}
		while(konvert == true);
		
	}
}