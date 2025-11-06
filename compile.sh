#!/bin/bash
set -e
# Compile Java files with Lombok without Maven

# Create output directory
mkdir -p out

echo "Compiling with Lombok..."
javac -cp lib/lombok-1.18.26.jar src/Car.java src/Main.java -d out/

echo "Compilation successful!"
echo ""
echo "Running Main class..."
java -cp out:lib/lombok-1.18.26.jar Main
