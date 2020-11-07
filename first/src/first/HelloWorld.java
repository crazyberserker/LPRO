package first;

import java.util.Random;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello World");

		int i[] = new int [6];
		int num,l=0;
		Random randomGenerator = new Random();
		
		// gerar
		
		while(l<6)
		{
			num = randomGenerator.nextInt(50);
			for(int j=0; j<6; j++)
			{
				if(i[j] == num)
				{
					num = randomGenerator.nextInt(50);
					continue;
				}
			}
			i[l] = num;
			l++;	
		}
		
		for(int k=0;k<6;k++)
		{
			System.out.println(i[k]);
		}
		System.out.println(" ");
		// ordenar
		int aux=0;
		
		for(int x=0; x<6;x++)
		{
			for(int y=x; y<6;y++)
			{
				if(i[x] > i[y])
				{
					aux=i[x];
					i[x]=i[y];
					i[y]=aux;
				}
			}
		}
		//imprimir
		for(int k=0;k<6;k++)
		{
			System.out.println(i[k]);
		}
	}

}
