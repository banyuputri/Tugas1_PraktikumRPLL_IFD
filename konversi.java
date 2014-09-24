import java.util.Scanner;
import java.util.Stack;

class konversi{
	public static void main(String[]args){
		int x,top,data,sisa;
		String lagi;
		
		Scanner scan = new Scanner(System.in);
		Stack biner = new Stack();
		Stack oktal = new Stack();
		Stack heksa = new Stack();

		
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
					oktal.push(sisa);
					
					}
		System.out.print("\n\nBILANGAN OKTAL = ");
				for(top=top; top>=0; top--)
					System.out.print(oktal.pop());
					
					
				data = x;
				top = -1;		
				while(data>0){
					sisa = data % 16;
					data = data/16;
					top++;
					
					if(sisa==10)
						heksa.push("A");
			
					else if(sisa==11)
						heksa.push("B");
				
					else if(sisa==12)
						heksa.push("C");
				
					else if(sisa==13)
						heksa.push("D");
				
					else if(sisa==14)
						heksa.push("E");
				
					else if(sisa==15)
						heksa.push("F");
				
					else 
						heksa.push(sisa);
					}
		
				System.out.print("\n\nBILANGAN HEKSA = ");
				for(top=top; top>=0; top--)					
					System.out.print(heksa.pop());
				
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
