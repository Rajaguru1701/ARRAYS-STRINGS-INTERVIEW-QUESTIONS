int[] arr = {5,4,1,3,8,6,7};
int totalSum = 0;
int leftSum = 0;
for(int i: arr)
{
  totalSum+=i;
}
int idx = 0;
for (int i = 0; i < arr.length; i++) {
  totalSum-=arr[i];
  if(totalSum != leftSum)
  {
    leftSum+=arr[i];
  }
  else {
    idx=i;
  }
}
System.out.println(idx);
