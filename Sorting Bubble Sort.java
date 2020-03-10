    // Complete the countSwaps function below.
    static void countSwaps(int[] a) {
        int swaps=0;

        boolean isSorted=false;
        while(!isSorted){
            isSorted=true;//base condition to break once is sorted
            for(int i=0;i<a.length-1;i++){
                if(a[i]>a[i+1]){
                    int temp = a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                    swaps++;
                    isSorted=false;
                }
            }

        }
        
        System.out.println("Array is sorted in "+swaps+" swaps.");
        System.out.println("First Element: "+a[0]);
        System.out.println("Last Element: "+a[a.length-1]);
    }