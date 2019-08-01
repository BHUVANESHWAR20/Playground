#include<stdio.h>
int main()
{
float r,angle,arclength;
scanf("%f%f",&r,&angle);
arclength=2*3.14*(angle/360)*r;
printf("%.2f",arclength);
return 0;
}