package a_1;

public class Array
{
	private int[] arr;

	public void print(String name)
	{
		System.out.print(name + ":");
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(" " + arr[i]);
		}
		System.out.print('\n');
	}

	public Array(int[] arr)
	{
		this.arr = new int[arr.length];
		for (int i = 0; i < arr.length; i++)
		{
			this.arr[i] = arr[i];
		}

	}

	public Array erzeuge_kopie()
	{
		Array arr2 = new Array(arr);
		return arr2;
	}

	public void nulle_vielfache_von(int a)
	{
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] % a == 0)
			{
				arr[i] = 0;
			}
		}
	}

	public int summe()
	{
		int summe = 0;
		for (int i = 0; i < arr.length; i++)
		{

			summe += arr[i];

		}

		return summe;
	}

}
