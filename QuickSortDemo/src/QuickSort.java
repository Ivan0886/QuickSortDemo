/**
 * @author Ivan0886
 * Class QuickSort
 * Clase que ordena mediante el algoritmo de ordenación "QuickSort" distintos arrays
 */
public class QuickSort 
{
	public static void qsort(char[] items) 
	{
		qsChar(items, 0, items.length - 1);
	}

	
	public static void qsort(int[] items) 
	{
		qsInt(items, 0, items.length - 1);
	}

	
	/**
	 * @param items
	 * @param izquierda
	 * @param derecha
	 * Método que ordena un array de tipo char y lo muestra ordenado
	 */
	private static void qsChar(char[] items, int izquierda, int derecha) 
	{
		int i = izquierda, j = derecha;
		char y, x = items[(izquierda + derecha) / 2];

		do 
		{
			while ((items[i] < x) && (i < derecha)) 
			{
				i++;
			}

			while ((x < items[j]) && (j > izquierda)) 
			{
				j--;
			}

			if (i <= j) 
			{
				y = items[i];
				items[i] = items[j];
				items[j] = y;
				i++;
				j--;
			}
		} while (i <= j);

		if (izquierda < j) 
		{
			qsChar(items, izquierda, j);
		}

		if (i < derecha) 
		{
			qsChar(items, i, derecha);
		}
	}

	
	/**
	 * @param items
	 * @param izquierda
	 * @param derecha
	 * Método que ordena un array de tipo int y lo muestra ordenado
	 */
	private static void qsInt(int[] items, int izquierda, int derecha) 
	{
		int y, i = izquierda, j = derecha, x = items[(izquierda + derecha) / 2];

		do 
		{
			while ((items[i] < x) && (i < derecha)) 
			{
				i++;
			}

			while ((x < items[j]) && (j > izquierda)) 
			{
				j--;
			}

			if (i <= j) 
			{
				y = items[i];
				items[i] = items[j];
				items[j] = y;
				i++;
				j--;
			}
		} while (i <= j);

		if (izquierda < j) 
		{
			qsInt(items, izquierda, j);
		}

		if (i < derecha) 
		{
			qsInt(items, i, derecha);
		}
	}
}