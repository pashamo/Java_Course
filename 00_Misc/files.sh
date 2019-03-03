#!/bin/bash

echo "Creating files..."
for i in {14..28}
do
#    echo '/**/
#    public class codingExercise'$i' {
#      public static void main(String[] args) {
#        System.out.println("-----codingExercise'$i'-----");
#        System.out.println("-----END-----");
#      }
#    }' > "codingExercise$i.java"
    echo "codingExercise$i.java created"
done
echo "Files Created."
