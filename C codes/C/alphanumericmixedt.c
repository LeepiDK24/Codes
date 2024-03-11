#include <stdio.h>

int main() {
    int rows = 5;  // Number of rows in the pattern
    
    // Loop through each row
    for (int i = 1; i <= rows; i++) {
        
        // Print numbers or letters based on the row number
        if (i % 2 == 1) {  // For odd rows, print numbers
            for (int j = 1; j <= i; j++) {
                printf("%d ", j);
            }
        } else {  // For even rows, print letters
            char ch = 'A';
            for (int j = 1; j <= i; j++) {
                printf("%c ", ch++);
            }
        }
        
        printf("\n");  // Move to the next line after each row
    }

    return 0;
}