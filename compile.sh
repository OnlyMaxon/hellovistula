#!/bin/bash
# Compile Java files with Lombok without Maven

echo "Compiling with Lombok..."
javac -cp lib/lombok-1.18.26.jar src/Car.java src/Main.java -d out/

if [ $? -eq 0 ]; then
    echo "Compilation successful!"
    echo ""
    echo "Running Main class..."
    java -cp out:lib/lombok-1.18.26.jar Main
else
    echo "Compilation failed!"
    exit 1
fi
