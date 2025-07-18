 class classin {
     public static void main(String[] args) {
int n=16,rem=0,mat;
if(n==1){
    mat=(int)Math.pow(2,n-1);
}
else if(n>1){
     rem=n/4;
     mat=(int)Math.pow(2,rem);
}
     else if(n==mat){
             return true;
         }

         return false;


     }
 }


































