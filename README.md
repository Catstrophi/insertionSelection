# insertionSelection
insertion and selection sorting

For the Insertion sort:
    •What is each loop responsible for?
        The for loop is responsible for going over everything in the array
        The while loop checks if the value is greater, and if so, we shift

    •Describe what’s happening instead of a swap.
        Instead of swapping the values, we are essentially shifting down the array and taking the valOfInterest and
        inserting it at the very front or indx = 0


For the Selection sort:
    •What is each for loop responsible for?
         The first for loop is responsible for the first number, while the second for loop is responsible
         for the number after the first number

    •Where is the swapping algorithm?
         Array.set(arr, min, arr[i]);
         Array.set(arr, i, temp);
         System.out.println(arr);

    •How does the swapping algorithm specifically work? (Is it using indexes, values, etc.)
        for example if we have the values a and b, we would need a third variable c. We will set c = a, a = b, and b = c
            a = 0; b = 1;
            c = a;
            a = b; b = c;
