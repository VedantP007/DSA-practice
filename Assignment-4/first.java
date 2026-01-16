
// Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
   class func{
        int a,b,c;
        func(int x,int y,int z){
            this.a=x;
            this.b=y;
            this.c=z;
        }
         void max(){
            if(a>b && a>c){System.out.printf("first number (%d) is maximum\n",a);}
            else if(b>c){System.out.printf("second number (%d) is maximum\n",b);}
            else{System.out.printf("Third number (%d)is maximum\n",c);}
        }
        void min(){
            if(a<b && a<c){System.out.printf("First number is (%d)the minimum\n",a);}
            else if(b<c){System.out.printf("Second number is (%d)the minimum\n",b);}
            else{System.out.printf("Third number (%d)is the minimum\n",c);}
        }
    }

public class first{
    public static void main(String[] args) {
        func f1=new func(12, 55, 6);
        f1.max();
        f1.min();
        
        

    }
}