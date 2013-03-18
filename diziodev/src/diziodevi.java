import java.util.Arrays;

import javax.swing.JOptionPane;

public class diziodevi{

	public static void main(String[] args) {
		String slenArray = JOptionPane.showInputDialog(null, " kaç elemanlı dizi olsun:");

		int lenArray = Integer.parseInt(slenArray);

		Integer aList[] = new Integer[lenArray];

		for (int i = 0; i < lenArray; i++) {
			String item = JOptionPane.showInputDialog(null, "dizi elemanı gir: ");
			aList[i] = Integer.parseInt(item);
		}

		JOptionPane.showMessageDialog( null, "dizimiz bu: " + Arrays.toString(aList));

		int average = avr(aList); 
		JOptionPane.showMessageDialog(null,"dizinin ortalaması: " + average);

		Integer[] minList = kbSort(aList); 

		JOptionPane.showMessageDialog( null, "küçükten büyüğe dizi: " + Arrays.toString(minList) +	"\n" + "en küçük eleman: " + minList[0]);

		Integer[] maxList = bkSort(aList); // 
		JOptionPane.showMessageDialog( null, "büyükten küçüğe dizi: " + Arrays.toString(maxList) +"\n" + "en büyük eleman: " + maxList[0]);
	}

	public static int avr(Integer[] aList) {
		int totaly = 0;
		for (int i = 0; i < aList.length; i++) {
			totaly = totaly + aList[i];  
		}
		return totaly / aList.length;
	}

	public static Integer[] kbSort(Integer[] aList){ 
		  int arrLen = aList.length;
		  int inc = arrLen/2;
		  while(inc > 0){
		    for(int i = inc; i < arrLen; i++){
		      int tmp = aList[i];
		      int j = i;
		      while(j >= inc && aList[j - inc] > tmp){
		        aList[j] = aList[j - inc];
		        j = j - inc;
		      }
		      aList[j] = tmp;
		    }
		    inc = (inc / 2);
		  }
		  return aList;
		}

	public static Integer[] bkSort(Integer[] aList) { 

		kbSort(aList);

		for(int i = 0; i < aList.length / 2; i++)
		{
		    int tmp = aList[i];
		    aList[i] = aList[aList.length - i - 1];
		    aList[aList.length - i - 1] = tmp;
		}
		return aList;
	}
}