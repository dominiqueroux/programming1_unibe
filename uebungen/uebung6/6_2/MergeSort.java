/* ************************************************************************** *\
*                     Programmierung 1 HS 2016                                 *
*                            Aufgabe 6-2									   *
*						Dominique Roux 16-100-661							   *
*						Marc Bachofner 15-135-916							   *
\* ************************************************************************** */

public class MergeSort {
	
	//creates a temporary Array to store values and throws the two arrays with their borders into the mergeSort-method 
	public static void sort(Comparable[] array) {
        
		Comparable[] temporaryArray = new Comparable[array.length];
		mergeSort(array, temporaryArray,  array.length-1,  0);
		
    }

	
	// splits the arrays in half and acts recursive with the halfs:
	// one half with borders smallest index to middle, the other half with borders middle+1 to highest index
	// as soon as there is no half left (downEnd < highEnd), the merging starts
    public static void mergeSort(Comparable[] array, Comparable[] temporaryArray, int highEnd, int downEnd) {
        
		if( downEnd < highEnd )
		{
			
			double tempMiddle = (downEnd + highEnd) * 0.5; 
			int middle = (int) tempMiddle; //calculate middle of array
			
			mergeSort(array, temporaryArray, middle, downEnd);
			mergeSort(array, temporaryArray, highEnd, middle + 1);
			merge(array, temporaryArray, downEnd, middle + 1, highEnd);
		}
    }

	// takes the borders of the array (downEnd, highEnd) and the real (not simply of this special half) border of the array on the right side
	// then the elements of the arrays get compared to look for the correct Reihenfolge
    public static void merge(Comparable[ ] array, Comparable[ ] temporaryArray, int downEnd, int highEnd, int rightEnding) {
		
		int leftEnding = highEnd - 1;
        int leftJumper = downEnd;
        int numIndices = rightEnding - downEnd + 1;

        while(downEnd <= leftEnding && highEnd <= rightEnding) {
			if(array[downEnd].compareTo(array[highEnd]) <= 0) {
				temporaryArray[leftJumper] = array[downEnd];
				downEnd++;
			}
			else {
				temporaryArray[leftJumper] = array[highEnd];
				highEnd++;
			}
			leftJumper++;
		}
		
        while(highEnd <= rightEnding) {
            temporaryArray[leftJumper] = array[highEnd];
			leftJumper++;
			highEnd++;
		}
		
		while(downEnd <= leftEnding) {
            temporaryArray[leftJumper] = array[downEnd];
			leftJumper++;
			downEnd++;
		}
		
        // puts the values of temporaryArray in array
        for(int i = 0; i < numIndices; i++) {
            array[rightEnding] = temporaryArray[rightEnding];
			rightEnding--;
		}
    }
}

