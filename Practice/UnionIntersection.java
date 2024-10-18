public class UnionIntersection {
    public static void main(String args[]){
        int a[]={1,2,3,4,5};
        int b[]={5,6,7,8,9};
        int n=a.length;
        int m=b.length;
        System.out.print( "Intersecton : ");
        if(a[n-1]<b[0]){
            System.out.print("[ 0 ]");
        }
        else if(a[n-1]==b[0]){
            System.out.print("[ "+a[n-1]+" ]");
        }
        else{
            int z[]=new int[n+m];
            int c=0;
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(a[i]==b[j]){
                        z[c]=a[i];
                        c++;
                    }
                    else{
                        continue;
                    } 
                }
            }
            System.out.print("[ ");
            for(int k=0;k<c;k++){
                System.out.print(z[k]+" ");
            }
            System.out.print(']');
        }
        System.out.println( "Union : ");
        int y[]=new int[n+m];
        if(n<m){
            for(int i=0;i<n;i++){
                for(int j=0;j<i;j++){
                    if(a[i]==y[j]){
                        continue;
                    }
                    y[i]=a[i];
                }
            }
            for(int i=n;i<m;i++){
                for(int j=0;j<n;j++){
                    if (b[i]==y[j]) {
                        continue;
                    }
                    y[i]=b[i];
                }
            }
        }
        else{
            for(int i=0;i<m;i++){
                for(int j=0;j<i;j++){
                    if(b[i]==y[j]){
                        continue;
                    }
                    y[i]=b[i];
                }
            }
            for(int i=m;i<n;i++){
                for(int j=0;j<m;j++){
                    if (a[i]==y[j]) {
                        continue;
                    }
                    y[i]=a[i];
                }
            }
        }
        System.out.print("[ ");
            for(int k=0;k<n+m;k++){
                System.out.print(y[k]+" ");
            }
            System.out.print(']');
    }
}
