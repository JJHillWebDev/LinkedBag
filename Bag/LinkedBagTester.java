public class LinkedBagTester 
{ 
	public static void main(String[] args) 
	{
		//Holds char array to test characters
		char[] charDemo = {'A', 'B', 'C', 'c','b','a'};

		//Holds string array to test strings
		String[] stringDemo = {"John", "Jon", "johnnny", "jon", "john", 
								"Johnny"};

		//Holds int array to test integers
		int[] intDemo = {16, 5, 10, 8, 14, 25};

		//Holds int array to test beginning middle and end
		int[] intDemoB = {2, 3, 4, 6, 7, 8, 9};

		//Holds double array to test doubles
		double [] doubleDemo = {11.2, 33.5, 0.0, 3.98, 76.0, 8.76};


		//Create a bag to hold characters and test sorted and unsorted
		BagInterface<Character> charBag = new LinkedBag<>();
		System.out.println("Test unsorted character bag:");
		System.out.println();
		testAddCharUnsort(charBag, charDemo);
		charBag.clear();
		System.out.println("Test sorted character bag:");
		System.out.println();
		testAddCharSort(charBag, charDemo);


		//Create a bag to hold strings and test sorted and unsorted
		BagInterface<String> stringBag = new LinkedBag<>();
		System.out.println("Test unsorted string bag:");
		System.out.println();
		testAddStringUnsort(stringBag, stringDemo);
		stringBag.clear();
		System.out.println("Test sorted string bag:");
		System.out.println();
		testAddStringSort(stringBag, stringDemo);


		//Create a bag to hold integers and test sorted and unsorted
		BagInterface<Integer> intBag = new LinkedBag<>();
		System.out.println("Test unsorted integer bag:");
		System.out.println();
		testAddIntUnsort(intBag, intDemo);
		intBag.clear();
		System.out.println("Test sorted integer bag:");
		System.out.println();
		testAddIntSort(intBag, intDemo);


		//Create a bag to hold doubles and test sorted and unsorted
		BagInterface<Double> doubleBag = new LinkedBag<>();
		System.out.println("Test unsorted double bag:");
		System.out.println();
		testAddDoubleUnsort(doubleBag, doubleDemo);
		doubleBag.clear();
		System.out.println("Test sorted double bag:");
		System.out.println();
		testAddDoubleSort(doubleBag, doubleDemo);


		//Create a bag to hold integers & test beginning middle and end insert
		BagInterface<Integer> intBagB = new LinkedBag<>();
		System.out.println("Lets create a simple integer bag: ");
		System.out.println();
		testAddIntSort(intBagB,intDemoB);
		System.out.println("Lets add 1 to the beginning of the bag: ");
		intBagB.add(1, true);
		displayIntBag(intBagB);
		System.out.println("Lets add 5 to the middle of the bag: ");
		intBagB.add(5, true);
		displayIntBag(intBagB);
		System.out.println("Lets add 10 to the end of the bag: ");
		intBagB.add(10, true);
		displayIntBag(intBagB);
	}


	/**
	 *	testAddCharSort adds to the character bag in an ordered manner
	 *	@param bag Character bag interface.
	 *	@param content The characters stored in the bag.
	 */
	private static void testAddCharSort(BagInterface<Character> bag, 
										char[] content)
	{
		System.out.print("Adding to the bag: ");
		for (int index = 0; index < content.length; index++)
		{
			bag.add(content[index], true);
			System.out.print(content[index] + " ");
		} // end for
		System.out.println();
      
		displayCharBag(bag);
	} // end testAdd


	/**
	 *	testAddCharUnsort adds to the character bag in an unordered manner
	 *	@param bag Character bag interface.
	 *	@param content The characters stored in the bag.
	 */
	private static void testAddCharUnsort(BagInterface<Character> bag, 
										  char[] content)
	{
		System.out.print("Adding to the bag: ");
		for (int index = 0; index < content.length; index++)
		{
			bag.add(content[index], false);
			System.out.print(content[index] + " ");
		} // end for
		System.out.println();
      
		displayCharBag(bag);
	} // end testAdd


	/**
	 *	testAddStringSort adds to the string bag in an ordered manner
	 *	@param bag String bag interface.
	 *	@param content The strings stored in the bag.
	 */
	private static void testAddStringSort(BagInterface<String> bag, 
										  String[] content)
	{
		System.out.print("Adding to the bag: ");
		for (int index = 0; index < content.length; index++)
		{
			bag.add(content[index], true);
			System.out.print(content[index] + " ");
		} // end for
		System.out.println();
      
		displayStringBag(bag);
	} // end testAdd


	/**
	 *	testAddStringUnsort adds to the string bag in an unordered manner
	 *	@param bag String bag interface.
	 *	@param content The strings stored in the bag.
	 */
	private static void testAddStringUnsort(BagInterface<String> bag, 
											String[] content)
	{
		System.out.print("Adding to the bag: ");
		for (int index = 0; index < content.length; index++)
		{
			bag.add(content[index], false);
			System.out.print(content[index] + " ");
		} // end for
		System.out.println();
      
		displayStringBag(bag);
	} // end testAdd


	/**
	 *	testAddIntSort adds to the integer bag in an ordered manner
	 *	@param bag Integer bag interface.
	 *	@param content The integers stored in the bag.
	 */
	private static void testAddIntSort(BagInterface<Integer> bag, 
									   int[] content)
	{
		System.out.print("Adding to the bag: ");
		for (int index = 0; index < content.length; index++)
		{
			bag.add(content[index], true);
			System.out.print(content[index] + " ");
		} // end for
		System.out.println();
      
		displayIntBag(bag);
	} // end testAdd


	/**
	 *	testAddIntUnsort adds to the integer bag in an unordered manner
	 *	@param bag integer bag interface.
	 *	@param content The integers stored in the bag.
	 */
	private static void testAddIntUnsort(BagInterface<Integer> bag, 
										 int[] content)
	{
		System.out.print("Adding to the bag: ");
		for (int index = 0; index < content.length; index++)
		{
			bag.add(content[index], false);
			System.out.print(content[index] + " ");
		} // end for
		System.out.println();
      
		displayIntBag(bag);
	} // end testAdd



	/**
	 *	testAddDoubleSort adds to the double bag in an ordered manner
	 *	@param bag Double bag interface.
	 *	@param content The doubles stored in the bag.
	 */
	private static void testAddDoubleSort(BagInterface<Double> bag, 
										  double[] content)
	{
		System.out.print("Adding to the bag: ");
		for (int index = 0; index < content.length; index++)
		{
			bag.add(content[index], true);
			System.out.print(content[index] + " ");
		} // end for
		System.out.println();
      
		displayDoubleBag(bag);
	} // end testAdd


	/**
	 *	testAddDoubleUnsort adds to the double bag in an unordered manner
	 *	@param bag Double bag interface.
	 *	@param content The doubles stored in the bag.
	 */
	private static void testAddDoubleUnsort(BagInterface<Double> bag, 
											double[] content)
	{
		System.out.print("Adding to the bag: ");
		for (int index = 0; index < content.length; index++)
		{
			bag.add(content[index], false);
			System.out.print(content[index] + " ");
		} // end for
		System.out.println();
      
		displayDoubleBag(bag);
	} // end testAdd


	/**
	 *	displayCharBag displays the contents of the char bag
	 *	@param bag Character bag interface with contents.
	 */
	private static void displayCharBag(BagInterface<Character> bag)
	{
			System.out.println("The bag contains " + bag.getCurrentSize() +
		                   " char(s), as follows:");		
			Object[] bagArray = bag.toArray();
			for (int index = 0; index < bagArray.length; index++)
			{
				System.out.print(bagArray[index] + " ");
			} // end for
		
		System.out.println();
		System.out.println();
	}


	/**
	 *	displayStringBag displays the contents of the string bag
	 *	@param bag String bag interface with contents.
	 */
	private static void displayStringBag(BagInterface<String> bag)
	{
			System.out.println("The bag contains " + bag.getCurrentSize() +
		                   " string(s), as follows:");		
			Object[] bagArray = bag.toArray();
			for (int index = 0; index < bagArray.length; index++)
			{
				System.out.print(bagArray[index] + " ");
			} // end for
		
		System.out.println();
		System.out.println();
	}


	/**
	 *	displayIntBag displays the contents of the integer bag
	 *	@param bag Integer bag interface with contents.
	 */
	private static void displayIntBag(BagInterface<Integer> bag)
	{
			System.out.println("The bag contains " + bag.getCurrentSize() +
		                   " integer(s), as follows:");		
			Object[] bagArray = bag.toArray();
			for (int index = 0; index < bagArray.length; index++)
			{
				System.out.print(bagArray[index] + " ");
			} // end for
		
		System.out.println();
		System.out.println();
	}


	/**
	 *	displayDoubleBag displays the contents of the double bag
	 *	@param bag Double bag interface with contents.
	 */
	private static void displayDoubleBag(BagInterface<Double> bag)
	{
			System.out.println("The bag contains " + bag.getCurrentSize() +
		                   " double(s), as follows:");		
			Object[] bagArray = bag.toArray();
			for (int index = 0; index < bagArray.length; index++)
			{
				System.out.print(bagArray[index] + " ");
			} // end for
		
		System.out.println();
		System.out.println();
	}
}