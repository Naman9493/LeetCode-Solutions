class Multiply_Strings_0043 {
    public String multiply(String num1, String num2) {
        if(num1.equals("0")||num2.equals("0")){
            return "0";
        }
        int m=num1.length();
        int n=num2.length();
        int arr[]=new int[n+m];
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                int mul=(num1.charAt(i)-'0')*(num2.charAt(j)-'0');
                int temp=mul+arr[i+j+1];
                arr[i+j+1]=temp%10;
                arr[i+j]+=temp/10;
            }
        }        
        StringBuilder ans=new StringBuilder();
        for(int x:arr){
            if(ans.length()==0&&x==0)continue;
            ans.append(x);
        }
        
        return ans.toString() ;
    }
}