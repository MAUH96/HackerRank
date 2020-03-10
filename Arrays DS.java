    // Complete the reverseArray function below.
    static int[] reverseArray(int[] a) {
        for(int x = 0; x<a.length/2;x++){

            int temp = a[x];
            a[x]=a[a.length-x-1];
            a[a.length-x-1]=temp;
        }
        
        return a;
    }