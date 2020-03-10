   // Complete the plusMinus function below.
   static void plusMinus(int[] arr) {
    double positve = 0.0; double negative=0.0; double zero=0.0;
    for(int i = 0; i<arr.length; i++ ){
        if(arr[i]>0){
            positve++;
        }else if (arr[i]<0){
             negative++;
        }else if (arr[i]==0){
            zero++;
        }
         
    }
    System.out.println(positve/arr.length);
    System.out.println(negative/arr.length);
    System.out.println(zero/arr.length);
}