/**
 * @author Ivan0886
 * Class QuickSortDemo
 * App que muestra un ejemplo de ordenación (int y char)
 */
public class QuickSortDemo 
{
	public static void main(String[] args) 
	{
		char[] items = { 'g', 'k', 'c', 'z', 'a' };
		int[] items2 = { 6, 3, 9, 1, 10, 3 };

		QuickSort.qsort(items);
		QuickSort.qsort(items2);

		for (char item : items) 
		{
			System.out.println(item);
		}

		for (int item : items2) 
		{
			System.out.println(item);
		}
	}
}