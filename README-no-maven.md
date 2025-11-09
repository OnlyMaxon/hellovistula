# Lombok Car Demo - Without Maven

This project demonstrates using Lombok without Maven build tool.

## Prerequisites
- Java 17 or higher
- Lombok JAR file (already included in `lib/lombok-1.18.26.jar`)

## Project Structure
```
.
├── src/
│   ├── Car.java          # Car class with Lombok annotations
│   └── Main.java         # Main class demonstrating equals/hashCode
├── lib/
│   └── lombok-1.18.26.jar # Lombok library
├── compile.sh            # Script to compile and run without Maven
└── README-no-maven.md    # This file
```

## Running Without Maven

### Option 1: Using the compile script (easiest)
```bash
./compile.sh
```

### Option 2: Manual compilation
```bash
# Create output directory
mkdir -p out

# Compile with Lombok
javac -cp lib/lombok-1.18.26.jar src/Car.java src/Main.java -d out/

# Run the program
java -cp out:lib/lombok-1.18.26.jar Main
```

## Expected Output
```
car1.equals(car2): true
car1.hashCode(): 675751642
car2.hashCode(): 675751642
car1: Car(brand=Toyota, model=Corolla, productionYear=2020, plate=ABC-123)
car2: Car(brand=Toyota, model=Corolla, productionYear=2020, plate=ABC-123)
```

## How It Works

The Car class uses Lombok annotations:
- `@Data` - Generates getters, setters, toString, equals, and hashCode
- `@AllArgsConstructor` - Generates constructor with all fields

The Main class creates two Car objects with identical values and demonstrates:
- `equals()` returns `true` (comparing by field values)
- `hashCode()` returns the same value for both objects

## With Maven (Alternative)

If you prefer using Maven, run:
```bash
mvn clean compile
java -cp target/classes Main
```
