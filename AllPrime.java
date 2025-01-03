#include <stdio.h>
#include <math.h>

int main() {
    
    double a = 1.0, b = -3.0, c = 2.0; 
    double discriminant, root1, root2;

    
    discriminant = b * b - 4 * a * c;

    
    if (discriminant > 0) {
      
        root1 = (-b + sqrt(discriminant)) / (2 * a);
        root2 = (-b - sqrt(discriminant)) / (2 * a);
        printf("The equation has two real and distinct roots: %.2f and %.2f\n", root1, root2);
    } else if (discriminant == 0) {
        
        root1 = -b / (2 * a);
        printf("The equation has one real and repeated root: %.2f\n", root1);
    } else {
       
        double realPart = -b / (2 * a);
        double imaginaryPart = sqrt(-discriminant) / (2 * a);
        printf("The equation has complex conjugate roots: %.2f + %.2fi and %.2f - %.2fi\n",
               realPart, imaginaryPart, realPart, imaginaryPart);
    }

    return 0;
}
