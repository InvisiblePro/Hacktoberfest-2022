#include <stdio.h>


void main()
{	
	int a[100];
	int i,n,j,t;
	char k;
	printf("enter l or r\n");
	scanf("%c",&k);
	
	printf("enter no.of elements\n");
	scanf("%d",&n);
	
	printf("Enter the elements\n");
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
    printf("The elements are\n");
	for(j=0;j<n;j++)
	{
		printf("%d ",a[j]);
	}
	printf("\n");
	printf("entre no.of times to rotate\n");
	scanf("%d",&t);
	if (k=='l')
	{	
	int p,i,m,j,b;
	for(i=0;i<t;i++)
	{
		for(j=0;j<n-1;j++)
		{
			m=a[j];
			a[j]=a[j+1];
			a[j+1]=m;
			
		}
	}
	for(b=0;b<n;b++)
	{
		printf("%d\t",a[b]);
	}
	

	}
	else
	{	
	int p,i,m,j,b;
	for(i=0;i<t;i++)
	{
		for(j=n-1;j>0;j--)
		{
			m=a[j];
			a[j]=a[j-1];
			a[j-1]=m;
			
		}
	}
	for(b=0;b<n;b++)
	{
		printf("%d\t",a[b]);
	}



	}
}

