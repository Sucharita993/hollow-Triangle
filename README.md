# hollow-Triangle
Creation of hollow triangle
Here we have created a 6 row hollow triangle with \* symbol with the for loop<br>
The first for loop is for row creation
```java
 for(int i=1;i<=n;i++)
 ```
 The second for loop is for column
 ```java
 for(int j=1;j<=m-1;j++)
 ```
 The third for loop is for display of \*
 ```java
  for(int k=1;k<=2*i-1;k++)
  ```
  Since we are creating a hollow pyramid we take onlt first column and last column into consideration<br>
  And also the last row.
  ```java
  if(k==1 || (k==2*i-1 || i==n))
                System.out.print("*");
   ```
   All the remaining elements of the rows and columns are left empty
   ```java
else
                System.out.print(" ");
```
A new line is started after every row
```java
 System.out.print("\n");
 ```
OUTPUT
<img width="674" alt="Screenshot 2021-05-18 080213" src="https://user-images.githubusercontent.com/84003518/118581528-69602300-b7af-11eb-9b64-453a18570e3c.png">
